def call(String Project, String ImageTag, String dockerhubuser){
    wihtCredentials([usernamePassword(credentialsId: 'Docker-cred', passwordVariable: 'dockerhubpass', usernameVariable: 'dockerhubuser')]){
        sh "docker login -u ${dockerhubuser} -p ${dockerhubpass}"
    }
    sh "docker push ${dockerhubuser}/${Project}:${ImageTag}"
}