# apache-kafka
* Apache Kafka is a distributed streaming platform
* Apache Kafka is used to process real time data feeds with high throughput and low latency
* Kafka works based on Publisher and Subscriber model

ex. flights data, sensors data, stocks data, news data etc....

## Difference between Queue & topic
* if producer pushes info to the queue it is available on first in first serve basis
* once any user consumes the info then again it is not possible to get that again(re-fetching not possible) or others can't able to access the info
* But topic is available for all the subcribers untill producer updates it
* multiple users can subscribe for the data at the same time.
* if same user wants again can able to fetch the data from the stream.


