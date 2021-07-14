
public class Profesor extends Persona {

	private String materia;
	
	public Profesor() {
		
		super ();
		
		super.setEdad(Metodos_auxiliares.generaNumeroAleatorio(25,50));
		
		materia=Metodos_auxiliares.MATERIAS[Metodos_auxiliares.generaNumeroAleatorio(0,2)];
		
		disponibilidad();
		
	}
	
	public String getMateria() {
		
		return materia;
	}
	
	public void setMateria(String materia) {
		
		this.materia=materia;
	}
	
	public void disponibilidad() {
		int prob=Metodos_auxiliares.generaNumeroAleatorio(0, 100);
			
			if(prob<20) {
				super.setAsistencia(false);
			}else {
				super.setAsistencia(true);
			}
		}
	
	}

