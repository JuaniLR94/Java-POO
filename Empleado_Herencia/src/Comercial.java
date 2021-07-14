
public class Comercial extends Empleado {

	private double comision;

	public Comercial(double comision, String nombre, int edad, double salario) {
		super(nombre, edad, salario);
		this.comision=comision;	
	}
	
	public double getComision() {
		return comision;
	}

	public void setComision(double comision) {
		this.comision = comision;
	}

	@Override
	public String toString() {
		return super.toString()+" comision= " + comision ;
	}

	public boolean plus () {
		if(super.getEdad()>30 && this.comision>200) {
			super.setSalario(super.getSalario() + super.PLUS);
			System.out.println("Se ha añadido el plus al empleado"+super.getNombre());
			return true; // no es necesario
		}
		return false;
	}
		
	
}
