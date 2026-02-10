package com.josev001.workshop_mongo.service.exception;

public class ObjectNotFoundException extends  RuntimeException {

    private static final long serialVersionUID = 1L;

    public ObjectNotFoundException(String msg){
        super(msg);
    }


}
