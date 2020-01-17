package almacen;

public class AguaMineral extends Bebidas{
	private String origen;

	public AguaMineral(Identificador identificador, double cantidadLitros, double precio, String marca, String origen) {
		super(identificador, cantidadLitros, precio, marca);
		this.origen = origen;
	}

	@Override
	public String toString() {
		return "AguaMineral [origen=" + origen + ", getIdentificador()=" + getIdentificador() + ", getCantidadLitros()="
				+ getCantidadLitros() + ", getPrecio()=" + getPrecio() + ", getMarca()=" + getMarca() + "]";
	}

}
