# Simple Maven example

* WAR created by Maven
* depend on the **Living** jar
* Added jboss-web.xml to override context root to / 

> for tomcat, you can uncomment <finalName>ROOT</finalName> to generate ROOT.war


## How to


> **Pre requisites: install Greeting and Living projects first !**


### Generate war file
```
$ mvn install 
```


### Test WAR file
Copy the war file into your JBoss or Tomcat server 

Access : http://localhost:8080/hello

You should get the message "Human says : Hello"


