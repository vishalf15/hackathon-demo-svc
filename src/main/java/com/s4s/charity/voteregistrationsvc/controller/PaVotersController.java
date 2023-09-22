package com.s4s.charity.voteregistrationsvc.controller;

import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.s4s.charity.voteregistrationsvc.exception.DataNotFoundException;
import com.s4s.charity.voteregistrationsvc.model.PaVoters;
import com.s4s.charity.voteregistrationsvc.service.PaVotersService;
import org.slf4j.Logger;



@RestController
@RequestMapping("/PAyouth/voter")
public class PaVotersController {
	
	private static final Logger log = LoggerFactory.getLogger(PaVotersController.class);

	private PaVotersService voterService;

	@Autowired
	public PaVotersController(PaVotersService voterService) {
		this.voterService = voterService;
	}

	@GetMapping("/{id}")
	public PaVoters getvoterById(@PathVariable String id) {
		
		log.debug("In Get Voter routine for voterId:"+ id);		
		return voterService.getVoterById(id).orElseThrow(() -> new DataNotFoundException("not found"));
	
	}

	@PostMapping("/registration")
	public PaVoters save(@RequestBody PaVoters voter) {
		log.debug("In Save Voter Routine");
		return voterService.saveVoter(voter);
	}

}
