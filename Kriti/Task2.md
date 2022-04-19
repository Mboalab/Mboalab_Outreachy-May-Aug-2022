## Documentation of the app for the project - "Typhoinder"

### Introduction: 

- Typhoid fever, also known as typhoid, is a disease caused by Salmonella serotype Typhi bacteria.
- Symptoms vary from mild to severe, and usually begin six to 30 days after exposure. Often there is a gradual onset of a high fever over several days.
This is commonly accompanied by weakness, abdominal pain, constipation, headaches, and mild vomiting.
Some people develop a skin rash with rose colored spots. In severe cases, people may experience confusion.
Without treatment, symptoms may last weeks or months. Diarrhea may be severe, but is uncommon. 
Other people may carry the bacterium without being affected, but they are still able to spread the disease to others.
- Typhoid is caused by the bacterium Salmonella enterica subsp. enterica serovar Typhi growing in the intestines, peyers patches, mesenteric lymph nodes, spleen, liver, gallbladder, bone marrow and blood.
- Typhoid is spread by eating or drinking food or water contaminated with the feces of an infected person.
Risk factors include limited access to clean drinking water and poor sanitation.
- The ultimate goal of the project is to come up with complete tool for diagnostic of typhoid fever integrating features for wide and easy adoption and use.

### App Prototype:

![Screen 1@1x](https://user-images.githubusercontent.com/75844962/164027622-54aa8c65-9eaa-4cef-9f6b-951bf7b89c64.png)

![Screen 2@1x](https://user-images.githubusercontent.com/75844962/164027644-55181beb-1291-44a7-8a14-52217958e3e5.png)

![Screen 3@1x](https://user-images.githubusercontent.com/75844962/164027653-060e778d-b57e-4313-8f55-73e0b56c2161.png)

![Screen 4@1x](https://user-images.githubusercontent.com/75844962/164027658-7db816aa-02bd-43b0-babf-ae63076b3e5e.png)

This prototye was built using justinmind.
P.S. This prototype is a work in progress, so are the functions of the app - Typhoinder.

### Details of the App - Typhoinder:

- The data is collected using the data collection tool, in this case the following form: [Data Collection Tool](https://www.cognitoforms.com/Kriti1/PatientSurveyTyphoidFeverClinicalData)
- This data includes patients' symptoms both mild and severe. The mild symptoms can be rated on a scale of 1 to 5, hence helping us understand the severity of the disease.
Based on all the data collected using this form we will be able to correctly diagnose the severity of typhoid in the patient.
- After this data is collected in the form, we can export this in the form of .xlsx file.
- This exported file can then be uploaded to the application. And then the ML model takes this new entry to predict the output. In this case the output will be the severity of typhoid in a patient.
- As mentioned we have collected both mild and severe symptoms of every patient, these are stored in the database present in the app for future references. The mild symptom ratings are already in integers (from 1 to 5) which makes it easy to use.
- Thus the output of the Model will be the severity of typhoid on the basis of both mild symptom ratings and severe symptoms shown by the patient.
Hence making it easy for us to treat the patients. 
- Apart from the form data, we also have collected the patients' reports or files. These might conatin handwritten reports by doctors, some imagings or typed reports.
- So we can use Machine Learning techniques such as OpenCV, OCR, etc to read and extract data from the reports that can be further used to give a more accurate diagnosis.
- The app will also contain a page with FAQs and various other information for both patients and doctors on typhoid. It will also contain Do's and Dont's of typhoid fever. 

### Tools:

- Data Collection
- OpenCV
- OCR
- Spread Sheet
- Data Analysis
- Web Development
- App Development
- Machine Learning
