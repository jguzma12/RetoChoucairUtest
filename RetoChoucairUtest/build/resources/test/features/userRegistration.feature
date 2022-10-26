#autor: juan97guzman@gmail.com / Juan Pablo Guzman Q
Feature: The user would like to register on the Utest Page

  Scenario: User register in Utest
    Given the user wants to register on Utest
    When the user go to Join Today
    And the user completes the firts form with the following data
      | firstName | lastName | email                  | month   | day | year |
      | juan      | guzman   | juan97guzman@gmail.com | october | 15  | 1997 |
#    And the user completes form second with the following data
#      | city   | zip   | country   |
#      | <city> | <zip> | <country> |
#    And the user completes form third with the following data
#      | computer   | version   | language   | cellPhone   | model   | system   |
#      | <computer> | <version> | <language> | <cellPhone> | <model> | <system> |
#    And the user completes form final with the following data
#      | password   | confirmPassword   |
#      | <password> | <confirmPassword> |
#    Then the user should see the text "Welcome to the world's largest community of freelance software testers!"
#    Examples:
#      | firstName  | lastName        | email                  | month   | day | year | city     | zip    | country  | computer | version | language | cellPhone | model            | system     | password      | confirmPassword |
#      | Juan Pablo | Guzman Quintero | juan97guzman@gmail.com | October | 15  | 1997 | Medellin | 050024 | Colombia | Windows  | 10      | English  | Xiaomi    | E51Mi 10 Lite 5G | Android 11 | 123456789*AbC | 123456789*AbC   |