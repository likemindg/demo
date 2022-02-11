package com.god.bo.mo;

import java.io.Serializable;

import lombok.Builder;
import lombok.Getter;

@Builder
@Getter
public class Movie implements Serializable {
	private String title;
	private String link;
	private float userRating;

}
