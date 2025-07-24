pipeline {
    agent any

    tools {
        jdk 'JDK 11'               // Use the correct names configured in Jenkins
        maven 'Maven 3.8.1'
    }

    environment {
        MAVEN_OPTS = "-Dmaven.test.failure.ignore=false"
    }

    stages {
        stage('Checkout') {
            steps {
                checkout scm
            }
        }

        stage('Build') {
            steps {
                sh 'mvn clean install'
            }
        }

        stage('Run Tests') {
            steps {
                sh 'mvn test'
            }
        }

        stage('Generate Report') {
            steps {
                junit '**/target/surefire-reports/*.xml'
                cucumber 'target/CucumberReports/CucumberReport.json'
            }
        }
    }

    post {
        always {
            archiveArtifacts artifacts: '**/target/*.jar', fingerprint: true
        }
        failure {
            mail to: 'your-email@example.com',
                 subject: "Build Failed in Jenkins: ${env.JOB_NAME} #${env.BUILD_NUMBER}",
                 body: "Check Jenkins for details: ${env.BUILD_URL}"
        }
    }
}
