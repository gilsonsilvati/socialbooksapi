package com.algaworks.socialbooks.services.exceptions;

public class AutorNaoEncotradoException extends RuntimeException {

	private static final long serialVersionUID = 9017311625987196197L;

	public AutorNaoEncotradoException(String mensagem) {
		super(mensagem);
	}
	
	public AutorNaoEncotradoException(String mensagem, Throwable causa) {
		super(mensagem, causa);
	}
	
}
