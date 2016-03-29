package com.algaworks.socialbooks.services.exceptions;

public class LivroNaoEncotradoException extends RuntimeException {

	private static final long serialVersionUID = 9017311625987196197L;

	public LivroNaoEncotradoException(String mensagem) {
		super(mensagem);
	}
	
	public LivroNaoEncotradoException(String mensagem, Throwable causa) {
		super(mensagem, causa);
	}
	
}
