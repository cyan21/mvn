FROM maven:3.6.1-jdk-8-slim 

RUN apt-get update && \
    apt-get install -y git && \
    rm -rf /var/lib/apt/lists/*

RUN git clone https://github.com/cyan21/mvn.git -b multi-module-jfrog

COPY settings.xml /usr/share/maven/ref/

RUN cd mvn && mvn -f parent/pom.xml install -s /usr/share/maven/ref/settings.xml 

EXPOSE 8099

ENTRYPOINT ["java","-jar", "mvn/warapp/target/warapp-1.0.0.war", "--server.port=8099"]
