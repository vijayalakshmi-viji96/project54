pipeline {
    agent any

    // Optional: uncomment and set JAVA_HOME if your Jenkins needs it
    // environment {
    //     JAVA_HOME = "C:\\Program Files\\Java\\jdk-17"
    //     PATH = "${env.JAVA_HOME}\\bin;${env.PATH}"
    // }

    stages {

        stage('Checkout') {
            steps {
                echo 'Checking out code from Git...'
                checkout scm
            }
        }

        stage('Build & Compile') {
            steps {
                echo 'Cleaning and compiling project...'
                bat 'mvn clean compile'
            }
        }

        stage('Run Tests') {
            steps {
                echo 'Running JUnit tests...'
                bat 'mvn test'
            }
        }

        stage('Package') {
            steps {
                echo 'Packaging project into JAR...'
                bat 'mvn package'
            }
        }

        stage('Post-Build Actions') {
            steps {
                echo 'Build completed successfully!'
                echo 'JAR file is in target/ folder'
                echo 'Test results are in target/surefire-reports/'
            }
        }
    }

    post {
        success {
            echo '✅ Pipeline succeeded!'
        }
        failure {
            echo '❌ Pipeline failed!'
        }
        always {
            echo 'Pipeline finished.'
        }
    }
}
