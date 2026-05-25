def call() {
    echo "Building Java App using Maven"

    sh """
        mvn clean package -DskipTests
    """

    echo "Build finished"
}