package bajara_de_cartas;

public class Carta {
	
	private int numero;
	private String palo;
	
	public static final int LIMITE_CARTA_PALO=12;
	public static final String[] PALOS= {"Espada","Oro","Copa","Basto"};

	public Carta(int numero, String palo) {
		super();
		this.numero = numero;
		this.palo = palo;
	}

	@Override
	public String toString() {
		return "numero=" + numero + ", palo=" + palo ;
	}
	
	
	
	
}
