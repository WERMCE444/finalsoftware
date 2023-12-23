Feature: User Registration and Authentication

  Scenario:  successful personal information
    When user click on save information and flag is 'true'
    And he fill in 'FirstName'  with 'Ahmad'
    And he fill in 'LastName'  with 'Mohsen'
    And he fill in 'Age'  with '22'
    And he fill in 'PhoneNumber'  with '0599116872'
    And he fill in 'CityName'  with 'Nablus'
    And he fill in 'Gmail'  with 'AhmadMohsen@gmail.com'
    And he fill in 'Password'  with 'A123A'
    Then The personal information has  been entered successfully

  Scenario: Empty information
    When user click on save information and flag is 'true'
    Then the field 'FirstName' should be an error
    And the field 'LastName' should be an error
    And the field 'Age' should be an error
    And the field 'PhoneNumber' should be an error
    And the field 'CityName' should be an error
    And the field 'Gmail' should be an error
    And the field 'Password' should be an error
    Then The personal information has not  been entered successfully

  Scenario Outline: Error with input
    When user click on save information and flag is 'true'
    And he fill in 'FirstName'  with '<FirstName>'
    And he fill in 'LastName'  with '<LastName>'
    And he fill in 'Age'  with '<Age>'
    And he fill in 'PhoneNumber'  with '<PhoneNumber>'
    And he fill in 'CityName'  with '<CityName>'
    And he fill in 'Gmail'  with '<Gmail>'
    And he fill in 'Password'  with '<Password>'
    Then The user should see '<messege>'

    Examples:
      | FirstName | LastName | Age | PhoneNumber | CityName | Gmail           | Password | messege                                                       |
      | Ali3333   | Masri    | 36  | 0531784961  | Nablus   | Alimm@gmail.com | akidh00  | Invalid name , please check it                                |
      | Ali       | Masri333 | 36  | 0531784961  | Nablus   | Alimm@gmail.com | akidh00  | Invalid name , please check it                                |
      | Ali       | Masri    | PQ  | 0531784961  | Nablus   | Alimm@gmail.com | akidh00  | Invalid Age , please write a number not a letter              |
      | Ali       | Masri    | 36  | 05APPP      | Nablus   | Alimm@gmail.com | akidh00  | Invalid PhoneNumber , please write a number not a letter      |
      | Ali       | Masri    | 36  | 0531784961  | 69       | Alimm@gmail.com | akidh00  | Invalid CityName , please check it                            |
      | Ali       | Masri    | 36  | 0531784961  | Nablus   | Alim            | akidh00  | Invalid Gmail , please write it like ( your name @gmail.com ) |
