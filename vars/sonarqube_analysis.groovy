def call(String SonarQubeAPI, String ProjectName, String ProjectKey){
    withSonarQubeEnv("${SonarQubeAPI}"){
        sh "$SONAR_HOME/bin/sonar-scanner -Dconar.projectName=${ProjectName} -Dsonar.projectKey=${ProjectKey} -X"
    }
}