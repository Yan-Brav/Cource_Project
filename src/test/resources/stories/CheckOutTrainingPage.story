Story: Check out training by price and group size
Narrative:
The customer may need to check out some training's price and group size
on SkillsUp site

Scenario: check out training about price and group size
Given the customer is on the main page SkillsUp site
When the customer go to the concrete training page
Then he may see <price> and <groupSize>
Examples:
|price|groupSize|
|Цена: 4500 грн|Размер группы: 12-16 человек|