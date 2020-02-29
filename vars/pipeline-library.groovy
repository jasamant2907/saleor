def call(String branch, String credentialsId, String url){
stage('test'){
                git branch: "${branch}"
                credentialsId: "${credentialsId}"
                url: "${url}"
}
}



