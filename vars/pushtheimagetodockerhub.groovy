def call() {
  echo "Pushing the app in docker Hub."
        withCredentials([usernamePassword('credentialsId':"Docker Hub Cred", passwordVariable:"dockerHubPass", usernameVariable:"dockerhubUser")])
        {
            sh "docker login -u ${env.dockerhubUser} -p ${env.dockerHubPass}"
            sh "docker image tag notes-app:latest ${env.dockerhubUser}/notes-app:latest"
            sh "docker push ${env.dockerhubUser}/notes-app:latest"
        }
}
