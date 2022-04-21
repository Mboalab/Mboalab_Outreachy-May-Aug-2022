# **Advanced Task 1: Design a Data collection tool to record symptoms Data**

Main Tasks to complete:
<br><input type="checkbox" checked> Select the prefered and 'most fitting' data collection tool to design for the project. <br>
<input type="checkbox" checked> Design the tool in order to collect the associations of symptoms that confirm the disease and its level of severity.<br>
<input type="checkbox" > Collect feedback about developed tool from the community. <br><br>

# **Machine Learning Approach to data collection for Typhoid Fever Diagnosis using Electronic Data Capture System (EDC)** 
<br>

# **Abstract**
Typhoid fever is a life-threatening infection caused by the bacterium *Salmonella Typhi*. It is usually spread through contaminated food or water. Each year, an estimated 9.9–24.2 million typhoid fever cases occur from low- and middle-income countries resulting in approximately 75,000–208,000 deaths. ***WHO*** now recommends introducing typhoid conjugate vaccines in areas with high typhoid incidence [[1]](#references). 
To address the need for locally relevant data for typhoid fever burden in the nation, to guide policy on use of the conjugate vaccines, and to improve typhoid fever diagnostics using advanced technologies, there is a dire need of data collection and diagnosis based innovative solutions.<br> 
This proposed idea utilises a set of advanced technologies, i.e., *Machine Learning integrated with EDC* to provide a solution for data collection to identify the disease and evaluate the data for deciding the best possible diagnosis and treatment according to the level of severity of the disease. Computer Aided Approach to diagnosis has witnessed unprecedented development in which typhoid fever is not an exceptional case [[5]](#references). The proposed system will have a variety of data collection options like surveys, questionnaires, interviews or forms in a pre-defined format approved by healthcare professionals to collect sufficient data ranging from patient's age to symptoms, i.e., all the critical data points required for evaluation using ML model to compute the severity of disease and the best possible diagnosis. These data points will be fed to the ML model as conditional variables to generate a decision tree and classifiers for the diagnosis of typhoid fever. The system can be implemented as a web application integrated with a Machine learning module to derive real-time evaluation outputs for the users. 
<br><br>

# **Introduction**
Typhoid Fever is an acute infectious disease caused by *Salmonella typhi*; characterized by a continued fever, skin spots, abdominal pain etc. ***WHO*** estimates the global typhoid fever disease burden at *11-20 million cases annually*, resulting in about *128,000–161,000 deaths per year* [[1]](#references). Improved living conditions and the introduction of antibiotics resulted in a drastic reduction of Typhoid fever morbidity and mortality in industrialized countries. However, in developing areas of Africa, the Americas, South-East Asia and the Western Pacific regions, the disease continues to be a public health problem. Typhoid risk is higher in populations that lack access to safe water and adequate sanitation. Poor communities and vulnerable groups including children are at highest risk. <br> 

**Major symptoms** of Typhoid fever include: fever, skin spots, abdominal pain, cough, diarrhoea, constipation, muscle weakness, headache, skin rash, delirium, anorexia etc.<br>
**The existing diagnosis** for Typhoid fever: **Widal Test**(to identify specific antibodies in the serum of people with Typhoid by using antigen-antibody interactions), **Rapid Diagnostic Tests** (such as Tubex, Typhidot, and Test-It have shown moderate diagnostic accuracy).<br>

Prompt and accurate diagnosis is a major key in the medical field, the large number of deaths associated with Typhoid fever is as a result of many factors which include: poor diagnosis, self medication, shortage of medical experts and insufficient health institutions. These requirements prompted the development of a Typhoid diagnosis system that can be used by anyone of average intelligence as this will assist in quick diagnosis of the disease despite shortage of health institutions and medical experts [[3]](#references). 
Furthermore, the importance and requirement of data collection and surveillance to estimate typhoid fever incidence has increased with imminent availability of new generation typhoid conjugate vaccines.

Development of ECD or Electronic Data Capture System integrated with ML model will be an advanced and modern solution to all these above mentioned requirements. Electronic Data Capture Software (EDC) is a software system that stores patient data collected in clinical trials. This software allows researchers or surveyors to collect data immediately upon inspection, which increases data validity. It can be further utilized by sponsors, contract research organizations (CROs), and sites for simple and complex trials in every phase of research. It allows field teams, surveyors, researchers, and others to collect, check and store data on a single connected web platform. It may also refer to applications used by clinicians and researchers to collect observed or subject data during a clinical trial. It can be used with data integration software since both focus on the collection of large quantities of data. Data integration tools can be used to amplify the already existing services provided by electronic data capture software.
<br><br>

# **Proposed Data Collection Tool**<br>
## Machine Learning Approach to data collection for Typhoid Fever Diagnosis using Electronic Data Capture System 
### - A Data collection tool to evaluate, collect and store data of patients for providing diagnosis in real time 
Recently, **Strategic Typhoid alliance across Africa and Asia** (STRATAA) [[2]](#references), a comprehensive programme which is assessing population dynamics and epidemiology of typhoid fever in Malawi, Bangladesh and Nepal to inform design of vaccine and public health interventions, used EDC for health research, observational studies and clinical trials for large scale typhoid surveillance, household contact tracing, and health utilisation survey. Their results described EDC as a very accurate tool to collect, store and manage large data volumes.  

This proposed tool utilises a set of advanced technologies, i.e., *Machine Learning integrated with EDC* to provide a solution for data collection to *identify the disease* and *evaluate the data* for deciding the best possible *diagnosis and treatment according to the level of severity of the disease*.

The Electronic Data Capture System can provide the following capabilities:

- Integrate with the camera to collect image data<br>
- Included or integrated form builder for collecting entered data<br>
- Collected data can be used in conjunction and integrated with other trials and medical reports<br>
- Data can be customized into various form and report templates<br>
- Checklist, data validation workflow<br>
- A web application for data collection from mobile or handheld device<br>
- **Data is protected** and backed up by the vendor due to regulatory compliances<br>
- Integrate the database with Machine Learning model to get confirmation of disease and evaluate the best possible diagnosis<br>

The proposed system will have a variety of data collection options like surveys, questionnaires, interviews or forms in a pre-defined format approved by healthcare professionals to collect sufficient data ranging from patient's age to symptoms, i.e., all the critical data points required for evaluation for computing the severity of disease and the best possible diagnosis. These data points will be fed to the ML model as conditional variables to generate a decision tree and classifiers for the diagnosis of typhoid fever. 

When the model will confirm the disease and its severity, EDC will evaluate the best possible diagnosis depending on the location and accessibility to the resources for the concerned patient. 
<br><br>

# **Methodology**
EDC is often cited as having its origins in remote data entry (RDE) software, which surfaced in the life sciences market in the late 1980s and early 1990s. Today, the market consists of a variety of EDCs. These customised systems offer specialized solutions targeting certain customer profiles or study phases. Modern features of EDC now include features like cloud data storage, role-based permissions, and case report form designers, as well as clinical trials analytics, interactive dashboards, and electronic medical record integration. 

In this proposition, EDC is integrated with a Machine Learning module to design a diagnostic tool for data collection, evaluation and recommendation of the most suitable diagnosis. The system can be implemented as a web application integrated with the Machine learning module to derive real-time evaluation outputs for the users by enabling acquisition of prospective and retrospective datasets. 

The Surveys, Questionnaires, Interviews, Forms or any kind of data input in a pre-defined format will be integrated with the database.  These data formats will be customisable into local languages and modularisable into location-specific data points as per the geographical location of the user. The data will be stored in the dataset which will be classified under predefined categories for further evaluation.

The ML model is inducted with a decision tree to evaluate a classification dataset. A decision tree is a representation of a decision procedure for determining the class of a given instance and it can be constructed by the non-incremental tree-induction algorithm or the incremental tree-induction algorithm as per the requirement. Decision trees are a non-parametric supervised learning method used for classification and regression. The goal of this proposition is to create a model that predicts the value of a target variable by learning simple decision rules inferred from the data features.

In various studies, the medical practitioners grouped the typhoid fever cases into five different classes based on the available symptoms of each case. These groups (Classes) are Very High, High, Moderate, Low and Very Low. They further coined eighteen (18) conditional attributes and one decision attribute. Table 1 below shows the 18 conditional attributes and the only one decision attribute [[6]](#references).

Table 1: Conditional and Decision Attributes of Typhoid Fever
| Attribute (Symptom)             | Symbol      | Category      |
| ---                             |   :---:     | ---           |
| 1. `Abdominal Pain`             | ABP         | `Conditional` |
| 2. `Abdominal Rigidity`         | ABR         | `Conditional` |
| 3. `Anorexia`                   | ANR         | `Conditional` |
| 4. `Constipation`               | CON         | `Conditional` |
| 5. `Cough`                      | COH         | `Conditional` |
| 6. `Delirium`                   | DLR         | `Conditional` |
| 7. `Diarrhoea`                  | DIA         | `Conditional` |
| 8. `Epistaxis(Bloody Nose)`     | EPS         | `Conditional` |
| 9. `Fever`                      | FVR         | `Conditional` |
| 10. `Haemorrhages`              | HMR         | `Conditional` |
| 11. `Headache`                  | HDH         | `Conditional` |
| 12. `Malaise`                   | MLI         | `Conditional` |
| 13. `Muscle Weakness`           | MWK         | `Conditional` |
| 14. `Occult blood in the stool` | OBS         | `Conditional` |
| 15. `Rose spot`                 | RPT         | `Conditional` |
| 16. `Skin Rash`                 | SKR         | `Conditional` |
| 17. `Stomach Distension`        | STD         | `Conditional` |
| 18. `Weightless`                | WGH         | `Conditional` |
|`Typhoid Fever Diagnosed`        | TDIAG       | `Decision`    |


*These parameters and decision methodology can be updated with further research and consultation with medical experts.*

This model performance must be trained and tested to optimise the discretization of these attributes by training and testing the model using prospective datasets. Lastly, the decision from this classification model serves as final input to EDC depending on which the diagnosis is computed considering mainly the location and accessibility to the resources. 
<br><br>

# **Future Scope**
In the future a hybrid diagnosis and treatment system integrated with Electronic Medical Records of patients can be used. 
Furthermore, survey driven surveillance, or integration of such surveillance results to predict the incidence of Typhoid fever in a particular location and propose emergency diagnosis and vaccination drive for the region beforehand, can bring the diagnosis and treatment of the menace to the barest minimum.
<br><br>

# **References**
[1] [Typhoid Fever - Epidemiology by WHO](https://www.who.int/news-room/fact-sheets/detail/typhoid)<br>
[2] [Electronic Data Capture for Large Scale Typhoid Surveillance, Household Contact Tracing, and Health Utilisation Survey : STRATAA](https://www.ncbi.nlm.nih.gov/pmc/articles/PMC7471626/#ref-15)<br>
[3] [A Machine Learning Approach to Clinical Diagnosis of Typhoid Fever](https://www.researchgate.net/publication/280644731_A_Machine_Learning_Approach_to_Clinical_Diagnosis_of_Typhoid_Fever)<br>
[4] [Opportunities and Challenges in Public Health Data Collection](https://pdfs.semanticscholar.org/7660/2f19b52d4f9859d789a4fe521027c9421b43.pdf)<br>
[5] [Computer Aided Diagnostic Systems for Managing Typhoid Fever: A Review of Diagnosis Techniques](https://www.ijcaonline.org/research/volume126/number6/oguntimilehin-2015-ijca-906071.pdf)<br>
[6] [A Machine Learning Based Clinical Decision Support System for Diagnosis and Treatment of Typhoid Fever](https://www.researchgate.net/publication/280646240_A_Machine_Learning_Based_Clinical_Decision_Support_System_for_Diagnosis_and_Treatment_of_Typhoid_Fever)<br>
<br><br>

# **Project Timeline**

Table 2: Estimated Timeline for Project Implementation (*Total duration* = 11 weeks.)
| Sr. No. | Task                  | Description                                                                          |  Duration  |
| ---     |   :---:               | :---:                                                                                |  :---:     |
| 1.      |   Medical Research    | `Collect information about symptoms and their relation with severity of the disease from research papers and consulting medical experts`                                                                                   | 2 weeks    |
| 2.      |   Software Architecture Design | `Designing the final software architecture while referring the recommendations and needs of medical experts`                                                                                                      | 1 week     |
| 3.      | Machine Learning Model Deployment  | `Developing and deploying ML model after Training & Testing for accurate data output`                                                                                                                  | 3 weeks    |
| 4.      | EDC Software Development | `Developing and deploying the EDC Software with integrated ML model`              | 4 weeks    |
| 5.      | Software Testing         | `Testing the software with sample patient data for accuracy, and any possible modifications`                                                                                                           | 1 week     |
<br>


# **Additional Information**
The proposed tool is being reviewed by various practicing medical experts and medical researchers. The feedback and medical grade reviews, on its feasibility and compatibility as a computational, predictive and diagnostic tool for typhoid fever by healthcare professionals, will be updated here on the [Google doc - Task 1](https://docs.google.com/document/d/1aJ-g4E_0fikvMr8pUtA7PUPiauTsQ0i_T0Z2wd-US6w/edit?usp=sharing). <br>
Furthermore, this is a potential research statement to develop a dynamic data collection tool and predict its level of severity in real time. Hence, the entire proposal is a work in progress. I am enthusiastic about any kind of contribution to this spectacular initiative by MboaLab, and would like to make this proposal into a real life project during the internship.<br> 
The idea is open to all for reviewing, reusing and recommending any possible upgrades.

