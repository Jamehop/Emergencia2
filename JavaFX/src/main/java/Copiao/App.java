package Copiao;

import java.util.*;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Trabajador uno=new Trabajador(1, "Nombre1");
		Trabajador dos=new Trabajador(2, "Nombre2");
		Trabajador tres=new Trabajador(3, "Nombre3");
		Trabajador cuatro=new Trabajador(4, "Nombre4");
		Trabajador cinco=new Trabajador(5, "Nombre5");
		Trabajador seis=new Trabajador(6, "Nombre6");
		Trabajador siete=new Trabajador(7, "Nombre7");
		
		Ambulancia a=UnidadEmergenciasBuilder.crearUnidadAmbulancia(1, Arrays.asList(uno, dos, tres), "Zaragoza");
		Ambulancia b=UnidadEmergenciasBuilder.crearUnidadAmbulancia(2, Arrays.asList(uno, dos, tres), "Teruel");
		Ambulancia c=UnidadEmergenciasBuilder.crearUnidadAmbulancia(3, Arrays.asList(uno, dos, tres), "Huesca");
		
		Bombero d=UnidadEmergenciasBuilder.crearUnidadBomberos(1, Arrays.asList(uno, dos, tres, cuatro, cinco), "Zaragoza");
		Bombero e=UnidadEmergenciasBuilder.crearUnidadBomberos(2, Arrays.asList(uno, dos, tres, cuatro, cinco), "Teruel");
		Bombero f=UnidadEmergenciasBuilder.crearUnidadBomberos(3, Arrays.asList(uno, dos, tres, cuatro, cinco), "Huesca");
		
		Policia g=UnidadEmergenciasBuilder.crearUnidadPolicia(1, Arrays.asList(uno, dos),"Zaragoza");
		Policia h=UnidadEmergenciasBuilder.crearUnidadPolicia(2, Arrays.asList(uno, dos),"Teruel");
		Policia i=UnidadEmergenciasBuilder.crearUnidadPolicia(3, Arrays.asList(uno, dos),"Huesca");
		
		ServicioEmergenciasNacional servicioemergenciasnacional=new ServicioEmergenciasNacional(Arrays.asList(a,b,c,d,e,f,g,h,i));
		
		servicioemergenciasnacional.enviarEmergencia(TipoEmergencia.AccidenteCasero, "Huesca");
	}

}
