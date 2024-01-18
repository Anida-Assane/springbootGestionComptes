pipeline{
   agent any
       tools {
           maven "MAVEN"
       }

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
                               nexusUrl: "localhost:8081",
                               groupId: 'org.sid',
                               version: "0.0.1-SNAPSHOT",
                               repository: "checkpoin-cicd",
                               credentialsId: "nexusCredential",
                               artifacts: [
                                   [artifactId: 'compte-service' ,
                                   classifier: '',
                                   file: 'target/compte-service-0.0.1-SNAPSHOT.jar',
                                   type: 'jar']
                               ]
                           )
                       }
               }
     }
   }