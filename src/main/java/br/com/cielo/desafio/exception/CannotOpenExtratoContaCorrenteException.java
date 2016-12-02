package br.com.cielo.desafio.exception;

/**
 * A classe <code>CannotOpenExtratoContaCorrenteException</code> representa
 * a exceção em casos em que não foi possível realizar a consulta dos
 * dados do extrato da conta corrente.
 * 
 * @author vizawa
 *
 */
public class CannotOpenExtratoContaCorrenteException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	/**
	 * Construtor
	 * @param message representa a mesagem da causa da exceção
	 */
	public CannotOpenExtratoContaCorrenteException(final String message){
		super(message);
	}
	
	/**
	 * Construtor
	 * @param message representa a mensagem da causa da exceção
	 * @param ex representa o objeto da exceção que foi originada
	 */
	public CannotOpenExtratoContaCorrenteException(final String message, final Throwable ex){
		super(message, ex);
	}

}
