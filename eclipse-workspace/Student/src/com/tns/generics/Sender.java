package com.tns.generics;

public class Sender<T> {
	
	//T--The dataType
    private T message;
    
    public void setMessage(T message) {
    	this.message=message;
    }
    	
    	public T getMessage() {
    		return message;
    	}
    }

