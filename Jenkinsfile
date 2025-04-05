pipeline {
    agent any

    environment {
        SONAR_SCANNER_HOME = 'C:\\sonar-scanner-5.0.1.3006-windows\\bin'
        SONAR_HOST_URL = 'http://localhost:9000'
        SONAR_PROJECT_KEY = 'abdirahim'
        SONAR_LOGIN = 'sqa_4270f49b13a977e9a50daee37e9328b983a217b1'
    }

    stages {
        stage('Checkout Code') {
            steps {
                git branch: 'main', url: 'https://github.com/geedi098/Jenkins.git'
            }
        }

        stage('SonarQube Analysis') {
            steps {
                withSonarQubeEnv('abdirahim') {
                   bat 'C:\\sonar-scanner-5.0.1.3006-windows\\bin\\sonar-scanner -Dsonar.projectKey=abdirahim -Dsonar.sources=src -Dsonar.host.url=http://localhost:9000 -Dsonar.login=sqa_4270f49b13a977e9a50daee37e9328b983a217b1'
                }
            }
        }
    }
}
