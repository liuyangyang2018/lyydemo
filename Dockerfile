FROM jdk8_lyy:v1
MAINTAINER lyy
#VOLUME /tmp
COPY target/demo-0.0.1-SNAPSHOT.jar demo-0.0.1-SNAPSHOT.jar
EXPOSE 9001
ENTRYPOINT ["java"," ","-jar","/lyydemo22.jar"]