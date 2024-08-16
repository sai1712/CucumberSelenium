Feature: Login Test

Scenario Outline: Login Test Scenario

Given the user is navigated to the URL
Then enters the "<username>" and "<password>"
Then clicks the login button
Examples:
|username|password|
|SaiHrithik|Sai894040@|