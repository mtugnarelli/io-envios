package envios;

public class Contacto {

	private String nombre;
	private String dni;
	private Direccion direccion;
	
	public Contacto(String nombre, String dni) {
		
		this.nombre = nombre;
		this.dni = dni;
	}
	
	public void asignar(Direccion direcion) {
		
		this.direccion = direcion;
	}
	
	public String identificar() {
		
		return nombre + 
				" DNI " + dni +
				" -> " + direccion.localizar();
	}
}
