package com.s4s.charity.voteregistrationsvc.repositories;


import org.socialsignin.spring.data.dynamodb.repository.EnableScan;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.s4s.charity.voteregistrationsvc.model.PaVoters;

@EnableScan
@Repository
public interface PaVoterRepo extends CrudRepository<PaVoters, String>{
	
	

	

}
