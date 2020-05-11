package envios;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class LectorDeEnvios {
	
	public static void main(String[] args) {
		
		try {
		
			new LectorDeEnvios().leer();
		
		} catch (ExcepcionEnElEnvio e) {
			
			e.printStackTrace();
		}
	}

	public Paquete[] leer() throws ExcepcionEnElEnvio {
		
		try {
			
			BufferedReader lector = new BufferedReader(new FileReader("datos/envios.txt"));

			try {
				
				String linea = lector.readLine();
				
				while (linea != null) {

					linea = linea.trim();
					
					if (!linea.isEmpty()) {
						
						String[] partes = linea.split(",");
						
						int costo = Integer.parseInt(partes[0]);
						double peso = Double.parseDouble(partes[1]);
						
						System.out.println("Costo : " + costo);
						System.out.println("Peso  : " + peso);
					}
					
					linea = lector.readLine();
				}

			} finally {
				
				lector.close();
			}
			
		} catch (FileNotFoundException e) {
			
			throw new ExcepcionEnElEnvio("No se puede encontrar el archivo con los envios");

		} catch (IOException e) {
			
			throw new ExcepcionEnElEnvio("Ocurrió una falla al leer el archivo");
		}	
		
		return null;
	}
}
