
public abstract class Persona {

	private String nombre;
	private char sexo;
	private int edad;
	private boolean Asistencia;
	
	//constantes
	private final String[] NOMBRES_CHICOS= {"Carlos","Eduardo","Miguel","Eugenio","Lautaro"};
	private final String[] NOMBRES_CHICAS= {"Alicia","Veronica","Guadalupe","Elena","Celina"};
	private final int CHICO=1;
	private final int CHICA=0; 
	
	
	
	public Persona(){
	
		int determinar_sexo=Metodos_auxiliares.generaNumeroAleatorio(0,1);
		
		
		// Genero chicos o chicas aleatoriamente.
		if(determinar_sexo==0) {
			nombre=NOMBRES_CHICOS[Metodos_auxiliares.generaNumeroAleatorio(0,4)];
			sexo='H';
		}else{
			nombre=NOMBRES_CHICAS[Metodos_auxiliares.generaNumeroAleatorio(0,4)];
			sexo='M';
		}
		
		disponibilidad ();
		edad=Metodos_auxiliares.generaNumeroAleatorio(12,16);
		
		
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public void setNombre(String nombre) {
		this.nombre=nombre;
	}
	
	public char getSexo() {
		return sexo;
	}
	
	public void setSexo(char sexo) {
		this.sexo=sexo;
	}
	
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad=edad;
	}
	
	public boolean getAsistencia() { 
		return Asistencia;
	}
	
	public void setAsistencia(boolean Asistencia) {
		this.Asistencia=Asistencia;
	}
	
	public abstract void disponibilidad ();
}
