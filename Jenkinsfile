pipeline {
    agent any

    stages {
        stage('Checkout') {
            steps {
                git branch: 'development', url: 'https://github.com/yeaksiyuWeb/blackfriday.git'
            }
        }
        stage('Build') {
            steps {

                        bat 'gradle build'
                
            }
        }
        stage('Test') {
            steps {
                
                        bat 'gradle RunTest'
                  
            }
        }
        stage('Deploy') {
            steps {                
                        bat 'docker build -t blackfriday .'
                        bat 'docker run -i blackfriday'
                 }           
        }
    
}

post {
        always {
            junit 'build/test-results/**/*.xml'
        }
    }
}


