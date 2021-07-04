## Dev Mode

To run devmode: 

`mvn spring-boot:run` and then in a different window `mvn gwt:devmode -Pgwt-dev`


## Production
`mvn clean -Pgwt-prod` and then `java -jar target/boot-gwt-0.0.1-SNAPSHOT.jar`