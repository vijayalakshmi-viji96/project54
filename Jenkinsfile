pipeline {
    agent any

    tools {
        jdk 'JDK11'
        maven 'Maven3'
    }

    stages {
        stage('Checkout') {
            steps { echo 'Code already in workspace' }
        }

        stage('Compile') {
            steps {
                echo 'Compiling code...'
                sh 'mvn clean compile'
            }
        }

        stage('Code Quality') {
            steps {
                echo 'Running Checkstyle...'
                sh 'mvn checkstyle:check'
            }
        }

        stage('Test') {
            steps {
                echo 'Running unit tests...'
                sh 'mvn test'
            }
            post { always { junit '**/target/surefire-reports/*.xml' } }
        }

        stage('Package') {
            steps {
                echo 'Packaging project...'
                sh 'mvn package'
            }
            post { success { archiveArtifacts artifacts: 'target/*.jar', fingerprint: true } }
        }
    }

    post {
        success { echo '✅ Build Completed' }
        failure { echo '❌ Build Failed' }
    }
}
