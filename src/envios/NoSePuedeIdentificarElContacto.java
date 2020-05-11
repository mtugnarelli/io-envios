package envios;

public class NoSePuedeIdentificarElContacto extends ExcepcionEnElEnvio {

	private static final long serialVersionUID = 1L;

	private String nombre;
	
	public NoSePuedeIdentificarElContacto(String causa, String nombre) {
		
		super(causa);
		this.nombre = nombre;
	}
	
	@Override
	public String obtenerCausa() {
		
		return nombre + " " + super.obtenerCausa();
	}
}
