#autor: juan97guzman@gmail.com / Juan Pablo Guzman Q
Feature: The user would like to register on the Utest Page

  Scenario Outline: User register in Utest
    Given the user wants to register on Utest
    When the user start to complete the differents forms to register
      | firstName   | lastName   | email   | month   | day   | year   | city   | zip   | country   | computer   | version   | language   | cellPhone   | model   | system   | password   | confirmPassword   |
      | <firstName> | <lastName> | <email> | <month> | <day> | <year> | <city> | <zip> | <country> | <computer> | <version> | <language> | <cellPhone> | <model> | <system> | <password> | <confirmPassword> |

    Then the user should see the text Welcome to the world's largest community of freelance software testers!
    Examples:
      | firstName  | lastName        | email                  | month   | day | year | city     | zip    | country  | computer | version | language | cellPhone | model            | system     | password      | confirmPassword |
      | Juan Pablo | Guzman Quintero | juan97guzmanx@gmail.com | October | 15  | 1997 | Medellín | 050024 | Colombia | Windows  | 10      | English  | Xiaomi    | Mi 10T Lite 5G | Android 11 | 123456789*AbC | 123456789*AbC   |