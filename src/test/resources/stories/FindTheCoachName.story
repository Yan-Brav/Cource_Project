Story: Find the coach name
Narrative:
The customer may need to find certain coach
By name on our team page

Scenario: Search the coach by name
Given the customer is on the main page SkillsUp site
When the customer is on the our team page SkillsUp site
Then he should see the name <name>

Examples:
|name|
|Артем Карпов|
|Александр Галковский|

Scenario: Search the coach by name
Given the customer is on the main page SkillsUp site
When the customer is on the our team page SkillsUp site
Then he should see the name Ольга Симчак

Scenario: Match coachName and course on coach page view
When the customer is on the our team page SkillsUp site
Then coach view contains
|name|course|
|Михаил Чокан|руководитель учебного центра|
|Ева Корнеплянская|контент-менеджер|
|Илья|координатор учебного центра|


