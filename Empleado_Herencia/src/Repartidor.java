
public class Repartidor extends Empleado {

	private String zona;

	public Repartidor(String zona, String nombre, int edad, double salario) {
		super(nombre, edad, salario);
		this.zona=zona;
	}

	public String getZona() {
		return zona;
	}

	public void setZona(String zona) {
		this.zona = zona;
	}

	public boolean plus () {
		if(super.getEdad()<25 && zona.equalsIgnoreCase("zona 3")) {
			double nuevoSueldo = super.getSalario() + super.PLUS;
			System.out.println("Se ha añadido el plus al empleado"+super.getNombre());
			super.setSalario(nuevoSueldo);
			return true;
		}
		return false;
	}
	
	@Override
	public String toString() {
		return super.toString()+" zona= " + zona;
	}
	
}
