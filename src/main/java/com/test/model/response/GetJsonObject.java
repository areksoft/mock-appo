package com.test.model.response;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

/**
 * @author divyarani
 *
 */
@JsonInclude(Include.NON_EMPTY)
public class GetJsonObject {
    private int id;
    private String name;
    private String email;
    private String gender;
    private String status;
    private int userId;
    private String title;
    private String body;
    private int postId;
	

    @JsonProperty("id")
    public int getId() {
        return id;
    }

    @JsonProperty("id")
    public void setId(int id) {
        this.id = id;
    }

    @JsonProperty("name")
    public String getName() {
        return name;
    }

    @JsonProperty("name")
    public void setName(String name) {
        this.name = name;
    }

    @JsonProperty("email")
    public String getEmail() {
        return email;
    }

    @JsonProperty("email")
    public void setEmail(String email) {
        this.email = email;
    }

    @JsonProperty("gender")
    public String getGender() {
        return gender;
    }

    @JsonProperty("gender")
    public void setGender(String gender) {
        this.gender = gender;
    }

    @JsonProperty("status")
    public String getStatus() {
        return status;
    }

    @JsonProperty("status")
    public void setStatus(String status) {
        this.status = status;
    }

    @JsonProperty("user_id")
    public int getUserId() {
        return userId;
    }

    @JsonProperty("user_id")
    public void setUserId(int userId) {
        this.userId = userId;
    }

    @JsonProperty("title")
    public String getTitle() {
        return title;
    }

    @JsonProperty("title")
    public void setTitle(String title) {
        this.title = title;
    }

    @JsonProperty("body")
    public String getBody() {
        return body;
    }

    @JsonProperty("body")
    public void setBody(String body) {
        this.body = body;
    }

    
    @JsonProperty("post_id")
    public int getPostId() {
        return postId;
    }

    @JsonProperty("post_id")
    public void setPostId(int postId) {
        this.postId = postId;
    }
}