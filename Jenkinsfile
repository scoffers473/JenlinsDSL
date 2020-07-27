pipeline {
      agent any
      stages {
            stage('Init') {
                  steps {
                        echo 'Hi, this iCjris'
                        echo 'We are Starting the Testing'
                  }
            }
            stage('Build') {
                  steps {
                        echo 'Building Sample Maven Project'
                  }
            }
            stage('Deploy') {
                  steps {
                        echo "Deploying in Staging Area"
                  }
            }
            stage('Deploy UAT') {
                  steps {
                        echo "Deploying in UAT Area"
                  }
            }
            stage('Deploy Prod') {
                  steps {
                        echo "Deploying in Production Area"
                  }
            }
      }
      }
}