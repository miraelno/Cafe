package com.solvd.cafe.exceptions;

public class NoSuchBranchException extends Exception{
    public NoSuchBranchException(){
        super("No such branch");
    };
    public NoSuchBranchException(String message){
        super(message);
    };
}
