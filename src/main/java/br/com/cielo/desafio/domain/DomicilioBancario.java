package br.com.cielo.desafio.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class DomicilioBancario {

	private Integer codigoBanco;
	private Integer numeroAgencia;
	private String numeroContaCorrente;
}
