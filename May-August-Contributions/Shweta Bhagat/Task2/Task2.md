

# Task 2: Design an app for the project based on the malaria Screener model


## Project: Improve diagnostics of typhoid through Open Science: An Artificial Intelligence-based technique.


## Contents

- [Objective](#objective)

- [Introduction](#introduction)
 
- [Why this Project](#why-this-project)

- [Proposed Solution](#proposed-solution)

- [Architecture of Web-Application](#architecture-of-web-application)

- [Features](#features)

- [Device Compatibility](#device-compatibility)


## Objective:

One of the ultimate goals of the project is to come up with a complete tool for the diagnosis of typhoid fever integrating features for wide and easy adoption and use, so as to reduce deaths caused by Typhoid Fever.
The aim is to make an application that can be used from the smartphone and to utilize the high-resolution camera and powerful computing power of modern smartphones to screen for the presence of salmonella species using blood, urine, and stool samples and skin rash images automatically. Such that  Screener combines image acquisition,  image analysis, and result visualization in its slide screening process, and is equipped with a database to give both app users and researchers easy access to the acquired data by making the screening process faster, more consistent, and less dependent on human expertise.


## Introduction

### What is Typhoid?

Typhoid fever is a bacterial infection that can spread throughout the body, affecting many organs. It is one of the major life-threatening diseases, accounting for the death of millions of people every year mainly in the Indian Subcontinent, Africa, South and Southeast Asia, and South America.
Typhoid is an infection caused by the bacterium Salmonella typhimurium (S. Typhi). Animals do not carry this disease, so transmission is always human to human. It can lead to a high fever, diarrhea, and vomiting and be fatal.


### Symptoms

The symptoms of typhoid fever usually begin between 6 and 30 days after exposure to Salmonella typhi bacteria.

The main symptoms of typhoid fever are:

- Fever: A persistent high temperature that gradually increases each day up to 104 degrees Fahrenheit or 39 to 40 degrees Celsius.

- Extreme tiredness (fatigue)

- Weakness

- Diarrhea and Vomiting
 
 Later, when the infection increases we may lose our appetite and get affected by diarrhea

- Skin rash

The rash, which does not affect every patient, consists of rose-colored spots, particularly on the neck and abdomen.

- Constipation

- Stomach Pain

- Muscle aches




### Causes

Typhoid fever is caused by the bacteria Salmonella typhi.

The major causes of Typhoid Fever include:- 

- Consumption  of contaminated foods

- Drinking contaminated water

- Washing fruits and vegetables in contaminated water.

- Lack of proper sanitation and hand washing

- Close contact with an infected person.

- By urine and feces of an infected person

- using a toilet contaminated with bacteria 


### Complications 

- internal bleeding in the digestive system
- splitting of a section of the digestive system, which spreads the infection to nearby tissue





##  Why this Project?

Quick and accurate diagnosis is something that cannot be neglected in the medical field. The large number of deaths associated with typhoid fever is a result of many factors which include: poor diagnosis, self-medication, shortage of medical experts, and insufficient health institutions. 
The diagnosis of tropical diseases involves several levels of uncertainties. Patients cannot tell exactly how they feel, doctors and nurses cannot tell exactly what they observe, and laboratories’ results may have errors caused either by the carelessness of the technicians or malfunctioning instruments. All these complexities in medical practices make traditional quantitative approaches to analysis inappropriate. 
This leads to the need for the development of a Typhoid Diagnosis System that can be used by anyone at any time for a quick diagnosis of the disease. As Artificial Intelligence(AI) offers methods and techniques with the potential of solving difficult tasks in medical domains.


## Description of the data set
Data on typhoid fever cases can be collected by using the [Data Collection tool](https://docs.google.com/forms/d/1tYL-KQ2oh2MZWaSxaOEOwFexbKg_ErIEbDT41_i2LJs/edit?usp=sharing). It can be done in form of a survey, questionnaire, or interview. The Dataset will include the various symptoms and images of the people who are affected by typhoid. These images can include the image of skin rash. The records of patients diagnosed to have typhoid fever can be carefully selected and examined with explanations from medical practitioners on the symptomatic diagnosis of typhoid fever. Typhoid Fever has some symptoms in common with other diseases like malaria, however, we can use a combination of some symptoms that could be used to differentiate typhoid from other diseases.



## Proposed Solution

- We will make an application that will be used by anyone, at any time either from their smartphones.
- We will use Convolutional Neural Networks (CNNs), the most popular neural network model for the classification of the images. 
- We will use  Decision Tree Classifier, a  Machine Learning Algorithm for training the images followed by classifying them and analyzing data, and prior to that, we will do Exploratory Data Analysis to get insights from the data.
- Angular will be used as a front-end framework for developing the  web application which will present visualized and well-organized pages and MySQL will be used in  the back end


## Architecture of Web-Application 

#### Font-end

It has the various sections built using Angular : 

#### 1. User log in Interface

This gives the old user opportunity to log in and the new users to create a new account by using the appropriate username and password.

After successful login or creation of a new account, the dashboard appears.

#### 2. Dashboard

Here the patient’s Registration number and personal information are entered.

#### 3. Data Section

This is the section where the users will select the necessary symptoms that they are facing from the lists of symptoms given on the page. There they can also upload images of skin rash.

#### 4. Results 

This is the section where the visualized graphs will be displayed and if typhoid fever is diagnosed, the degree of severity is displayed along with the disease name, otherwise, the patient is advised to see a medical doctor for the possibility of another disease.

#### 5. Contact us

This is the section where the users can find a  box where they will write their queries and will reach out to us.



## Features

- Users can update the existing profile

- Users can update the login credentials

- Users can Register and view the registered details

- They can upload images(like images of skin rash)

- Users can view the results

- Users can ask their queries from the contact us section

- If the severity of the disease is high they will be displayed a message to contact the nearby medical immediately.
 
 

## Device Compatibility

- Android - API Level 21+ (Lollipop 5.0+)
