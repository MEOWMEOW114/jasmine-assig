package com.jasmine.demo;

import static org.assertj.core.api.Assertions.assertThat;

import org.springframework.beans.factory.annotation.Autowired;

import com.jasmine.demo.model.CompanyTypeAttribute;
import com.jasmine.demo.model.NumberOfEmployeeAttribute;
import com.jasmine.demo.model.TimeInBusinessAttribute;
import com.jasmine.demo.service.DefaultCreditCalculationService;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class CreditCalculationSteps {
	
	@Autowired
    private DefaultCreditCalculationService creditCaculationService;
	
	private Integer result;
	
	@When("^The calculateCreditAssessmentScore API is called with parameters \"([^\"]*)\", \"([^\"]*)\", \"([^\"]*)\"$")
	public void the_calculateCreditAssessmentScore_API_is_called_with_parameters(Integer noOfEmployee, String companyType, Integer noOfYearsOperated) throws Throwable {
		try {
			final CreditScoreInputs input = new CreditScoreInputs(companyType, noOfEmployee, noOfYearsOperated);
	//		System.out.println(noOfEmployee + companyType + noOfYearsOperated );
			creditCaculationService = new DefaultCreditCalculationService();
			result = creditCaculationService.calculateCredit(input);
		} catch (UnsupportedOperationException e) {
			this.result = null;
		}
	}

	@Then("^The credit assessment score should match \"([^\"]*)\"$")
	public void the_credit_assessment_score_should_match(String result) throws Throwable {
		int intResult;
		
		if (result.isEmpty()) {
			assertThat(this.result).isEqualTo(null);
		}
		try {
			intResult = Integer.parseInt(result);
			assertThat(this.result).isEqualTo(intResult);

		} catch (NumberFormatException e) {
			assertThat(this.result).isEqualTo(null);

		}
	}


}
