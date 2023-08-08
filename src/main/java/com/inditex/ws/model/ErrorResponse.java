package com.inditex.ws.model;

public class ErrorResponse {
	
	private int status;
    private String message;
	
	public ErrorResponse(int value, String message) {
		this.status=value;
		this.message=message;
	}
	
	
	public int getStatus() {
		return status;
	}
	public void setStatus(int status) {
		this.status = status;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	
    
}
