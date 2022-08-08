package com.solvd.cafe.exceptions;

public class VacationException extends Exception{
    public VacationException(){
        super("You do not have enough days for vacation, sorry(");
    }
    public VacationException(String message){
        super(message);
    }
}
