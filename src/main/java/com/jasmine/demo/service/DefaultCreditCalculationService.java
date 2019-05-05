package com.jasmine.demo.service;

import org.springframework.stereotype.Service;

import com.jasmine.demo.CreditScoreInputs;
import com.jasmine.demo.model.CompanyTypeAttribute;
import com.jasmine.demo.model.NumberOfEmployeeAttribute;
import com.jasmine.demo.model.TimeInBusinessAttribute;

@Service
public class DefaultCreditCalculationService implements CreditCalculationService {

	
	@Override
	public Integer calculateCredit(CreditScoreInputs input) {
				
		final Integer noOfEmployee = input.getNumberOfEmployees();
		final Integer noOfYearsOperated = input.getNumberOfYearsOperated();
		final String companyType = input.getCompanyType();

		final CompanyTypeAttribute companyTypeAttribute= new CompanyTypeAttribute(companyType);
		final NumberOfEmployeeAttribute noOfEmployeeAttribute = new NumberOfEmployeeAttribute(noOfEmployee);
		final TimeInBusinessAttribute timeInBusinessAttribute = new TimeInBusinessAttribute(noOfYearsOperated);
		
		return companyTypeAttribute.getScore() + noOfEmployeeAttribute.getScore() + timeInBusinessAttribute.getScore();
	}

}
