pipeline{
    agent any
    stages{
        stage('Build'){
            steps{
                sleep(4)
                bat('mvn clean package -DskipTests=true')
            }
        }
    }
};