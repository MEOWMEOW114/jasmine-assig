Feature: Credit Assessment Calculator
  This is a simple credit assessment calculator feature for software engineer candidates

  Scenario Outline: Calculate Credit Assessment Score
    When The calculateCreditAssessmentScore API is called with parameters "<numberOfEmployees>", "<companyType>", "<numberOfYearsOperated>"
    Then The credit assessment score should match "<result>"

  Examples:
    | numberOfEmployees | companyType | numberOfYearsOperated | result |
    | 6 | Sole Proprietorship | 5 | 60 |
    | 10 | Limited Liability Company | 8 | 111 |
    | 10 | Limited Liability Codadmpany | 8 |  |
    |  | Sole Proprietorship | 8 |  |
    | 1 | Sole Proprietorship |  |  |
    | 1 |  | 1 |  |
    | 1 | partnership | 1 | 75 |
    |  |  |  |  |