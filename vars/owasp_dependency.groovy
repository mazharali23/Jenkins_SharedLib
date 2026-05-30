def call(){
    dependencyCheck additionalArguments: '--scan ./', ocdInstallation: 'OWASP'
    dependencyCheckPublisher pattern: '**/dependency-check-report.xml'
}