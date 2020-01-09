package almacen;

public class BebidaAzucarada extends Bebidas {
	private double porcentajeAzucar;
	private boolean promocion;

	public BebidaAzucarada(Identificador identificador, double cantidadLitros, double precio, String marca,
			double porcentajeAzucar, boolean promocion) {
		super(identificador, cantidadLitros, precio, marca);
		this.porcentajeAzucar = porcentajeAzucar;
		this.promocion = promocion;
	}

	public double getPorcentajeAzucar() {
		return porcentajeAzucar;
	}

	public void setPorcentajeAzucar(double porcentajeAzucar) {
		this.porcentajeAzucar = porcentajeAzucar;
	}

	public boolean isPromocion() {
		return promocion;
	}

	public void setPromocion(boolean promocion) {
		this.promocion = promocion;
	}

	@Override
	public double getPrecio() {
		if (promocion) {
			return super.getPrecio() * 0.9;

		}
		return super.getPrecio();
	}

}
