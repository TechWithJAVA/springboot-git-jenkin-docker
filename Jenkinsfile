pipeline {
  agent none
  stages {
    stage('Maven Install') {
      agent {
        docker {
          image 'maven:3.5.0'
        }
      }
      steps {
        sh 'mvn clean install'
      }
    }
    stage('Docker Build') {
      agent any
      steps {
        sh 'docker build -t 1008986/spring-boot-jenkin-docker-integration-test:latest .'
      }
    }
    stage('Docker Push') {
      agent any
      steps {
        withCredentials([usernamePassword(credentialsId: 'dd6639d8-43bd-4fe3-a4cf-d2db17e52a16', passwordVariable: 'Hapi_yash99', usernameVariable: '1008986')]) {
          sh "docker login -u ${env.dockerHubUser} -p ${env.dockerHubPassword}"
          sh 'docker push 1008986/spring-boot-jenkin-docker-integration-test:latest'
        }
      }
    }
  }
}