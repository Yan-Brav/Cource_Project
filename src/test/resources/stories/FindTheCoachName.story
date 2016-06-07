Story: Find the coaches
Narrative:
The customer may need to find certain coach
on SkillsUp site

Scenario: Search the coach by name
Given the customer is on the main page SkillsUp site
When the customer is on the our team page SkillsUp site
Then customer should see <name>
Examples:
|name|
|Михаил Чокан|
|Ева Корнеплянская|
|Илья|

Scenario: check that search by name "Alexander" find person who called "Alexander Tsariov" and has certificate #06109150
Given the customer enter 'Alexander' in search field
When the customer press button search
Then he should see
|title|desciption|
|06109150|Alexander Tsariov|

Scenario: check that coach who called Alexander Galkovskiy really teach Diving into Java and work as Senior Java Developer
Given the customer enter 'Alexander Galkovskiy' in search field
When the customer press button search
Then he should see
|position|course|
|Java Tech Leader|Diving into Java|





