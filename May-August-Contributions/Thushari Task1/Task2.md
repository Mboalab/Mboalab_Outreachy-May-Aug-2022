# TYPHOID SURVEILLANCE: An Android app that automates Typhoid diagnosis

1. [Introduction](#At-A-Glance-Typhoid-Fever)
2. [Problem Analysis](#problem-Analysis)
3. [Proposed System](#Proposed-System)
4. [Features](#features)
5. [Software Requirements](#software-requirements)
6. [Remaining areas of concern](#Remaining-areas-of-concern)


## At A Glance: Typhoid Fever

- Salmonella enterica serotype Typhi germs cause typhoid fever.
- Typhoid fever is spread through the consumption of tainted food or water.
- Typhoid fever can be diagnosed when Salmonella germs are found in stool, urine, or blood cultures.
- Antibiotics are used to treat typhoid fever.
- Poor appetite, headaches, generalised aches and pains, fever, and lethargy are all indications of typhoid fever.
- After the initial sickness, around 3% to 5% of people become carriers of the bacteria.

## Problem Analysis
Typhoid fever is an acute infection caused by the Salmonella enterica serotype Typhi bacterium and is characterised by a high fever. Salmonella paratyphi, a similar bacterium that generally produces a milder disease, can also cause it.  A human carrier deposits the germs in water or food, which subsequently spreads to other people in the vicinity. Salmonella germs infect the small intestine and temporarily enter the circulation after intake of contaminated food or water. The bacteria are transported to the liver, spleen, and bone marrow by white blood cells, where they multiply and reenter the bloodstream. At this point, people begin to experience symptoms, including fever.  Bacteria can infiltrate the gallbladder, biliary system, and bowel lymphatic tissue.
The bacteria make their way into the intestines and can be detected in stool tests. If a test result is unclear, blood or urine samples will be collected to determine the cause. A sample of blood or stool must be tested for Salmonella Typhi or Salmonella Paratyphi to determine whether an infection is typhoid fever or paratyphoid fever. 

## Proposed System
The concept is to create a mobile-based solution for typhoid screening referring the application functions of [Malaria Screener](https://github.com/nlm-malaria/MalariaScreener). The Idea is to use modern smartphones' high-resolution cameras and substantial computational capacity to automatically screen blood sample photos for parasites and contaminated red blood cells. The system will analyze the sample using smear image analysis and result visualization after the user submits his smear image file. The next step is to display the status of the user's screening request and provide the diagnostic. 
It is proposed that the user be able to take the necessary actions based on the test results provided via the mobile app and promptly contact medical personnel. It comes with a database that allows app users, researchers, and medical personnel to easily access the data collected. The method will make diagnosis faster, easier to acquire, and less reliant on human skill, potentially saving countless lives.
The fundamental goal of this project is to provide users with online medical assistance for TYPHOID SURVEILLANCE, which will alter how users approach their personal health care.


## Features
Users can perform the below operations:
-	Registration
-	User profile and personal details
-	Upload files (high resolution picture of the blood or stool sample)
-	Request Status 
-	Diagnosis result and prescription
-	Listed medical centers for typhoid treatments
-	FAQ’s
-	Forum: Preferably a social media community for raising awareness and volunteering

## Software Requirements
-	Development Environment: Android studio
-	Database: SQLite/Firebase
-	Front end: java
-	Back end: XML
 
## Remaining areas of concern
 - Online appointment with nearby doctors
 - Medicine prescription based on severity
