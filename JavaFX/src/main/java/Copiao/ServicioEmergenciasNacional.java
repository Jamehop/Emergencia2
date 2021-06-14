package Copiao;

import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class ServicioEmergenciasNacional{
	public List<UnidadEmergencias> todasUnidadesList;

	public ServicioEmergenciasNacional(List<UnidadEmergencias> todasUnidadesList) {
		this.todasUnidadesList = todasUnidadesList;
	}
	
	public void addNuevaUnidadActiva(UnidadEmergencias uEmergencias) {
		todasUnidadesList.add(uEmergencias);
	}
	
	public void removeUnidad(int id) {
		
	}
	
	public void enviarEmergencia(TipoEmergencia te, String ciuString) {
		System.out.print("Atencion a todas las unidades\n Espabilen porque ahi un "+te.toString()+" en "+ciuString);
		//todasUnidadesList.stream().forEach(e -> e.llamadaEmergencias(te, ciuString));
		
		for(UnidadEmergencias unidadEmergencias: todasUnidadesList) {
			unidadEmergencias.llamadaEmergencias(te, ciuString);
		}
	}
}
