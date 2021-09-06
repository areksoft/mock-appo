package com.test.model.response;

import com.fasterxml.jackson.annotation.JsonProperty;


/**
 * @author divyarani
 *
 */
public class Pagination {
    private int total;
    private int pages;
    private int page;
    private int limit;
    private Links links;

    @JsonProperty("total")
    public int getTotal() {
        return total;
    }

    @JsonProperty("total")
    public void setTotal(int total) {
        this.total = total;
    }

    @JsonProperty("pages")
    public int getPages() {
        return pages;
    }

    @JsonProperty("pages")
    public void setPages(int pages) {
        this.pages = pages;
    }

    @JsonProperty("page")
    public int getPage() {
        return page;
    }

    @JsonProperty("page")
    public void setPage(int page) {
        this.page = page;
    }

    @JsonProperty("limit")
    public int getLimit() {
        return limit;
    }

    @JsonProperty("limit")
    public void setLimit(int limit) {
        this.limit = limit;
    }

    @JsonProperty("links")
    public Links getLinks() {
        return links;
    }

    @JsonProperty("links")
    public void setLinks(Links links) {
        this.links = links;
    }
}
