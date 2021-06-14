package Copiao;

import java.util.List;

public abstract class UnidadEmergencias{
	public int id;
	public List<Trabajador> listaTrabajadors;
	public String ciudadString;
	
	public UnidadEmergencias(int id, List<Trabajador> listaTrabajadors, String ciudadString) {
		super();
		this.id = id;
		this.listaTrabajadors = listaTrabajadors;
		this.ciudadString = ciudadString;
	}
	public String llamadaEmergencias(TipoEmergencia te, String ciudaString ) {
		return null;};
	
}
