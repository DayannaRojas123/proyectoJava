FROM openjdk:21
COPY "./target/proyectoDaya-0.0.1-SNAPSHOT.jar.original" "app.jar"
EXPOSE 8062
ENTRYPOINT [ "java","jar","app.jar" ]