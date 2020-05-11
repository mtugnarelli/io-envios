package envios;
import java.io.PrintWriter;
import java.io.StringWriter;

public class Paquete {

	private int costo;
	private double peso;
	private Contacto origen;
	private Contacto destino;
	
	public Paquete(int costo, double peso) {
		
		this.costo = costo;
		this.peso = peso;
	}
	
	public void recogerEn(Contacto contacto) {
		
		origen = contacto;
	}
	
	public void entregarEn(Contacto contacto) {
		
		destino = contacto;
	}
	
	/* pre : el origen no puede ser nulo, es decir se tiene que indicar dónde
	 * 		 se recoge el Paquete.
	 * 
	 */
	public String enviar() throws ExcepcionEnElEnvio {
		
		if (origen == null) {
			throw new NoSePuedeEnviarElPaquete("No tiene origen");
		}

		if (destino == null) { 
			throw new NoSePuedeEnviarElPaquete("No tiene destino");
		}
			
		StringWriter salida = new StringWriter();
		PrintWriter impresor = new PrintWriter(salida);
		
		try {
			impresor.println("********************");
			impresor.println("Paquete");
			impresor.println("--------------------");
			impresor.print("Peso: ");
			impresor.println(peso);
			impresor.print("Costo: ");
			impresor.println(costo);
			impresor.print("Retirar: ");
			impresor.println(origen.identificar());
			impresor.print("Entregar: ");
			impresor.println(destino.identificar());
			
		} finally {
			
			impresor.close();
		}

		return salida.toString();
	}
}
