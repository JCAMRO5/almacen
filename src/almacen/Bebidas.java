package almacen;

public class Bebidas {
	private Identificador identificador;
	private double cantidadLitros;
	private double precio;
	private String marca;
	
	public Bebidas(Identificador identificador, double cantidadLitros, double precio, String marca) {
		this.identificador = identificador;
		this.cantidadLitros = cantidadLitros;
		this.precio = precio;
		this.marca = marca;
	}

	public Identificador getIdentificador() {
		return identificador;
	}

	public void setIdentificador(Identificador identificador) {
		this.identificador = identificador;
	}

	public double getCantidadLitros() {
		return cantidadLitros;
	}

	public void setCantidadLitros(double cantidadLitros) {
		this.cantidadLitros = cantidadLitros;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	@Override
	public String toString() {
		return "Bebidas [identificador=" + getIdentificador() + ", cantidadLitros=" + cantidadLitros + ", precio=" + precio
				+ ", marca=" + marca + "]";
	}
	
	
}
