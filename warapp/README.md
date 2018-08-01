# Simple Maven example

* WAR created by Maven
* depend on the **Living** jar


## How to

### Generate war file
```
$ cd parent
$ mvn clean install 
```


### Test WAR file

```
cd ..
$ java -jar warapp/target/warapp-x.y.z.war
```
Access springboot homepage: http://localhost:8080/
Access app: http://localhost:8080/getmsg

