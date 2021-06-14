package Copiao;

import java.util.List;

public class Ambulancia extends UnidadEmergencias {

	public Ambulancia(int id, List<Trabajador> listaTrabajadors, String ciudadString) {
		super(id, listaTrabajadors, ciudadString);

	}

	@Override
	public String llamadaEmergencias(TipoEmergencia te, String provincia) {
		String texto = "";

		if (this.ciudadString.equals(provincia)
				&& (te.equals(TipoEmergencia.AccidenteTrafico) || te.equals(TipoEmergencia.AccidenteCasero))) {
			// System.out.println("## Unidad de Ambulancia: " + this.id + " con base en " +
			// this.provincia + " se dirige a la llamada! ");
			texto = "## Unidad de Ambulancia: " + this.id + " con base en " + this.ciudadString
					+ " se dirige a la llamada! " + "\n";
		}

		return texto;
	}

}
