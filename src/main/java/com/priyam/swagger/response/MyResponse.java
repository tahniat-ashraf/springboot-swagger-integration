package com.priyam.swagger.response;

import io.swagger.annotations.ApiModelProperty;

/**
 * Created by dni_tahniat on 3/14/2018.
 */
public class MyResponse {

    @ApiModelProperty(notes = "statusCode property in swagger response model")
    private String statusCode;


    public String getStatusCode() {
        return statusCode;
    }

    public void setStatusCode(String statusCode) {
        this.statusCode = statusCode;
    }
}
