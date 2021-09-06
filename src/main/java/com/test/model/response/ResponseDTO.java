package com.test.model.response;

import com.fasterxml.jackson.annotation.JsonProperty;



/**
 * @author divyarani
 *
 */
public class ResponseDTO {

    private Meta meta;
    private GetJsonObject[] data;

    @JsonProperty("meta")
    public Meta getMeta() {
        return meta;
    }

    @JsonProperty("meta")
    public void setMeta(Meta meta) {
        this.meta = meta;
    }

    @JsonProperty("data")
    public GetJsonObject[] getData() {
        return data;
    }

    @JsonProperty("data")
    public void setData(GetJsonObject[] data) {
        this.data = data;
    }
    
}