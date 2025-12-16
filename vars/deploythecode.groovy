def call() {
  echo "Deploy the application via dcoker compose"
  sh "docker compose up -d"
}
