#Base image
FROM openjdk:8
#Copy "target/spreading-api.jar" file from the host machine into /opt/app/app.jar docker image
ADD target/circleci-api-demo.war opt/app/app.war
#Directive to be executed
WORKDIR opt/app
#Used port
EXPOSE 8081
#Commands that will be executed in "exec" format when container runs
ENTRYPOINT ["java", "-jar", "app.war"]
