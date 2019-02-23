#Base image
FROM openjdk:8
#Copy "target/circleci-api.jar" file from the host machine into /opt/app/app.jar docker image
ADD target/cirlceci-demo-0.0.1-SNAPSHOT.jar opt/app/app.war
#Directive to be executed
WORKDIR opt/app
#Used port
EXPOSE 8081
#Commands that will be executed in "exec" format when container runs
ENTRYPOINT ["java", "-war", "app.war"]

ENV myEnvVar="Using DockerFile"
