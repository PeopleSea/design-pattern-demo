pipeline {
  agent any
  stages {
    stage('checkout') {
      steps {
        sh 'git pull https://github.com/PeopleSea/design-pattern-demo.git'
      }
    }

    stage('check docker install and build env') {
      steps {
        sh '''sh "docker -v"
sh "docker-compose -v"
sh "docker ps"
sh "make start-docker-registry"
sh "make build-docker-env"'''
      }
    }

  }
}