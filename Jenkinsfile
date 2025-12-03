pipeline {
    agent any
    stages {

        stage('Compile') {
            steps {
                echo 'Compiling the app'
                bat 'javac Factorial.java TestFactorial.java'
            }
        }

        stage('Run') {
            steps {
                echo 'Running the app'
                bat 'java Factorial'
            }
        }

        stage('Test') {
            steps {
                echo 'Testing the app'
                bat 'java TestFactorial'
            }
        }

        stage('PackageJar') {
            steps {
                echo 'Packaging into JAR'
                bat 'jar cfm Factorial.jar Manifest.txt Factorial.class TestFactorial.class'
            }
        }

        stage('Archive Artifact') {
            steps {
                echo 'Archiving artifact'
                archiveArtifacts artifacts: 'Factorial.jar'
            }
        }
    }

    post {
        success {
            echo 'Pipeline ran successfully'
        }
        failure {
            echo 'Pipeline failed to run'
        }
    }
}


