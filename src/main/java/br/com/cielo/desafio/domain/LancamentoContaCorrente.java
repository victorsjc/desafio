package br.com.cielo.desafio.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class LancamentoContaCorrente {

	private String numeroRemessaBanco;
	private String nomeSituacaoRemessa;
	private DomicilioBancario dadosDomicilioBancario;
	private String nomeTipoOperacao;
}
