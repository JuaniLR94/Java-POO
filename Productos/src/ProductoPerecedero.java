
public class ProductoPerecedero extends Producto {

	private int diasACaducar;
	public ProductoPerecedero (int diasACaducar, String nombre, double precio ) {
		super(nombre, precio);
		this.diasACaducar=diasACaducar;
	
	}
	
	public void setdiasACaducar(int dias) {
		
		diasACaducar= dias;
	}
	
	public int getdiasACaducar () {

		return diasACaducar;
	}
	
	public String toString() {
		
		return super.toString()+"Dias para que caduque: "+diasACaducar+" dias.";
	}
	
	@Override
	public double calcular(int cantidad) {
		
		double precioFinal= super.calcular(cantidad);
		
		switch (diasACaducar) {
		case 1:
			precioFinal=precioFinal/4;
			break;
		case 2:
			precioFinal=precioFinal/3;
			break;
		case 3:
			precioFinal=precioFinal/2;
			break;					
		}
		
		return precioFinal;
	}
	
}
