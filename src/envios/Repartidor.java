package envios;

public class Repartidor {

	public static void main(String[] args) {
		
		Repartidor repartidor = new Repartidor();
		repartidor.trabajar();
	}

	public void trabajar() {
		
		System.out.println("-- INICIO --");

		Paquete[] paquetes = new Paquete[3];
		Contacto origen;
		Contacto destino;
		
		/* Primero */ 
		paquetes[0] = new Paquete(300, 1.5);

		origen = new Contacto("Juan Perez", "35741856");
		origen.asignar(new Direccion("Urquiza","1245","Caseros","1678"));
		paquetes[0].recogerEn(origen);
		
		destino = new Contacto("Ana Fernandez", "34567345");
		destino.asignar(new Direccion("Ntra. Sra de La Merced","5048","Caseros","1678"));
		paquetes[0].entregarEn(destino);
		
		/* Segundo */ 
		paquetes[1] = new Paquete(500, 3.5);

		origen = new Contacto("Martin Lopez", "232123213");
		origen.asignar(new Direccion("Rivadavia","2134","CABA","1121"));
		paquetes[1].recogerEn(origen);
		
		destino = new Contacto("Lucas Gomez", "45678322");
		destino.asignar(new Direccion("Callao","2134","CABA","1122"));
		paquetes[1].entregarEn(destino);

		
		/* Tercero */
		paquetes[2] = new Paquete(120, 0.3);

		origen = new Contacto("Liliana Garcia", "42345673");
		origen.asignar(new Direccion("Urquiza","1245","Caseros","1678"));
		paquetes[2].recogerEn(origen);
		
		destino = new Contacto("Marcos Paz", "55829394");
		destino.asignar(new Direccion("Mansilla","2321","CABA","1342"));
		paquetes[2].entregarEn(destino);

		for(int i = 0; i < paquetes.length; i++) {

			Paquete unPaquete = paquetes[i];
			
			System.out.println(unPaquete.enviar());
		}
		System.out.println("-- FIN --");
	}

	/* Qué pasa si comentamos únicamente la línea 33 */
	/* Qué pasa si comentamos únicamente la línea 49 */
	/* Qué pasa si comentamos únicamente la línea 44 */
	/* Qué pasa si comentamos las líneas 33 y 44 */
	
	/* Controlar las excepciones para todos los paquetes que estén completos se puedan enviar */
}
