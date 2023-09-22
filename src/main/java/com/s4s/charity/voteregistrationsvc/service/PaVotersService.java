package com.s4s.charity.voteregistrationsvc.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.s4s.charity.voteregistrationsvc.model.PaVoters;
import com.s4s.charity.voteregistrationsvc.repositories.PaVoterRepo;

import lombok.AllArgsConstructor;

@Service
//@AllArgsConstructor
public class PaVotersService {

	@Autowired
	private PaVoterRepo pavoterRepo;
	


	
	
	public Optional<PaVoters> getVoterById(String id) {
		return pavoterRepo.findById(id);
			
	}
	
	public PaVoters saveVoter(PaVoters voter) {
		return pavoterRepo.save(voter);
		
		
		
		
	}

}
