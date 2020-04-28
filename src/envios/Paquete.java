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
	
	public String enviar() {
		
		StringWriter salida = new StringWriter();
		PrintWriter impresor = new PrintWriter(salida);
		
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

		impresor.close();
		return salida.toString();
	}
}
