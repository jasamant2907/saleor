#!/usr/bin/env groovy

def checkout(branch,credentialsId,url){

                git branch: "${branch}"
                credentialsId: "${credentialsId}"
                url: "${https://github.com/jasamant2907/saleor.git}"
}
checkout("master","55ef5675-b09f-4b61-9960-2488af5e38c0","https://github.com/jasamant2907/saleor.git'")
