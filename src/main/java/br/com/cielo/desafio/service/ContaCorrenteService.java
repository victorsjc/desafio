package br.com.cielo.desafio.service;

import java.util.Date;

import br.com.cielo.desafio.domain.DomicilioBancario;
import br.com.cielo.desafio.domain.ExtratoContaCorrente;
import br.com.cielo.desafio.exception.CannotOpenExtratoContaCorrenteException;

/**
 * A interface <code>ContaCorrenteService</code> define as operações da
 * camada de negócio referente Conta Corrente.
 * 
 * @author vizawa
 *
 */
public interface ContaCorrenteService {

	/**
	 * Obtém o extrato da conta corrente baseado nos dados da
	 * conta corrente
	 * 
	 * @param contaCorrente representa os dados da conta corrente
	 * @param dataInicio representa a data de inicio
	 * @param dataFinal representa a data de termino
	 * @return retorna um objeto da classe <code>ExtratoContaCorrente</code>
	 *         contendo os lançamentos da conta corrente
	 * @throws CannotOpenExtratoContaCorrenteException caso não seja possível
	 *         realizar o carregamento os dados do extrato da conta corrente.
	 */
	public ExtratoContaCorrente obterExtratoContaCorrente(
			final DomicilioBancario contaCorrente, final Date dataInicio,
			final Date dataFinal)
			throws CannotOpenExtratoContaCorrenteException;
}
