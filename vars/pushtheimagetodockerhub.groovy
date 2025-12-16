def call(String projectname, String imagename, String dockerhubuser) {
  echo "Pushing the app in docker Hub."
        withCredentials([usernamePassword('credentialsId':"Docker Hub Cred", passwordVariable:"dockerHubPass", usernameVariable:"dockerhubUser")])
        {
            sh "docker login -u ${env.dockerhubUser} -p ${env.dockerHubPass}"
            // sh "docker image tag ${projectname}:${imagename} ${env.dockerhubUser}/${projectname}:${imagename}"
            sh "docker push ${env.dockerhubUser}/${projectname}:${imagename}"
        }
}
