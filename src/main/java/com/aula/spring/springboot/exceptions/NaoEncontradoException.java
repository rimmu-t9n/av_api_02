package com.aula.spring.springboot.exceptions;

public class NaoEncontradoException extends RuntimeException{

	private static final long serialVersionUID = 1L;
	
	public NaoEncontradoException(String msg) {
		super(msg);
	}
}