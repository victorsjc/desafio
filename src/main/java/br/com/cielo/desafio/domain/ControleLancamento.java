package br.com.cielo.desafio.domain;

import java.math.BigDecimal;
import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


/**
 * 
 * @author vizawa
 *
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ControleLancamento {

	private LancamentoContaCorrente lancamentoContaCorrenteCliente;
	private Date dataEfetivaLancamento;
	private Date dataLancamentoContaCorrenteCliente;
	private String numeroEvento;
	private String descricaoGrupoPagamento;
	private Integer codigoIdentificadorUnico;
	private String nomeBanco;
	private Integer	quantidadeLancamentoRemessa;
	private Integer	numeroRaizCNPJ;
	private Integer	numeroSufixoCNPJ;
	private BigDecimal valorLancamentoRemessa;
	private Long dateLancamentoContaCorrenteCliente;
	private Long dateEfetivaLancamento;
}
