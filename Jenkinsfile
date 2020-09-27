pipeline {
  agent any
  stages {
    stage('checkout') {
      steps {
        sh 'git pull https://github.com/PeopleSea/design-pattern-demo.git'
      }
    }

    stage('build') {
      steps {
        sh 'mvn clean package -DtestSkip'
      }
    }

  }
}