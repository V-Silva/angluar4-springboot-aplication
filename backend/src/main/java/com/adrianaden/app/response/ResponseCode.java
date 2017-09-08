package com.adrianaden.app.response;

public enum ResponseCode {
	SUCCESS(200);
	
	private final int value;

    private ResponseCode(int value) {
        this.value = value;
    }
    
    public int getValue() {
    	return this.value;
    }
}
