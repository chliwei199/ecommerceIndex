# Alpine Linux with OpenJDK JRE
FROM openjdk:8-jre-alpine
# copy WAR into image
COPY ecommerceIndex-0.0.1-SNAPSHOT.jar /home/ecommerceIndex-0.0.1-SNAPSHOT.jar
# run application with this command line 
ENTRYPOINT ["/usr/bin/java"]
CMD ["-jar", "/home/ecommerceIndex-0.0.1-SNAPSHOT.jar"]
EXPOSE 8090