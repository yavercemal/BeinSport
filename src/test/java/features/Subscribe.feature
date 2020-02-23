Feature:  Subscribe
  Scenario:  Bein Sports Connect Thailand Subscription

    Given Start Driver and Navigate
    And Click Subscribe button
    And Validate package price and Monthly Pass with One Week Free Trial package click
    And Create Account
    Example :
      | Fields                           | Values              |
      | First Name                       | ahmet               |
      | Last Name                        | yasar               |
      | Email Address or Mobile Number   | ahmet@gmail.com     |
      | Create Password                  | Abc-1547            |
    And Ignore email verification alert by clicking
    And Make Payment with Credit Card
    Then Total charge control, confirm payment and Expect for a error text and finish test with success
    Example :
      | Fields                           | Values              |
      | Cardholder's name                | ahmet               |
      | Card number                      | 378282246310005     |
      | Expiry date (mm/yyyy)            | 02/2022             |
      | Card verification code           | 123                 |

