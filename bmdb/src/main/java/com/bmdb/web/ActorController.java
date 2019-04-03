package com.bmdb.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.bmdb.business.Actor;
import com.bmdb.business.ActorRepository;
import com.bmdb.util.JsonResponse;

@CrossOrigin
@Controller
@RequestMapping(path="/Actors")
public class ActorController {

	@Autowired
	private ActorRepository actorRepo;
	
	@GetMapping(path="/List")
	public @ResponseBody JsonResponse getAllActors() {
		try {
			return JsonResponse.getInstance(actorRepo.findAll());
		}
		catch (Exception e) {
			return JsonResponse.getErrorInstance("Error retrieving actors", e);
		}
	}
	@GetMapping(path="/Get/{id}")
	public @ResponseBody JsonResponse getActor(@PathVariable int id) {
		try {
			return JsonResponse.getInstance(actorRepo.findById(id));
		}
		catch (Exception e) {
			return JsonResponse.getErrorInstance("Error retrieving actor", e);
		}
	}
	private @ResponseBody JsonResponse saveActor(@RequestBody Actor actor) {
		try {
			return JsonResponse.getInstance(actorRepo.save(actor));
		}
		catch (Exception e) {
			return JsonResponse.getErrorInstance("Error retrieving actor", e);
		}
	}
	@PostMapping(path="/Add")
	public @ResponseBody JsonResponse addActor(Actor actor) {
		return saveActor(actor);
	}
	@PostMapping(path="/Change")
	public @ResponseBody JsonResponse changeActor(Actor actor) {
		return saveActor(actor);
	}
}
