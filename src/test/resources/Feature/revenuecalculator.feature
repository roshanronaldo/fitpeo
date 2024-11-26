Feature: To validate the Fitpeo Application
@run
Scenario: To Validate the Revenue Calculator functionality   

  
 Given To launch the Fitpeo application
 When To click Revenue Calculator link in the application
 Then To Validate the Revenue Calculator page
 When To scroll down and adjust the patient slider eighttwenty patient
 Then To validate the patient is eighttwenty in the text field
 When To enter the value fivesixty in the given text field
 Then To validate the slider the range is move on fivesixty
 When To enter the value eighttwenty in the given text field
 When To select the cpt codes as per as mentioned
 Then To validate the Total Recurring Reimbursement for all Patients per Month
 