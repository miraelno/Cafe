package com.solvd.cafe.exceptions;

public class EmptyCollectionException extends Exception{
    public EmptyCollectionException(){
        super("This collection is empty.");
    }
    public EmptyCollectionException(String message){
        super(message);
    }
}
