package br.com.cielo.desafio.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import com.fasterxml.jackson.annotation.JsonFormat;


/**
 * A classe <code>LancamentoDetail</code> representa
 * os dados de lancamento gerados pela conta corrente
 * do cliente.
 * 
 * Utilizado somente uso publico da API
 * 
 * @author vizawa
 *
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class LancamentoDetail implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@JsonFormat(shape=JsonFormat.Shape.STRING, pattern="dd/MM/yyyy")
	private Date data;
	private String descricao;
	private String number;
	private String situacao;
	@JsonFormat(shape=JsonFormat.Shape.STRING, pattern="dd/MM/yyyy")
	private Date dataConfirmacao;
	private String dadosBancarios;
	private BigDecimal valorFinal;
}
