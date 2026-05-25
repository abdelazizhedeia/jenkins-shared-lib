def call() {
    echo "Building Java App using Maven (Shared Lib)"

    def mvnHome = tool 'maven-354'

    sh "${mvnHome}/bin/mvn clean package -DskipTests"
}
