package com.mario.myapi.resources.exceptions;

import lombok.AllArgsConstructor;
import lombok.Data;


@Data
@AllArgsConstructor
public class StandardError {
	
	private Integer status;
	private Long timestamp;
	private String message;
	
	public StandardError() {
		super();
	}
	
	
	
}
