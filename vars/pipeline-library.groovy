def call(String branch, String credentialsId, String url){

                git branch: "${branch}"
                credentialsId: "${credentialsId}"
                url: "${https://github.com/jasamant2907/saleor.git}"
}


