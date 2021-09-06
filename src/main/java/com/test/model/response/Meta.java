package com.test.model.response;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * @author divyarani
 *
 */
public class Meta {
    private Pagination pagination;

    @JsonProperty("pagination")
    public Pagination getPagination() {
        return pagination;
    }

    @JsonProperty("pagination")
    public void setPagination(Pagination pagination) {
        this.pagination = pagination;
    }
}