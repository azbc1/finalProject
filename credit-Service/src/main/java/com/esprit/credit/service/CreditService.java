package com.esprit.credit.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.esprit.credit.entity.Credit;
import com.esprit.credit.repository.CreditRepository;

import java.time.LocalDate;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

@Service
public class CreditService {
	
	 @Autowired
	    private CreditRepository creditRepository;

	    public String deleteCredit(Integer id) throws Exception {
	        if (creditRepository.findById(id.longValue()).isPresent()) {
	            creditRepository.deleteById(id.longValue());
	            return "Credit Deleted Successfully";
	        } else
	            return "Credit Not Found";
	    }

	    public String updateCredit(Integer id, Credit newCredit) throws Exception {
	        if (creditRepository.findById(id.longValue()).isPresent()) {
	            Credit oldCredit = creditRepository.findById(id.longValue()).get();
	            if (newCredit.getAgent() != null) {
	                oldCredit.setAgent(newCredit.getAgent());
	            }
	            if (newCredit.getCreditTerm() != null) {
	                oldCredit.setCreditTerm(newCredit.getCreditTerm());
	            }
	            if (newCredit.getCreditAmount() != null) {
	                oldCredit.setCreditAmount(newCredit.getCreditAmount());
	            }
	            if (newCredit.getCreditRepayment() != null) {
	                oldCredit.setCreditRepayment(newCredit.getCreditRepayment());
	            }
	            if (newCredit.getCreditRepaymentAmount() != null) {
	                oldCredit.setCreditRepaymentAmount(newCredit.getCreditRepaymentAmount());
	            }
	            if (newCredit.getCreditFees() != null) {
	                oldCredit.setCreditFees(newCredit.getCreditFees());
	            }
	            if (newCredit.getCreditInterest() != null) {
	                oldCredit.setCreditInterest(newCredit.getCreditInterest());
	            }
	            if (newCredit.getCreditRepaymentInterest() != null) {
	                oldCredit.setCreditRepaymentInterest(newCredit.getCreditRepaymentInterest());
	            }
	            if (newCredit.getPayedAmount() != null) {
	                oldCredit.setPayedAmount(newCredit.getPayedAmount());
	            }
	            if (newCredit.getRemainingAmount() != null) {
	                oldCredit.setRemainingAmount(newCredit.getRemainingAmount());
	            }
	            if (newCredit.getReleaseDate() != null) {
	                oldCredit.setReleaseDate(newCredit.getReleaseDate());
	            }
	            if (newCredit.getType() != null) {
	                oldCredit.setType(newCredit.getType());
	            }
	            creditRepository.save(oldCredit);
	            return "Credit Updated Successfully";
	        } else {
	            return "Credit Not Found";
	        }
	    }

	    public Credit getCredit(Integer id) throws Exception {
	        return creditRepository.findById(id.longValue()).get();
	    }


}
