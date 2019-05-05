package com.jasmine.demo.model;

public class CompanyTypeAttribute implements Attribute{

	final String companyType;
	
	public CompanyTypeAttribute(String companyType) {
		this.companyType = companyType;
	}

	@Override
	public String getAttributeName() {
		return "Company Type";
		
	}

	@Override
	public Integer getScore() {
		final String value = companyType;
		if (value.toLowerCase().equals("limited liability company")) {
			return 63;
		}
		
		if (value.toLowerCase().equals("partnership")) {
			return 75;
		}
		
		if (value.toLowerCase().equals("sole proprietorship")) {
			return 12;
		}
		
		if (value.toLowerCase().equals("others")) {
			return 0;
		}
		throw new UnsupportedOperationException();
	}

	
}
