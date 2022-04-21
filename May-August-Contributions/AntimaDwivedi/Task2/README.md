# Improve diagnostic of typhoid through open science  
<b>Introduction of the problem</b><br>
WHO estimates the global typhoid fever disease burden at 11-20 million cases annually, resulting in about 128 000–161 000 deaths per year.The main aim of the Project is
to improve diagnostics of typhoid through Open-science. Combining AI systems with an irreplaceable human clinician can advance better diagnosis.<br>
<b>Proposed Solution</b><br>
<b>•</b>The basic idea is to develop an application(android or web ) and use the features of a mobile phone for computation and reducing human power.<br>
<b>•</b> Typhoid fever will be tested in two phases.The first will be a basic testing based on the symptoms and the other one will be widal test in the cases where basic test results are positive.
<br>
<b>•</b>Let us go through the app design simultanously.<br>

![Screenshot (18)](https://user-images.githubusercontent.com/56269029/163759662-f2689809-1f4e-4494-8f1b-97ce7eee0647.png)<br><br>
<b>•</b>After hitting the <b>Start</b> button,patient will go through the the personal details page.<br><br>
![Screenshot (19)](https://user-images.githubusercontent.com/56269029/163759652-1d22e864-5f8b-42be-9345-00b9c1e2def0.png)<br><br>
<b>•</b>A basic testing based on the symptoms will be done here and patient will mark all the symptoms experienced by him or her.<br><br>

![Screenshot (20)](https://user-images.githubusercontent.com/56269029/163759867-074574c7-c4ed-4985-b44f-315eb49893da.png)
![Screenshot (21)](https://user-images.githubusercontent.com/56269029/163759878-926dd6d2-d2ec-490d-be0f-8a00b9c782d5.png)
![Screenshot (22)](https://user-images.githubusercontent.com/56269029/163759885-6b31d0b5-68b9-4bb3-83a2-892fef9e1f7c.png)
![Screenshot (25)](https://user-images.githubusercontent.com/56269029/163759898-d1767c62-bdf9-48d7-89a9-82b121bee3d0.png)
![Screenshot (28)](https://user-images.githubusercontent.com/56269029/163759921-e63573ed-63cd-4b83-a1a3-94054eef27c9.png)![Screenshot (29)](https://user-images.githubusercontent.com/56269029/163759937-e8ba4587-5d3a-4153-8f9a-285897680c06.png)
![Screenshot (30)](https://user-images.githubusercontent.com/56269029/163759959-52e0ceb4-5f45-41bd-bc6d-c8a66d4d4209.png)<br><br>
<b>•</b>The results of basic testing will be displayed on the application.<br><br>
![Screenshot (32)](https://user-images.githubusercontent.com/56269029/163761512-909822ad-b7d5-459e-8703-91eb712e5972.png)<br><br>
<b>•</b>If the results of basic testing are negative ,no need to worry!!!!!<br><br>
![Screenshot (38)](https://user-images.githubusercontent.com/56269029/163761529-8960c224-cff1-4976-b8a8-e949e368f0a7.png)<br><br>
<b>•</b>If the results of basic testing are positive,patient will go through the widal test.<br><br>
![Screenshot (33)](https://user-images.githubusercontent.com/56269029/163761548-96142f0a-2047-414d-911a-b2d93681fe6e.png)<br><br>
<b>•</b>A high resolution mobile camera and a timer will be needed to check the formation of clouds in the wells in slide method.Mobile camera will be used as a microscope.<br><br>

![Screenshot (34)](https://user-images.githubusercontent.com/56269029/163762182-84b64106-a5b0-4f81-899e-823bf2d53a0c.png)<br><br>
<b>•</b>It is observed in the medical researches that during the enteric fever ,Volume of PCV and WBC reduced significantly .So it is advised by medical practitioners to go through the Complete Blood Count Test.<br><br> 
![Screenshot (35)](https://user-images.githubusercontent.com/56269029/163762190-5f11186b-983f-4544-8583-9d63b3a3a35e.png)<br><br>
<b>•</b>All the records will be saved in a patient’s file which will be stored digitally in the application itself.<br><br>
![Screenshot (36)](https://user-images.githubusercontent.com/56269029/163762910-4d996e5c-2226-4eb9-bdfb-595398a3ead6.png)<br><br>
<b>•</b>Mboalab wishes you good health!!!!. <br><br>
![Screenshot (37)](https://user-images.githubusercontent.com/56269029/163762927-67bff8d7-23cd-41ef-8419-e130d0555984.png)<br><br>

##<b>Tasks</b>:(All the tasks mentioned here are according to my proposed solution and not the actual tasks of the internship defined by mentors)<br>
<b>•</b>Collect the dataset on a large scale in which 18 conditional attributes(Symptoms) and 1 decisional attribute(Result) and, some blood smear images will be presented.<br>
<b>•</b>By Using the Rough set algorithm predict the output by taking into consideration of symptoms.<br>
<b>•</b>If the result from step 2 is positive, Make a UI to use the mobile phone‘s high-resolution camera and timer to detect agglutination with the reactions of antigens and patients serum.<br>
<b>•</b>It is observed that enteric fever significantly reduces the PCV and PLT of human blood. To calculate the complete blood count YOLO algorithm mentioned in the reference [3] can  be deployed in the Application.<br>
<b>•</b>Some basic UIs such as personal details, mark your symptoms, and test results will also be included in the application.<br>
##<b>Future Scope</b>:<br>
<b>•</b>Other methods of Typhoid diagnosis such as the Slide Semi-Quantitative Method and Quantitative Tube Method can also be added to the application for more accuracy of test results.<br>
<b>•</b>Collection of datasets on a large scale so that accuracy of algorithms can be increased.<br>
<b>•</b>App will be developed with the google translator API so that it can be used worldwide.<br>
<b>Link of the technical documentation</b> [Mboalab Submission by Antima Dwivedi](https://docs.google.com/document/d/1-b8ppwrDNejHThlLIyAG-QCAgJab9HiJE5WJk1eZma4/edit?usp=sharing)<br>
##<b>References</b><br>
[1]A Machine Learning Approach to Clinical Diagnosis of Typhoid Fever by Abiodun Oguntimilehin, Adebayo O Adetunmbi and Abiola O.B.<br>
[2] Changes in some hematological parameters in typhoid fever patients attending Landmark University Medical Center, Omuaran-Nigeria by James A.NdkoVictor T.Dojumo, Jeremiah A.Akinwumi,Vicyor O.Fajobi Akinyomade O.Owolabi, Oludolapo Olatinsu.<br>
[3] Machine learning approach of automatic identification and counting of blood cells by Mohammad Mahmudul Alam and Mohammad Tariqul Islam.






