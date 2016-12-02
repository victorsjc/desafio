package br.com.cielo.desafio.domain;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ExtratoContaCorrente {

	private List<ControleLancamento> listaControleLancamento;	
}
