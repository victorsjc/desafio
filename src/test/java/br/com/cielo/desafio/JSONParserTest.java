package br.com.cielo.desafio;

import static org.junit.Assert.assertNotNull;

import java.io.IOException;
import java.io.InputStream;

import org.junit.Test;

import br.com.cielo.desafio.domain.ExtratoContaCorrente;
import br.com.cielo.desafio.mapper.JacksonJsonDeserializer;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;

/**
 * A classe <code>JSONParserTest</code> realiza os testes necessários
 * para validar a classe <code>JacksonJsonDeserializer</code>.
 * 
 * @author vizawa
 *
 */
public class JSONParserTest {

	/**
	 * Valida o parse do JSON para objeto Java. O objeto de retorno
	 * deve ser deserializado corretamente, não podendo ser nulo.
	 * 
	 * @throws JsonParseException
	 * @throws JsonMappingException
	 * @throws IOException
	 */
	@Test
	public void testParseExtratoContaCorrenteSucesso() throws JsonParseException, JsonMappingException, IOException{
		final JacksonJsonDeserializer<ExtratoContaCorrente> jsonDeserializer = new JacksonJsonDeserializer<>();
	    final ClassLoader resourceLoader = Thread.currentThread().getContextClassLoader();
	    final InputStream legado = resourceLoader.getResourceAsStream("json/lancamento-conta-legado.json");	    
		ExtratoContaCorrente obj = jsonDeserializer.deserialize(legado, ExtratoContaCorrente.class);
		assertNotNull(obj);
	}
}
