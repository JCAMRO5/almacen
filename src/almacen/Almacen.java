package almacen;

public class Almacen {
	private Bebidas[][] estanteria;
	
	public Almacen(int filas, int columnas) {
		estanteria = new Bebidas[filas][columnas];
	}
	public Almacen() {
		estanteria = new Bebidas[5][5];
	}
	
	public void agregarBebida(Bebidas b) {
		boolean encontrado = false;
		for (int i = 0; i < estanteria.length & !encontrado; i++) {
			for (int j = 0; j < estanteria.length & !encontrado; j++) {
				if (estanteria [i][j] == null) {
					estanteria[i][j]= b;
					encontrado = true;
					
				}
			}
		}
		if(encontrado) {
			System.out.println("Bebida añadida");
		}else {
			System.out.println("No se ha podido añadir la bebida");
		}
		
	}
	
	public void eliminarBebida(Identificador id) {
		boolean encontrado = false;
		for (int i = 0; i < estanteria.length & !encontrado; i++) {
			for (int j = 0; j < estanteria.length & !encontrado; j++) {
				if (estanteria[i][j] != null) {
					if (estanteria[i][j].getIdentificador() == id) {
						estanteria[i][j] = null;
						encontrado = true;
					}
					
				}
			}
		}
		if (encontrado) {
			System.out.println("Se ha eliminado la bebida");
		}else {
			System.out.println("No existe la bebida");
		}
		
	}
	
	public void mostrarBebidas() {
		for (int i = 0; i < estanteria.length; i++) {
			for (int j = 0; j < estanteria.length; j++) {
				System.out.println("Fila: " + i + "Columna: " + j +"Bebida" + estanteria[i][j]);
			}
			
		}
	}
}
