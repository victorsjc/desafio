package br.com.cielo.desafio.mapper;

import java.io.IOException;
import java.io.InputStream;

/**
 * A interface <code>JsonDeserializer</code> utilizada para padronizar os
 * deserializers Json
 * 
 * @author vizawa
 * @param <T>
 */
public interface JsonDeserializer <T> {

	/**
	 * Responsável em deserializar as informações de um objeto da classe
	 * <code>InputStream</code> para um objeto da classe <code>clazz</code>
	 * <p>Um uso comum para esse método é a conversão dos dados de um arquivo
	 * JSON para um objeto Java.</p>
	 * 
	 * @param stream representa um objeto da classe <code>InputStream</code>
	 * @param clazz representa a especificação da classe a ser deserializada
	 * @return retorna uma instância da classe especificada.
	 * @throws IOException Caso ocorra algum problema durante a transformação
	 *         dos dados serializados em objeto da classe Java.
	 */
	public T deserialize(final InputStream stream, final Class<T> clazz) throws IOException;
}
