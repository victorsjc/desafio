package br.com.cielo.desafio.model;

import java.io.Serializable;
import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * A classe <code>ExtratoDetail</code> representa os dados
 * do extrato da conta corrente do cliente.
 * 
 * Utilizado somente uso publico da API.
 * 
 * @author vizawa
 * @since 01/12/2016
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ExtratoDetail implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private List<LancamentoDetail> lancamentos;
}
