package envios;

public class Direccion {

	private String calle;
	private String numero;
	private String ciudad;
	
	public Direccion(String calle, String numero, String ciudad) {
		
		this.calle = calle;
		this.numero = numero;
		this.ciudad = ciudad;
	}
	
	public String localizar() {

		return calle + " Nro " + numero + " (" + ciudad + ")"; 
	}
}
