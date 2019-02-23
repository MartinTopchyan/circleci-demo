pipeline {
    agent {
      dockerfile true
    }
    stages {
        stage('---clean---') {
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
                sh "echo myEnvVariable =  Using DockerFile"
            }
        }
    }
}
