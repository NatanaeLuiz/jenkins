pipeline{
    agent any
    stages{
        stage('Build'){
            steps{
                sleep(4)
                bat('mvn clean package -DskipTests=true')
            }
        }
        stage('Testes'){
            steps{
                sleep(3)
                bat('mvn test')
            }
        }
        stage('Fim'){
            steps{
                sleep(5)
                bat('echo fim')
            }
        }
    }
};