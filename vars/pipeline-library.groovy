#!/usr/bin/env groovy

def checkout(branch,credentialsId,url){

                git branch: "${branch}"
                credentialsId: "${credentialsId}"
                url: "${https://github.com/jasamant2907/saleor.git}"
}
checkout("master","MyGithub","https://github.com/jasamant2907/saleor.git")
