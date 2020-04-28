# Traffic Congestion Prediction System using Data Mining


## Abstract:

Due to urbanization, there is a rapid growth in number of vehicles on the road resulting in traffic congestion. Traffic congestion is a condition of a segment in the road network where the traffic demand is greater than the available road capacity. In this project, we design a traffic congestion prediction system using data mining so that based on the historic traffic data, it predicts the traffic congestion values for the required locations on a particular day and time interval. This system will be useful for the traffic department officials to plan the control over traffic density on the roads. 

## Problem Statement:

This project is intended to solve following problems:

*	Train a traffic prediction model and use it to forecast traffic.
*	Design the prediction system based on big data, so that it is scalable. 

The problem of traffic congestion prediction has to solve considering both the spatial and the temporal correlations. To make the system highly scalable, Hadoop platform is used to process the big datasets.

## Proposed Solution:

Proposed solution is based on the concept of using both spatial and temporal correlations. In this mechanism, the traffic at a road segment is dependent on the traffic at its neighbouring roads from where the traffic can flow into the road under consideration. So, the neighbour’s traffic data must also be considered to model the traffic at this road, in addition to its temporal data. In other words, the spatial correlations are considered along with the temporal correlations with the help of KNN algorithm to predict the traffic congestions. The proposed solution is about two times more accurate than the existing solutions.

### Objectives:

The objectives of proposed system are given by:

* To develop a Java based GUI application which can be easily used to predict the traffic congestion at the required location, on the specific day and time-interval. 
* To predict the traffic congestion on a road by taking into consideration the spatial and temporal correlations. 
* To forecast the traffic values on the given locations by making use of the K Nearest Neighbour (KNN) Algorithm.
* To project the congestion predictions on a Google Map API by marking the road in red to indicate high traffic and in green to indicate low traffic.

## Implementation:

The project is implemented in Java, and you need to use an IDE such as NetBeans to build & run the application.

Please refer to "Output" folder, which has detailed snapshots on how to run the application, and get the output.

## Conclusion:

A scalable, more accurate and easy to use design and implementation of Traffic Congestion Prediction System using Data Mining is proposed. In order to predict the traffic congestion values accurately, we need to consider both temporal and spatial correlations. In the existing systems, only temporal correlations were considered. The proposed prediction model used in this project takes into consideration both the spatial and temporal correlations. 

By implementing K Nearest Neighbour (KNN) Algorithm, the project accurately predicts the traffic congestion values for the required day and time interval. The algorithm considers the neighbour nodes based on distance and time alone. The predicted values are projected on to the Google Maps API. The road segments marked in red indicate high traffic congestion, and the road segments marked in green indicate low traffic congestion. A performance graph is charted to show the accuracy of the predicted values to the actual values.

In order to show the project is also scalable with big traffic datasets, we have implemented it in Hadoop platform, where the Map Reduce algorithm processes the traffic datasets in the Hadoop Distributed File System (HDFS). The predicted traffic congestion values for the given locations are displayed in the log.

