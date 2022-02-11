package com.god.bo.mo;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class MovieSerivce {
	public List<Movie> query(final String query) {
		return Arrays.asList(
			Movie.builder().title("영화1").link("http://test1").build(),
			Movie.builder().title("영화2").link("http://test2").build(),
			Movie.builder().title("영화3").link("http://test3").build()
		);

	}
}
