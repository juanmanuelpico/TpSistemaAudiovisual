package model;

import java.util.ArrayList;
import java.util.List;

public class Serie extends Audiovisual{
	private boolean capitulosUnitarios;
	private List<Capitulo> lstCapitulo;
	
	public Serie(String codAudiovisual, String titulo, int anio, boolean estreno, String genero,
			boolean capitulosUnitarios) throws Exception {
		super(codAudiovisual, titulo, anio, estreno, genero);
		this.capitulosUnitarios = capitulosUnitarios;
		this.lstCapitulo = new ArrayList<Capitulo>();
	}

	public boolean isCapitulosUnitarios() {
		return capitulosUnitarios;
	}

	public void setCapitulosUnitarios(boolean capitulosUnitarios) {
		this.capitulosUnitarios = capitulosUnitarios;
	}

	public List<Capitulo> getLstCapitulo() {
		return lstCapitulo;
	}

	@Override
	public String toString() {
		return "\nSerie "+super.toString()+", capitulosUnitarios=" + capitulosUnitarios + "]\n---lstCapitulo---\n" + lstCapitulo + "\n";
	}

	
// CU4
	public boolean agregarCapitulo(String capitulo, int nroCapitulo, int duracion) {
		return lstCapitulo.add(new Capitulo(capitulo, nroCapitulo, duracion));
	}

	@Override
	public int calcularDuracion() {
		int duracion = 0;
		for(Capitulo capitulo : lstCapitulo) {
			duracion += capitulo.getDuracion();
		}
		return duracion;
	}

	 
	

}
