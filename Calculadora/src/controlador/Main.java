package controlador;

import vista.VentanaPrincipal;// importo la clase porque la clase ventanaPrincipal esta en otro paquete

public class Main {

	public static void main(String[] args) {
		
		//creo mi ventana y el manejador, como cada uno necesita del otro los 2 estan refenciados en el otro
		VentanaPrincipal miVentana = new VentanaPrincipal();
		ManejadorEventos manejador= new ManejadorEventos(miVentana);
		miVentana.establecerManejador(manejador);
		
	}

}
