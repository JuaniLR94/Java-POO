package Bebidas;

public class AguaMineral extends Bebida {

	private String variedad;

	public AguaMineral(double cantidad, int precio, String marca, String variedad) {
		super(cantidad, precio, marca);
		this.variedad = variedad;
	}

	public String getVariedad() {
		return variedad;
	}

	public void setVariedad(String variedad) {
		this.variedad = variedad;
	}

	@Override
	public String toString() {
		return super.toString() + "AguaMineral [variedad=" + variedad + " ";
	}
	
	
}
