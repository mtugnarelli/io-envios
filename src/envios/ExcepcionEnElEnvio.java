package envios;

public class ExcepcionEnElEnvio extends Exception {

	private static final long serialVersionUID = 1L;

	private String causa;
	
	public ExcepcionEnElEnvio(String causa) {
		super();
		this.causa = causa;
	}
	
	public String obtenerCausa() {
		
		return causa;
	}
}
