package test;

import model.Pelicula;
import model.Serie;
import model.Sistema;

public class TestModel {

	public static void main(String[] args) {
		Sistema sistema = new Sistema();
		System.out.println("\n\n----- TEST 1 -----\n\n");
		
		try {
			sistema.agregarAudiovisual("7389189", "TODOS TENEMOS UN MUERTO", 2021, true, "COMEDIA DRAMATICA", 103);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
		System.out.println("\n\n----- TEST 2 -----\n\n");
		
		try {
			sistema.agregarAudiovisual("1732485", "Los simuladores", 2003, false, "DRAMA SOCIAL", true);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
		System.out.println("\n----- TEST 3 -----\n");
		
		try {
			sistema.agregarAudiovisual("3748916", "CORONADOS DE GLORIA", 2019, false, "DOCUMENTAL", false);
			sistema.agregarAudiovisual("4689735", "LUNA DE AVELLANEDA", 2004, false, "COMEDIA DRAMATICA", 139);
			sistema.agregarAudiovisual("7389182", "TODOS TENEMOS UN MUERTO", 2021, true, "COMEDIA DRAMATICA", 103);
			sistema.agregarAudiovisual("1732489", "Los simuladores", 2003, false, "DRAMA SOCIAL", true);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		Serie serie = (Serie)sistema.traerAudiovisual("3748916");
		sistema.agregarCapitulo("EL PRIMER TITULO", 2, 13, serie);
		sistema.agregarCapitulo("LA GENESIS DE LA GENERACION DORADA", 1, 40, serie);
		
		serie = (Serie)sistema.traerAudiovisual("1732489");
		sistema.agregarCapitulo("Capitulo 2", 2, 35, serie);
		sistema.agregarCapitulo("Capitulo 1", 1, 40, serie);
		System.out.println(sistema.getLstAudiovisual());
		
		System.out.println("\n----- TEST 4 -----\n");
		
		System.out.println(sistema.traerAudiovisual("4689735"));
		
		System.out.println("\n----- TEST 5 -----\n");
		System.out.println("tiempo : "+sistema.traerAudiovisual("4689735").calcularDuracion());
		
         System.out.println("\n----- TEST 6 -----\n");
		
		System.out.println(sistema.traerAudiovisual("3748916"));
		System.out.println("\n----- TEST 7 -----\n");
		System.out.println("tiempo : "+sistema.traerAudiovisual("3748916").calcularDuracion());
		
		
		
		
		
		
		
		
		
		
	}
	
	

}
