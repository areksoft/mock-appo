package com.test.service;

import com.test.model.response.ResponseDTO;

/**
 * @author divyarani
 *
 */
public interface ApiService {
    
    ResponseDTO getUsers();

    ResponseDTO getComments();

    ResponseDTO getPosts();
}