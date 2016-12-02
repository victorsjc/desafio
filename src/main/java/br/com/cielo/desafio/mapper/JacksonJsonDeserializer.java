package br.com.cielo.desafio.mapper;

import java.io.IOException;
import java.io.InputStream;
import java.text.SimpleDateFormat;

import org.springframework.stereotype.Component;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

/**
 * A classe <code>JacksonJsonDeserializer</code> é responsável em deserializar
 * um JSON para objeto da classe genérica.
 * 
 * @author vizawa
 * @param <T>
 */
@Component(value="JacksonJsonDeserializer")
public class JacksonJsonDeserializer <T> implements JsonDeserializer <T> {

    private final SimpleDateFormat dateFormatter = new SimpleDateFormat("dd/MM/yyyy");
    private final ObjectMapper mapper = new ObjectMapper();
    
    /**
     * Responsável em configurar as features comuns do mapper
     */
    private void configure(){
	    mapper.enable(DeserializationFeature.USE_BIG_DECIMAL_FOR_FLOATS);
	    mapper.disable(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES);
	    mapper.setDateFormat(dateFormatter);
    }
	
    /** {@inheritDoc} */     
	public T deserialize(final InputStream stream, final Class<T> clazz) throws JsonParseException, JsonMappingException, IOException {
		configure();
		return mapper.readValue(stream, clazz);
	}
}
