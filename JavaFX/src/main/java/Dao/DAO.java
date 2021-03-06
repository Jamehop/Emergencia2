package Dao;

import java.util.List;
import java.util.Optional;

import Copiao.TipoEmergencia;

public interface DAO <T> {	
		
		Optional<T> get(Long id);
	    
	    List<T> getAll();
	    
	    void save(T t) throws Exception;
	    
	    void update(T t, String[] params);
	    
	    void delete(T t);

		String enviarEmergencia(TipoEmergencia accidentetrafico, String text);
}


