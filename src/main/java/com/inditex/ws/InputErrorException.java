package com.inditex.ws;

@SuppressWarnings("serial")
public class InputErrorException extends RuntimeException {
	public InputErrorException(String mensaje) {
		super(mensaje);
	}
}
