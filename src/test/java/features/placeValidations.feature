Feature: Validating Place API

 Scenario Outline: Verify if Place is being successfully added using AddPlaceAPI
    Given Add Place Payload with "<name>" "<language>" "<address>"
    When user calls "AddPlaceAPI" with "Post" http request
    Then the API call got success with status code 200
    And "status" in response body is "OK"
    And "scope" in response body is "APP"
   And verify place Id created maps to "<name>" using "GetPlaceAPI"
   Examples:
     | name | language | address      |
     | new  | English  | test address |
   #  | Test | Hindi    | new address  | # is used to for comments in feature file
