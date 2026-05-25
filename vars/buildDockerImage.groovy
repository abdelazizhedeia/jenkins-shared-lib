def call() {
    echo "Building Docker Image"

    sh "docker build -t java-app:v1 ."
}
