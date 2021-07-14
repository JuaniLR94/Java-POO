package Bebidas;

public class Mostrador_Main {

	public static void main(String[] args) {
	
		Almacen a= new Almacen();
		
		Bebida b;
		
		for(int i=0;i<10;i++) {
			switch(i%2) {
			
			case 0:
		//double cantidad, int precio, String marca, String variedad
				b=new AguaMineral( 2.5, 5 ,"de manantial", "villavicencio");
				a.agregarBebida(b);
				break;

			case 1:
				b=new BebidaAzucarada(2,10, "zucaris" , 20, true);
				a.agregarBebida(b);
				break;
				
			}
		
			
		}
		
		
		a.mostrarBebidas();
		
		System.out.println(a.calcularPrecioBebidas());
		
		a.eliminarBebida(4);
		
		a.mostrarBebidas();
	}

}
