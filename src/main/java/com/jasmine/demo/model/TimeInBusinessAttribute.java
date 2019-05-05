package com.jasmine.demo.model;

public class TimeInBusinessAttribute implements Attribute{

	final Integer value;

	public TimeInBusinessAttribute(Integer noOfYearsOperated) {
		this.value = noOfYearsOperated;
	}

	@Override
	public String getAttributeName() {
		return "Time in Business";
	}

	@Override
	public Integer getScore() {
		if (value != null) {
			
			if (value >= 0 && value <= 3) {
				return 0;
			}
			
			if (value >= 4 && value <= 9) {
				return 28;
			}
			
			if (value >= 10 && value <= 15) {
				return 36;
			}
			
			if (value >= 16) {
				return 59;
			}
			
		}
		
		throw new UnsupportedOperationException();
	}

}
