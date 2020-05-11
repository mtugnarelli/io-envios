package envios;

public class Contacto {

	private String nombre;
	private Direccion direccion;
	
	public Contacto(String nombre) {
		
		this.nombre = nombre;
	}
	
	public void asignar(Direccion direcion) {
		
		this.direccion = direcion;
	}
	
	public String identificar() throws NoSePuedeIdentificarElContacto {
		
		if (direccion == null) {
			
			throw new NoSePuedeIdentificarElContacto("No tiene dirección", this.nombre);
		}
		
		return nombre + " -> " + direccion.localizar();
	}
	
}
