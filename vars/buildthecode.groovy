def call(String projectname, String imagename, String dockerhubuser) {
      docker build -t "${dockerhubuser}"/"${projectname}":"${imagename}" .
}
