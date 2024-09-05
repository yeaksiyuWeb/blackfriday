pipeline {
    agent any

    stages {
        stage('Checkout') {
            steps {
                git branch: 'cicd', url: 'https://github.com/yeaksiyuWeb/blackfriday.git'
            }
        }
        stage('Build') {
            steps {
                        powershell './gradlew build'

            }
        }
        stage('Test') {
            steps {
                        powershell './gradlew test'
            }
        }
        stage('Deploy') {
            steps {                
                        powershell 'java -jar build/libs/blackfriday-1.0-SNAPSHOT.jar'
                 }           
        }
    
}

post {
        always {
            junit 'build/test-results/**/*.xml'
        }
    }
}


