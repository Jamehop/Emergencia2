package Copiao;

import java.util.List;

public class Bombero extends UnidadEmergencias{

	public Bombero(int id, List<Trabajador> listaTrabajadors, String ciudadString) {
		super(id, listaTrabajadors, ciudadString);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String llamadaEmergencias(TipoEmergencia te, String provincia) {
		String text="";
		if (this.ciudadString.equals(provincia) 
				&& (te.equals(TipoEmergencia.AccidenteTrafico) 
						|| te.equals(TipoEmergencia.IncendioInundacion))) {
			//System.out.println("## Unidad de Bomberos: " + this.id + " con base en " + this.provincia + " se dirige a la llamada! ");
			text = "## Unidad de Bomberos: " + this.id + " con base en " + this.ciudadString + " se dirige a la llamada! "  +"\n";
		}
		
		return text;
	}
	
	
	
}
