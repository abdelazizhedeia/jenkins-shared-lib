def call(String imageName, String tag) {

    def fullImage = "${imageName}:${tag}"

    echo "Building Docker image: ${fullImage}"

    sh """
        docker build -t ${fullImage} .
    """

    echo "Docker build done"
}