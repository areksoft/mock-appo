package com.test.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.test.model.response.ResponseDTO;
import com.test.service.ApiService;

/**
 * @author divyarani
 *
 */
@RestController
public class PublicApi {

	@Autowired
	ApiService apiService;

	@GetMapping(value = "/get-users")
	public ResponseEntity<ResponseDTO> getUsers() {
		ResponseDTO obj = apiService.getUsers();
		return ResponseEntity.status(HttpStatus.OK).body(obj);
	}

	@GetMapping(value = "/get-posts")
	public ResponseEntity<ResponseDTO> getPosts() {
		ResponseDTO obj = apiService.getPosts();
		return ResponseEntity.status(HttpStatus.OK).body(obj);
	}

	@GetMapping(value = "/get-comments")
	public ResponseEntity<ResponseDTO> getComments() {
		ResponseDTO obj = apiService.getPosts();
		return ResponseEntity.status(HttpStatus.OK).body(obj);
	}

}