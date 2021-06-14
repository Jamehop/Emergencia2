package Dao;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import Copiao.TipoEmergencia;
import Copiao.Trabajador;

public class TrabajadorDAO implements DAO<Trabajador> {

	private List<Trabajador> misTrabajadores = new ArrayList<>();

	public TrabajadorDAO() {
		misTrabajadores.add(new Trabajador(1, "Carlos"));
		misTrabajadores.add(new Trabajador(2, "Juan"));
		misTrabajadores.add(new Trabajador(3, "Kul"));
		misTrabajadores.add(new Trabajador(4, "Trash"));
		misTrabajadores.add(new Trabajador(5, "Ponmo"));
		misTrabajadores.add(new Trabajador(6, "Jungo"));
		misTrabajadores.add(new Trabajador(7, "Reto"));
		misTrabajadores.add(new Trabajador(8, "Lulo"));
	}

	@Override
	public List<Trabajador> getAll() {
		// TODO Auto-generated method stub
		return misTrabajadores;
	}

	@Override
	public void save(Trabajador t) {
		misTrabajadores.add(t);
	}

	@Override
	public void update(Trabajador t, String[] params) {
		t.setId_trabajador(1);
		t.setNombre("UpdateNombre");

	}

	@Override
	public void delete(Trabajador t) {
		misTrabajadores.remove(t);

	}

	@Override
	public Optional<Trabajador> get(Long id) {
		// TODO Auto-generated method stub
		int int_id=Math.toIntExact(id);
		return Optional.ofNullable(misTrabajadores.get(int_id));
	}

	@Override
	public String enviarEmergencia(TipoEmergencia accidentetrafico, String text) {
		// TODO Auto-generated method stub
		return null;
	}

}
