package com.jasmine.demo;

/**
 * assumption: We just want to sum all the scores together based on the various inputs in this exercise
 * so I didnt care about the extensibility of the attribute and categories.
 * @author tomlee
 *
 */
public class CreditScoreInputs {
	
	public CreditScoreInputs() {
		
	}
	public CreditScoreInputs(String companyType, Integer numberOfEmployees, Integer numberOfYearsOperated) {
		super();
		this.companyType = companyType;
		this.numberOfEmployees = numberOfEmployees;
		this.numberOfYearsOperated = numberOfYearsOperated;
	}

	private String companyType;
	private Integer numberOfEmployees;
	private Integer numberOfYearsOperated;

	public String getCompanyType() {
		return companyType;
	}

	public Integer getNumberOfEmployees() {
		return numberOfEmployees;
	}
	
	public Integer getNumberOfYearsOperated() {
		return numberOfYearsOperated;
	}
	
	

}
