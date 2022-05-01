# Introduction
As part of this task, a typhoid fever diagnostic app is created similar to the Malaria Screener. The general idea is to create a mobile app using smart phone computation power to apply AI and machine learning methodologies to the data collected and smear image uploaded. 
Deep learning models can be applied to smear images to classify a patient as having typhoid fever or not. Data collected from surveys can be subjected to a random forest model. A combination of the results from both models allows for a more consistent, and less reliant on human expertise, diagnosis of typhoid fever. 


# Tools
The tools we need to build the app on are: 
- Android studio
- MySQL Database
- OpenCV Android library (DNN for smear image diagnosis)
- JPMML-Android (RF for survey data)
Additionally, it is proposed to build a web application with similar features in the future.


# Steps of development
- [x] Mobile app feature design
- [ ] Feature implementation in Android app
- [ ] Build database and access portal by app users and researchers
- [ ] Load Machine learning and deep learning models in Android
- [ ] Web application


# Mobile design prototype
As of now, the first step in the development of mobile features has been completed. Here is the design prototype, check [Figma](https://www.figma.com/file/1WznGavoHpwhBkEau2qAAn/Mboalab_purrry). 

The prototype presents four interfaces with the following features: 
- Diagnosis: allowing users to upload smear image of specific patient for AI supported diagnosis
- Survey reports: allowing users to access and edit periodical survey results of each patient
- About us, Support and FAQ
- Profile and settings: here users can manage their account information, patient management and other features
