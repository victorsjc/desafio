package br.com.cielo.desafio.api;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.convert.converter.Converter;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.cielo.desafio.domain.DomicilioBancario;
import br.com.cielo.desafio.domain.ExtratoContaCorrente;
import br.com.cielo.desafio.exception.CannotOpenExtratoContaCorrenteException;
import br.com.cielo.desafio.model.ExtratoDetail;
import br.com.cielo.desafio.service.ContaCorrenteService;

@RestController
@RequestMapping("/api/extrato")
public class ExtratoContaCorrenteRestController {
	
	@Autowired ContaCorrenteService contaCorrenteService;
	
	@Autowired Converter<ExtratoContaCorrente, ExtratoDetail> extratoConverter;

	@GetMapping
    public ResponseEntity<ExtratoDetail> obterExtratoContaCorrente(Pageable pageable) throws CannotOpenExtratoContaCorrenteException{
		final DomicilioBancario contaCorrente = new DomicilioBancario();
		final Date dataInicio = new Date();
		final Date dataFinal = new Date();
		final ExtratoContaCorrente extratoContaCorrente = contaCorrenteService.obterExtratoContaCorrente(contaCorrente, dataInicio, dataFinal);		
		final ExtratoDetail extratoDetail = extratoConverter.convert(extratoContaCorrente);		
        return new ResponseEntity<>(extratoDetail, HttpStatus.OK);
    }
}
