pipeline {
    agent any

    tools {
        jdk 'JDK 11'               // Make sure this matches Jenkins JDK installation name
        maven 'Maven 3.8.1'        // Replace with your Maven version name in Jenkins
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
                // If you are using Cucumber or Surefire plugin
                junit '**/target/surefire-reports/*.xml'  // For JUnit/TestNG
                cucumber 'target/CucumberReports/CucumberReport.json'  // If Cucumber plugin is installed
            }
        }
    }

    post {
        always {
            archiveArtifacts artifacts: '**/target/*.ja***

