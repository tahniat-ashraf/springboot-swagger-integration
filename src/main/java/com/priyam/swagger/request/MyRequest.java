package com.priyam.swagger.request;

import io.swagger.annotations.ApiModelProperty;

/**
 * Created by dni_tahniat on 3/14/2018.
 */
public class MyRequest {

    @ApiModelProperty(notes = "Name property in swagger request model")
    private String name;

    @ApiModelProperty(notes = "Id property in swagger request model")
    private int id;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
