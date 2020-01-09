package almacen;

public class Identificador {
	private int identificador;
	private static int identificadorActual = 0;
	
	public Identificador() {
		this.identificador = identificadorActual + 1;
		identificadorActual++;
		
	}
	
	public int getIdentificador() {
		return identificador;
	}
}
