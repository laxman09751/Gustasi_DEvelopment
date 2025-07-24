pipeline {
    agent any

    triggers {
        cron('21 23 * * *')  // Run daily at 11:21 PM
    }

    tools {
        jdk 'JDK 11'
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
