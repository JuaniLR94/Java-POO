
public class Executable_class {

	public static void main(String[] args) {
		
		Comercial c1=new Comercial(300, "Carlos Quevedo",32, 1500);
		Comercial c2=new Comercial(100, "Eduardo Olivera", 44,1600);

		Repartidor r1=new Repartidor("Zona 3","Eduardo Lopez", 22,2000);
		Repartidor r2=new Repartidor("Zona 6", "Silvio Capellan",29,2500);
		
		c1.plus();
		r1.plus();
		
		c2.plus();
		r2.plus();
		
		
		System.out.println(c1);
		System.out.println(r1);
		System.out.println(c2);
		System.out.println(r2);
	}

}
