package Copiao;

import java.util.List;

public class UnidadEmergenciasBuilder {

	public static Ambulancia crearUnidadAmbulancia(int id_ambulancia, List<Trabajador> lista_Trabajadores,
			String ciudad) {
		Ambulancia ambulancia = null;
		if (lista_Trabajadores.size() == 3) {
			ambulancia = new Ambulancia(id_ambulancia, lista_Trabajadores, ciudad);
		}

		return ambulancia;
	}

	public static Bombero crearUnidadBomberos(int id_bombero, List<Trabajador> listaTrabajadores, String ciudad) {
		Bombero bombero = null;
		if (listaTrabajadores.size() == 5) {
			bombero = new Bombero(id_bombero, listaTrabajadores, ciudad);
		}
		return bombero;
	}

	public static Policia crearUnidadPolicia(int id_policia, List<Trabajador> listaTrabajadores, String ciudad) {
		Policia policia = null;
		if (listaTrabajadores.size() == 2) {
			policia = new Policia(id_policia, listaTrabajadores, ciudad);
		}
		return policia;
	}
}
