pipeline {
  agent {
    docker { image 'openjdk:8' }
    }
    stages {
        stage('---clean---') {
          agent {
              docker {
                image 'maven:3-alpine'
                args '-v $HOME/.m2:/root/.m2'
              }
          }
          steps {
                sh "mvn clean install -DskipTests"
            }
        }
        stage('--test--') {
             steps {
                sh "mvn test  "
             }
        }
        stage('--package--') {
            steps {
                sh "mvn clean package -DskipTests  "
                sh "echo myEnvVariable =$myEnvVar"
            }
        }
    }
}
