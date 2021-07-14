package Bebidas;

public class BebidaAzucarada extends Bebida {

	private int porcentajeAzucar;
	private boolean promocion;
	public BebidaAzucarada(double cantidad, int precio, String marca, int porcentajeAzucar, boolean promocion) {
		super(cantidad, precio, marca);
		this.porcentajeAzucar = porcentajeAzucar;
		this.promocion = promocion;
	}
	public int getPorcentaje() {
		return porcentajeAzucar;
	}
	public void setPorcentaje(int porcentaje) {
		this.porcentajeAzucar = porcentaje;
	}
	public boolean isPromocion() {
		return promocion;
	}
	public void setPromocion(boolean promocion) {
		this.promocion = promocion;
	}
	
	@Override
	public double getPrecio(){
		if(isPromocion()) {
			return super.getPrecio()*0.9;
		}else {
			return super.getPrecio();
		}
	}
	@Override
	public String toString() {
		return super.toString() + "Porcentaje de azucar=" + porcentajeAzucar + ", promocion=" + promocion + " ";
	}
	
}
