# Apache-kafka
* Apache Kafka is a distributed streaming platform
* Apache Kafka is used to process real time data feeds with high throughput and low latency
* Kafka works based on Publisher and Subscriber model

ex. flights data, sensors data, stocks data, news data etc....

## Difference between Queue & topic:
* if producer pushes info to the queue it is available on first in first serve basis
* once any user consumes the info then again it is not possible to get that again(re-fetching not possible) or others can't able to access the info
* But topic is available for all the subcribers untill producer updates it
* multiple users can subscribe for the data at the same time.
* if same user wants again can able to fetch the data from the stream.


![image](https://user-images.githubusercontent.com/45785707/169646386-103fa2c8-49af-432d-a51f-3aa2c565db11.png)

## Download the files from below links:
* [Apacke kafka](http://mirrors.estointernet.in/apache/kafka/)
* [Zookeeper](http://mirrors.estointernet.in/apache/zookeeper/stable/)

## Configuation steps:
1. Set Path to ZOOKEEPER in Environment variables upto bin folder
2. Start Zookeeper server using below command from Kafka folder
```
  zookeeper-server-start.bat zookeeper.properties
```

> Note: Above command will available in kafka/bin/windows folder
> 

3. Copy zookeeper.properties and server.properties files from kafka/config folder to kafka/bin/windows folder.
> Note: zookeeper.properties file will be available in kafka/config folder

4. Start Kafka Server using below command from Kakfa folder
```
    Command : kafka-server-start.bat server.properties
```
> Note: server.properties file will be available in config folder (Copied to windows folder)

5. Create Kakfa Topic using below command from kafka/bin/windows folder
```
kafka-topics.bat --create --bootstrap-server localhost:9092 --replication-factor 1 --partitions 1 --topic demo-sbms-topic
```
6. To view created Topics using below command
```
kafka-topics.bat --list --bootstrap-server localhost:9092
```

# Spring Boot integration:
Add below kafka related dependencies in pom.xml
```
<dependency>
	<groupId>org.apache.kafka</groupId>
	<artifactId>kafka-streams</artifactId>
</dependency>
<dependency>
	<groupId>org.springframework.kafka</groupId>
	<artifactId>spring-kafka</artifactId>
</dependency>
<dependency>
	<groupId>com.fasterxml.jackson.core</groupId>
	<artifactId>jackson-databind</artifactId>
</dependency>
```
