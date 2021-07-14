
public class ProductoNoPerecedero extends Producto{

	private String tipo;

	public ProductoNoPerecedero(String nombre, String tipo, double precio) {
		super(nombre, precio);
		this.tipo=tipo;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	
	public String toString() {
		
		return super.toString()+" Tipo: "+ tipo;
	}
	
//no hace falta crear calcular() si hace lo mismo que la clase padre, 
//puede invocarlo gracias al polimorfismo.
	
	
}
