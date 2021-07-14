package bajara_de_cartas;

public class Main_Class {

	public static void main(String[] args) {
		
		Baraja b = new Baraja();
		
		b.mostrarBaraja();
		
		System.out.println(b.cartasDisponibles());
		
		b.siguienteCarta();
		b.siguienteCarta();
		b.siguienteCarta();
		
		b.cartasMonton();

	}

}
