Feature: SwagLabs Website Testing

Scenario: Place an order

Given User is already on a Login Page
When title of the page is Swag Labs
Then user enters the username and password
| standard_user | secret_sauce |

Then user clicks on Login button
Then user clicks on Add to Cart button
Then user open the cart
Then user clicks on checkout button
Then user enters the firstname and lastname and postalcode
| Rachit | Saurabh | 123456 |

Then user clicks on continue button
Then user clicks on finish button
And close the browser

#Data Driven with BDD Framework using Cucumber tool:-
#1. without using Examples keyword.
#2. using Examples keyword with Scenarion Outline.
#3. using data table.