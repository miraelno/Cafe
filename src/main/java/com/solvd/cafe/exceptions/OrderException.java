package com.solvd.cafe.exceptions;

public class OrderException extends Exception{
    public OrderException(){
        super("We don`t have such item in menu");
    }
    public OrderException(String message){
        super(message);
    }
}
