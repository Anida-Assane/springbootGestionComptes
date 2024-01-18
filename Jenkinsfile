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
     }
   }