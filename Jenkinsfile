node{
    stage('SCM Checkout'){
        git credentialsId: '2b6f22aa-4a92-43db-be6d-104cba8ffd82', url: 'https://github.com/MartinTopchyan/circleci-demo.git'
    }
    stage('Mvn Package'){
        def mvnHome = tool name: 'maven-3', type: 'maven'
        def mvnCMD = "${mvnHome}/bin/mvn"
        sh "${mvnCMD} clean package"
    }
    stage('Build Docker Image'){
        sh 'docker build -t cognaize/circleci-api:0.0.2-SNAPSHOT .'
    }

    stage('Push Docker Image'){
        withCredentials([string(credentialsId: 'dockerhub', variable: 'dockerhub')]) {
            sh "docker login -u cognaize -p ${dockerhub}"
        }
        sh 'docker push cognaize/circleci-api:0.0.2-SNAPSHOT'
    }
}
