package br.com.cielo.desafio.converter;

import java.text.MessageFormat;
import java.util.ArrayList;
import java.util.List;

import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

import br.com.cielo.desafio.domain.ControleLancamento;
import br.com.cielo.desafio.domain.DomicilioBancario;
import br.com.cielo.desafio.domain.ExtratoContaCorrente;
import br.com.cielo.desafio.domain.LancamentoContaCorrente;
import br.com.cielo.desafio.model.ExtratoDetail;
import br.com.cielo.desafio.model.LancamentoDetail;

/**
 * A classe <code>ExtratoDetailConverter</code> é responsável em converter
 * os objeto da classe <code>ExtratoContaCorrente</code> para o objeto da
 * classe <code>ExtratoDetail</code>
 * 
 * @author vizawa
 *
 */
@Component
public class ExtratoDetailConverter implements Converter<ExtratoContaCorrente, ExtratoDetail> {
	
	private static final String PATTERN_DADOS_BANCARIOS = "{0} Ag {1} CC {2}";

	@Override
	public ExtratoDetail convert(final ExtratoContaCorrente extratoContaCorrente) {
	
		if(null == extratoContaCorrente){
			return null;
		}

		final List<LancamentoDetail> lancamentos = new ArrayList<>();
		for(ControleLancamento controle : extratoContaCorrente.getListaControleLancamento()){
			final LancamentoDetail lancamento = new LancamentoDetail();
			
			final LancamentoContaCorrente lancamentoCC = controle.getLancamentoContaCorrenteCliente();
			lancamento.setData(controle.getDataEfetivaLancamento());
			lancamento.setDescricao(controle.getDescricaoGrupoPagamento());
			lancamento.setNumber(lancamentoCC.getNumeroRemessaBanco());
			lancamento.setSituacao(lancamentoCC.getNomeSituacaoRemessa());
			lancamento.setDataConfirmacao(controle.getDataLancamentoContaCorrenteCliente());
			lancamento.setValorFinal(controle.getValorLancamentoRemessa());
			
			final DomicilioBancario domicilioBancario = lancamentoCC
					.getDadosDomicilioBancario();

			final String dadosBancarios = MessageFormat.format(
					PATTERN_DADOS_BANCARIOS, controle.getNomeBanco(),
					domicilioBancario.getNumeroAgencia(),
					domicilioBancario.getNumeroContaCorrente());
			lancamento.setDadosBancarios(dadosBancarios);
			
			lancamentos.add(lancamento);
		}
		
		final ExtratoDetail extratoDetail = new ExtratoDetail();
		extratoDetail.setLancamentos(lancamentos);		
		
		return extratoDetail;
	}

}
