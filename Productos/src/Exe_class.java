
public class Exe_class {

	public static void main(String[] args) {
	Producto[] productos=new Producto[3];
	
	//Polimorfismo y Enlace dinámico en tiempo de ejecucion.
	productos[0] =new Producto("Cinzano", 22.50);
	productos[1] =new ProductoPerecedero(14,"Leche Sancor",7.10);
	productos[2] =new ProductoNoPerecedero("Arroz Gallo","Cereal", 4.50);
		
	double total=0;
	
		for(int i=0;i<productos.length;i++) {
			
			total +=productos[i].calcular(5);
		}
		
		System.out.println("El total es: "+total);

	}
}
