Feature: Create New task
Background:
Given The user is already logged in
|username|password|
|SaiHrithik|Sai894040@|

Scenario Outline: Create a new task and save
Given user navigates to create new task page
And enter the "<Title>" "<Autoextend>" and "<completion%>"
Then click the save button
Examples:
|Title|Autoextend|completion%|
|SaiTest2|Extend deadline by 3 days|40|

Scenario Outline: Create a new contact
Given user navigates to the create new contact page
And enters the title "<title>" firstname "<firstname>" and lastname "<lastname>"
Then clicks the save button
Examples:
|title|firstname|lastname|
|Mr.|Sai|Hrithik|
