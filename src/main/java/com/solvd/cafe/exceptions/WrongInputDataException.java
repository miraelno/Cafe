package com.solvd.cafe.exceptions;

import java.util.InputMismatchException;

public class WrongInputDataException extends Exception{
    public WrongInputDataException(){
        super("The entered data does not meet the requirements. Please, choose variant from menu.");
    }
    public WrongInputDataException(String message){
        super(message);
    }

    public WrongInputDataException(Exception e) {
    }
}
