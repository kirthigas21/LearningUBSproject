Feature: Leaftaps login feature

Scenario Outline:Login scenario with valid credentials

Given Launch the browser with parameter and load the url
And Enter the username <name>
And Enter the password <pass>
When Click on the login button
Then Verify the login is successful 
And Click on the CRMSFA link  button 

Examples:

|name|pass|
|demosalesmanager|crmsfa|



