package Dao;

import java.util.List;
import java.util.Optional;

import Copiao.Policia;
import Copiao.TipoEmergencia;
import Copiao.Trabajador;

public class PoliciaDAO implements DAO<Policia>{

	@Override
	public Optional<Policia> get(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Policia> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void save(Policia t) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void update(Policia t, String[] params) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(Policia t) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public String enviarEmergencia(TipoEmergencia accidentetrafico, String text) {
		// TODO Auto-generated method stub
		return null;
	}

}
