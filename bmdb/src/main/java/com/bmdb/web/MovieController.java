package com.bmdb.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.bmdb.business.Movie;
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
	
	@GetMapping(path="/Get/{id}")
	public @ResponseBody JsonResponse getMovie(@PathVariable int id) {
		try {
			return JsonResponse.getInstance(movieRepo.findById(id));
		} catch (Exception e) {
			return JsonResponse.getErrorInstance("Error getting movie", e);
		}
	}
	private @ResponseBody JsonResponse saveMovie(@RequestBody Movie movie) {
		try {
			movieRepo.save(movie);
			return JsonResponse.getInstance(movie);
		} catch (DataIntegrityViolationException ex) {
			return JsonResponse.getErrorInstance(ex.getRootCause().toString(), ex);
		} catch (Exception ex) {
			return JsonResponse.getErrorInstance(ex.getMessage(), ex);
		}
	}
	@PostMapping(path="/Add")
	public @ResponseBody JsonResponse addMovie(Movie movie) {
		return saveMovie(movie);
	}
	@PostMapping(path="/Change")
	public @ResponseBody JsonResponse changeMovie(Movie movie) {
		return saveMovie(movie);
	}
	
}
