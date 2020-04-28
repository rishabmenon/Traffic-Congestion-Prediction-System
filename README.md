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

