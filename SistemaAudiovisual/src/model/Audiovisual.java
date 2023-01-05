package model;

public abstract class Audiovisual {
	protected String codAudiovisual;
	protected String titulo;
	protected int anio;
	protected boolean estreno;
	protected String genero;
	
	public Audiovisual(String codAudiovisual, String titulo, int anio, boolean estreno, String genero) throws Exception {
		setCodAudiovisual(codAudiovisual);
		this.titulo = titulo;
		this.anio = anio;
		this.estreno = estreno;
		this.genero = genero;
	}

	public String getCodAudiovisual() {
		return codAudiovisual;
	}

	public void setCodAudiovisual(String codAudiovisual) throws Exception {
		if(!validarCodigo(codAudiovisual))
			throw new Exception("Error : codigo audiovisual "+codAudiovisual+" invalido");
		this.codAudiovisual = codAudiovisual;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public int getAnio() {
		return anio;
	}

	public void setAnio(int anio) {
		this.anio = anio;
	}

	public boolean isEstreno() {
		return estreno;
	}

	public void setEstreno(boolean estreno) {
		this.estreno = estreno;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	@Override
	public String toString() {
		return "[codAudiovisual=" + codAudiovisual + ", titulo=" + titulo + ", anio=" + anio + ", estreno="
				+ estreno + ", genero=" + genero;
	}
	
	
	
	public boolean validarCodigo(String codigoAudiovisual) {
		boolean esValido = false;
		if(codigoAudiovisual.length() == 7) {
			int pares = 0;
			int impares = 0;
//			suma los numeros en las posiciones impares
			for(int i = 0; i < codigoAudiovisual.length() - 1; i = i + 2) {
				impares += Character.getNumericValue(codigoAudiovisual.charAt(i));
			}
			impares = impares*3;
//			suma los numeros en las posiciones pares
			for(int i = 1; i < codigoAudiovisual.length()-1; i = i + 2) {
				pares += Character.getNumericValue(codigoAudiovisual.charAt(i));
			}
			int resultado = pares + impares;
			int verificador = multiploDeDiez(resultado);
			
			esValido = verificador == Character.getNumericValue(codigoAudiovisual.charAt(codigoAudiovisual.length()-1));
			
		}
		
		return esValido;
	}
	
//	devuelve la cantidad que le falta a numero para que sea multiplo de 10
	public int multiploDeDiez(int numero) {
		int cantidad = 0;
		while(numero % 10 != 0) {
			numero++;
			cantidad++;
		}
		return cantidad;
	}
	
//	CU6
	public abstract int calcularDuracion(); 
	
	
	 
	
	
	
	
	
	
	
	
}
