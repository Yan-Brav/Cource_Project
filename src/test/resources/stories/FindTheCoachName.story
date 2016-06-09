Story: Find the coaches
Narrative:
The customer may need to find certain coach
on SkillsUp site

Scenario: Find the coach by name and check out their positions
Given the customer is on the main page SkillsUp site
When the customer is on the our team page SkillsUp site
Then customer should see <name>
Examples:
|name|position|
|Михаил Чокан|руководитель учебного центра|
|Ева Корнеплянская|контент-менеджер, тестировщик|
|Илья|координатор учебного центра|

Scenario: check out that search work correctly
Given the customer enter 'Alexander' in search field
When the customer press button search
Then he should see
|title|description|
|06109150|Alexander Tsariov|
|Alexander Galkovskiy|Java Tech Leader|

Scenario: check out that search work incorrectly with cyrillic
Given the customer enter 'Галковский' in search field
When the customer press button search
Then customer should see 'Не найдено совпадений по'




