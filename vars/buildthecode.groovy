def call() {
      echo "Building the app in docker."
      sh "docker build -t notes-app:latest ."
}
