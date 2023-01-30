Feature: Validating Place API

  Scenario: Verify if Place is being successfully added using AddPlaceAPI
    Given Add Place Payload
    When user calls "AddPlaceAPI" with Post http request
    Then the API call got success with status code 200
    And status in response body is "ok"