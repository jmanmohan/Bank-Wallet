Feature: 

  Scenario: Test name
    Given check user name
    When enter empty value in user name text box 
    #click to be added
    Then print error message for name field

  Scenario: Test password
    Given check user password
    When enter empty value in password text box
    Then print error message for password field

    Scenario: Test age
    Given check user age
    When enter empty value in age text box
    Then print error message for age field
    
    Scenario: Test mailid
    Given check user mailid
    When enter empty value in mailid text box
    Then print error message for mailid field
    
    Scenario: Test joining date
    Given check user joining date
    When enter empty value in joining date box
    Then print error message for joining date field
    
    Scenario: Test address
    Given check user address
    When enter empty value in address box
    Then print error message for address field
    
    Scenario: Test company
    Given check user company
    When enter empty value in company box
    Then print error message for company field

    
    Scenario: Test skills
    Given check user skills
    When enter empty value in skills box
    Then print error message for skills field

    Scenario: Test zone
    Given check user zone
    When enter empty value in zone box
    Then print error message for zone field

    Scenario: Test city
    Given check user city
    When enter empty value in city box
    Then print error message for city field


    
    
   #invlaid cases
   Scenario: Test invalid name
   Given check name
   When enter name in small aplhabets
   Then print error mesage 
    
   Scenario: Test invalid password
   Given check password
   When enter password alphabets onky
   Then print error mesage for password 
    
    Scenario: Test invalid age
   Given check age
   When enter age in  aplhabets
   Then print error mesage for invalid age
   
    Scenario: Test invalid email
   Given check email
   When enter email in  email format
   Then print error mesage for invalid email
   
    Scenario: Test invalid joining date
   Given check j_date
   When enter date in  ddmmyyyy format
   Then print error mesage for invalid j_date
   
    Scenario: Test invalid address
   Given check address
   When enter address in  numeric
   Then print error mesage for invalid address
   
   
   