package com.bmdb.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.bmdb.business.MovieRepository;
import com.bmdb.util.JsonResponse;

@Controller
@RequestMapping("/Movies")
public class MovieController {

	@Autowired
	private MovieRepository movieRepo;
	
	@GetMapping(path="/List")
	public @ResponseBody JsonResponse getAllMovies() {
		try {
		return JsonResponse.getInstance(movieRepo.findAll());
		}
		catch (Exception e) {
			return JsonResponse.getErrorInstance("Error getting all movies.", e);
		}
	}
}
