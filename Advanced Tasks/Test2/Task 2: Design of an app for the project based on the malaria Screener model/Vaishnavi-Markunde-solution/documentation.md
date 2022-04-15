
# Typhoid Fever 
<br>



**Abstract** : Typhoid fever is an acute illness associated with fever caused by the Salmonella typhil bacteria. It can also be caused by Salmonella paratyphi, a related bacterium that usually causes less several illnesses. The bacteria are deposited in water or food by a human carrier and are then spread to other people in the area. Typhoid fever is a global health problem. Its real impact is difficult to estimate because the clinical picture is confused with those of many other febrile infections. It has been estimated that approximately 17 million cases of typhoid fever and 600,000.00 associated deaths occur annually. Typhoid fever also has a very high social and economic impact because of the hospitalization of patients with acute disease and the implications and loss of income attributable to the duration of the clinical illness(s). Typhoid fever affects more than 13 million people annually, with over 500,000 patients dying of the disease. Typhoid fever constitutes a serious public health problem in many parts of the world

## Diagnosis :

### Tasks:
<br>
1. Collect data from users and medical practioners.<br>
2. Data preprocessing. <br>
3. Classify the data into different classes. <br>
4. Divide the collected dataset into training data and test data. <br>
5. Create a model to study the training data. <br>
6. Test the model.


### Description :

**1. Collection of Data**<br>
    The app asks the user various questions regarding user's symptoms and the level of severity of those symptoms.
    <br>
    The following is the list of few symptoms (conditional attributes) that our app will ask the user 
    <br>
    
- Fever  
- Abdominal Pain  
- Cough
- Diarrhoea
- Constipation
- Muscle weakness
- Headache
- Skin rash
- Weightless
- Stomach Distension
- Blood occult in stool
    
    
    If the user has any of these symptoms there would be a prompt that asks the user about severity of the symptom i.e Low or High. On the basis of these symptoms ,       typhoid would be diagonised. Apart from these questionarie user would be asked to upload their widal test (if have) reports which would help us provide more precise way for diagnosing typhoid .
   <br>
   
**2. Data preprocessing** 

Data collected from the user would be cleaned first ( dealing with missing data). 
To make the programming easier and the program more efficient, these values would be converted to integer since it is easier to work around with numbers.
For conditional attributes we shall assign 0 for default 1 for low and 2 for high.
The output for training data would be the level of typhoid , we would assign 1 for very low , 2 for low , 3 for moderate , 4 for high and 5 for very high.

The data collected from widal tests will contain images of agglutination , this images would be pre-processed accordinlgy for the required model.
<br>

**3. Classification of Data**

The data has to be classified into 5 classes depending upon the severity of the typhoid fever.

**4. Dividing the dataset**

We would then divide the dataset into training and test data for the training the machine learning model.

**5. Machine Learning Model**

The model would try to learn from previous experience , based on the previous data it will predict the output for newly entered user data.
Here we can use convulational neural networks for predicting results from images of test reports. 


### Tools :

- Web development
- App development
- Data collection tool
- Data analysis
- Machine learning
- Deep learning


<br>
Link to UI design of the app : https://www.figma.com/file/bLXL66RlT2SrjLsM8fOHyA/Mboalab-Task-2?node-id=0%3A1

(Still working on it and can be updated according to project needs and requirements)


    
    
    
    
    
    


