package com.fundamentals.oops.ExceptionHandling;

import java.io.IOException;

public class ExceptionHandlingTest2 {
    public static void main(String[] args) {
//        Question: when to throw new exception from catch block
//        Answer: Sometimes exception thrown for low-level exception i.e IOException which is unknown to client
//        Hence in catch we can thrw new Exception like InvalidInputException which is understandable to user
        UserService us = new UserService();
        String name = "";
        us.register(name); // see the error stack Exception & Caused by
    }
}

class UserService{
    public void register(String name) {
        try{
            if(name== null || name.isBlank()){
                throw new IOException("Name is Blank");
            }
        }catch (IOException ex){
            throw new UserServiceException("Failed to register User: ",ex);
        }
    }
}

class UserServiceException extends RuntimeException{
    public UserServiceException(String msg, Throwable throwable){
        super(msg, throwable);
    }
}

