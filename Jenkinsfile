pipeline{
   agent any
     stages{
       stage("Message"){
           steps{
              script{
                 echo "hello world!"
              }
           }
       }
       stage("build"){
          steps{
             script{
             bat "mvn package"
             }
          }
       }
       stage('UPLOAD ARTIFACT') {
                       steps {
                           nexusArtifactUploader(
                               nexusVersion: 'nexus3',
                               protocol: 'http',
                               nexusUrl: "http://localhost:8081/",
                               groupId: 'org.sig',
                               version: "2",
                               repository: "checkpoin-cicd",
                               credentialsId: "nexusCredential",
                               artifacts: [
                                   [artifactId: 'compte-service' ,
                                   classifier: '',
                                   file: 'target/vprofile-v2.jar',
                                   type: 'jar']
                               ]
                           )
                       }
               }
     }
   }