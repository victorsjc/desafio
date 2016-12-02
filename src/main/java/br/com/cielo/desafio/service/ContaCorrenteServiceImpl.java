package br.com.cielo.desafio.service;

import java.io.IOException;
import java.io.InputStream;
import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import br.com.cielo.desafio.domain.DomicilioBancario;
import br.com.cielo.desafio.domain.ExtratoContaCorrente;
import br.com.cielo.desafio.exception.CannotOpenExtratoContaCorrenteException;
import br.com.cielo.desafio.mapper.JsonDeserializer;

/**
 * A classe <code>ContaCorrenteServiceImpl</code> é responsável na implementação
 * da camada de negócios referente as operações da conta corrente 
 * 
 * @author vizawa
 * @since 01/12/2016
 */
@Service
public class ContaCorrenteServiceImpl implements ContaCorrenteService {
	
	@Qualifier("JacksonJsonDeserializer")
	@Autowired private JsonDeserializer<ExtratoContaCorrente> jsonDeserializer;

	/** {@inheritDoc}  
	 */
	@Override
	public ExtratoContaCorrente obterExtratoContaCorrente(
			final DomicilioBancario contaCorrente,
			final Date dataInicio,
			final Date dataFinal) throws CannotOpenExtratoContaCorrenteException {

	    final ClassLoader resourceLoader = Thread.currentThread().getContextClassLoader();
	    final InputStream legado = resourceLoader.getResourceAsStream("json/lancamento-conta-legado.json");	    
   
		try {
			ExtratoContaCorrente obj = jsonDeserializer.deserialize(legado, ExtratoContaCorrente.class);
		    return obj;
		} catch (IOException e) {
			throw new CannotOpenExtratoContaCorrenteException("Não foi possível obter os lançamentos da conta corrente");
		}
	}

	
}
