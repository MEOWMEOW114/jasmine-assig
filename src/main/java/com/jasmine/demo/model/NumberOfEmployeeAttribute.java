package com.jasmine.demo.model;

public class NumberOfEmployeeAttribute implements Attribute  {

	final Integer value;

	public NumberOfEmployeeAttribute(Integer noOfEmployee) {
		this.value = noOfEmployee;
	}

	@Override
	public String getAttributeName() {
		return "Number of Employees";
	}

	@Override
	public Integer getScore() {
		if (value != null) {
			
			if (value >= 1 && value <= 5) {
				return 0;
			}
			
			if (value >= 6 && value <= 10) {
				return 20;
			}
			
			if (value >= 11 && value <= 15) {
				return 32;
			}
			if (value >= 16 && value <= 20) {
				return 55;
			}
			if (value >= 20) {
				return 70;
			}
			
		}
		
		throw new UnsupportedOperationException();
	}

}
