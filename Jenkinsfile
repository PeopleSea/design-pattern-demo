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
        sh '''docker -v
docker-compose -v
docker ps
make start-docker-registry
make build-docker-env'''
      }
    }

  }
}