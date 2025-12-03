pipeline{
    agentany
    Stages{
        Stage('Compile'){
            echo 'compiling the app'
            bat 'javac Factorial.java TestFactorial.java'
        }
        Stage('Run'){
            echo 'Run the app'
            bat 'java Factorial'
        }
        Stage('Test'){
            echo 'Test the app'
            bat 'java TestFactorial'
        }
        Stage('PackageJar'){
            echo 'Jar file'
            bat 'jar cfm Factorial.java Manifest,txt Factorial.class'
        }
        Stage('Archive artifact'){
            echo 'Artifact'
            bat 'archiveArtifacts Artifact: Factorial.jar'
        }

    }
    Post{
        Success{
            echo 'Pipeline runned Successfully'
        }
        Failure{
            echo 'Pipeline failed to run'
        }
    }
}