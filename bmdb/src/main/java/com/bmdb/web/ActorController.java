package com.bmdb.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.bmdb.business.Actor;
import com.bmdb.business.ActorRepository;

@CrossOrigin
@Controller
@RequestMapping(path="/Actors")
public class ActorController {

	@Autowired
	private ActorRepository actorRepo;
	
	@GetMapping(path="/List")
	public @ResponseBody Iterable<Actor> getAllActors() {
		return actorRepo.findAll();
	}
	

}
