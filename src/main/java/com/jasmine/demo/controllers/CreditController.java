package com.jasmine.demo.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.jasmine.demo.CreditScoreInputs;
import com.jasmine.demo.service.DefaultCreditCalculationService;

@RestController
@RequestMapping("/")
public class CreditController {
	

    @Autowired
    private DefaultCreditCalculationService creditCacluationService;
    
	  @PostMapping("/calculateCreditScores")
	  public ResponseEntity<Integer> calculateCreditScore(@RequestBody CreditScoreInputs creditScoreInputs) {
//		  return new ResponseEntity <Integer> (2, HttpStatus.OK);

		  final Integer credit = creditCacluationService.calculateCredit(creditScoreInputs);
//		  System.out.println(credit+"");
		  return new ResponseEntity <Integer> (credit, HttpStatus.OK);
	  }
}
