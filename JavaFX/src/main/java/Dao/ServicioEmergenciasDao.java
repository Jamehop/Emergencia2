package Dao;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import Copiao.*;

public class ServicioEmergenciasDao implements DAO<UnidadEmergencias> {
	private List<UnidadEmergencias> unidadesActivas = new ArrayList<>();

	@Override
	public Optional<UnidadEmergencias> get(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<UnidadEmergencias> getAll() {
		// TODO Auto-generated method stub
		return unidadesActivas;
	}

	@Override
	public void save(UnidadEmergencias t) throws Exception{
		// TODO Auto-generated method stub
		unidadesActivas.add(t);
	}

	@Override
	public void update(UnidadEmergencias t, String[] params) {
		// TODO Auto-generated method stub

	}

	@Override
	public void delete(UnidadEmergencias t) {
		// TODO Auto-generated method stub
		unidadesActivas.remove(0);
	}
	
	@Override
	public String enviarEmergencia(TipoEmergencia te, String provincia) {
		String textoString="### Atención a todas las Unidades ###\\n ## Emergencia:"+te.toString()+" en la provincia "+provincia;
		//unidadesActivas.stream().forEach(e -> e.llamadaEmergencias(te, provincia));
		for(UnidadEmergencias trabajador: unidadesActivas) {
			textoString=textoString+(trabajador.llamadaEmergencias(te, provincia));
		}
		
		return textoString;
		
		
	}

}
