This project demonstrates steps to be performed for making a spring boot application as a zeebe client for Camunda 8 SAS Edition

**Step 1:** Import below process into camunda web modeler. Deploy the same into your orchestration cluster

<img width="727" height="137" alt="image" src="https://github.com/user-attachments/assets/ee18c1ac-905a-475b-a790-4f5b3d854f2e" />


**BPMN XML File Path:** https://github.com/suneelbayya/camunda8.modeler.bpmndmn/blob/master/src/main/resources/camundaprocesses/Demonstrate%20Service%20Task%20(REST%20Outbound%20And%20Job%20Type).bpmn

**Step 2:** Generate API Client Credentials for your orchestration cluster

<img width="1906" height="587" alt="image" src="https://github.com/user-attachments/assets/cd7adb16-3f36-45ac-b9b6-54327d217cd2" />

**Step 3:** As mentioned in this project add camunda client dependency and update application properties with orchestration API client details for your cluster

