package envios;

public class NoSePuedeEnviarElPaquete extends ExcepcionEnElEnvio {

	private static final long serialVersionUID = 1L;

	public NoSePuedeEnviarElPaquete(String causa) {
		super(causa);
	}	
}
