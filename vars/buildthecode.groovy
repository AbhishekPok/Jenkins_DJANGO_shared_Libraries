def call(String projectname, String imagename, String dockerhubuser) {
      sh "docker build -t "${dockerhubuser}"/"${projectname}":"${imagename}" ."
}
