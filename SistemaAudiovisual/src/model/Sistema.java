package model;

import java.util.ArrayList;
import java.util.List;

public class Sistema {
	private List<Audiovisual> lstAudiovisual;

	public Sistema() {
		this.lstAudiovisual = new ArrayList<Audiovisual>();
	}

	public List<Audiovisual> getLstAudiovisual() {
		return lstAudiovisual;
	}
	
	
//	CU2
//	agregar Pelicula
	public boolean agregarAudiovisual(String codAudiovisual, String titulo, int anio, boolean estreno, String genero, int duracion) throws Exception {
		return lstAudiovisual.add(new Pelicula(codAudiovisual, titulo, anio, estreno, genero, duracion));
	} 
//	CU3
//	agregar Serie
	public boolean agregarAudiovisual(String codAudiovisual, String titulo, int anio, boolean estreno, String genero,
			boolean capitulosUnitarios) throws Exception {
		return lstAudiovisual.add(new Serie(codAudiovisual, titulo, anio, estreno, genero, capitulosUnitarios));
	}
	
//	CU4
//	agregar Capitulo a Serie
	public boolean agregarCapitulo(String capitulo, int nroCapitulo, int duracion, Serie serie) {
		return serie.agregarCapitulo(capitulo, nroCapitulo, duracion);
	} 
	 
//	CU4
//	traer Audiovisual
	
	public Audiovisual traerAudiovisual(String codAudiovisual) {
		Audiovisual audi = null;
		int i = 0;
		while(audi == null && i < lstAudiovisual.size()) {
			if(lstAudiovisual.get(i).getCodAudiovisual().equals(codAudiovisual)) {
				audi = lstAudiovisual.get(i);
			}
			i++;
		}
		return audi;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
