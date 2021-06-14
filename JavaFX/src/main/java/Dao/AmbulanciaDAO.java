package Dao;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import Copiao.*;

public class AmbulanciaDAO implements DAO<Ambulancia> {

	private List<Ambulancia> misAmbulancias = new ArrayList<>();

	public AmbulanciaDAO() {
		
	}

	@Override
	public Optional<Ambulancia> get(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Ambulancia> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void save(Ambulancia t) {
		// TODO Auto-generated method stub

	}

	@Override
	public void update(Ambulancia t, String[] params) {
		// TODO Auto-generated method stub

	}

	@Override
	public void delete(Ambulancia t) {
		misAmbulancias.remove(t);

	}

	@Override
	public String enviarEmergencia(TipoEmergencia accidentetrafico, String text) {
		// TODO Auto-generated method stub
		return null;
	}

}
