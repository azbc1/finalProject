package com.esprit.credit.repository;


import java.util.Set;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import com.esprit.credit.entity.CreditRequest;
import com.esprit.credit.enumeration.CreditRequestStatus;
import com.esprit.credit.*;  
public interface CreditRequestRepository extends CrudRepository<CreditRequest, Long> {

    @Query("SELECT p FROM CreditRequest p WHERE p.creditRequestStatus = ?1 ORDER BY p.creationDate DESC ")
    Set<CreditRequest> findAllCreditRequestWithStatus(CreditRequestStatus accepted);
}
