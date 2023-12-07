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
        stage('Deploy'){
            steps{
                sleep(4)
                deploy adapters: [tomcat9(credentialsId: 'TomcatLogin', path: '', url: 'http://localhost:9001')], contextPath: 'Calculadora', war: 'target/Calculadora.war'
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