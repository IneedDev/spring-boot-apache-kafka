# spring-boot-apache-kafka

Install zookeeper-server
Install apache kafka server

.\bin\windows\zookeeper-server-start.bat .\config\zookeeper.properties
.\bin\windows\kafka-server-start.bat .\config\server.properties

start spring application

start consumer listigin on defined in spring app topic:
.\bin\windows\kafka-console-consumer.bat --bootstrap-server localhost:9092 --topic YOUR_TOPIC_DEFINED_SPRING_APP --from-beginning



