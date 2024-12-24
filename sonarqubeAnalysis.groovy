def call() {
    withSonarQubeEnv('sonar-server') {
        sh ''' $SCANNER_HOME/bin/sonar-scanner -Dsonar.projectName=yt-clone -Dsonar.projectKey=yt-clone '''
    }
}