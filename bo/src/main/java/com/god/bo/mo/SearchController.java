package com.god.bo.mo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/search")
public class SearchController {

	@Autowired
	private MovieSerivce movieService;

	@GetMapping("/movies")
	public List<Movie> getMovieByQuery(@RequestParam(name = "q") String query) {
		return movieService.query(query);
	}

}
