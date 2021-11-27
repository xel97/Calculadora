package controlador;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import vista.VentanaPrincipal;

public class ManejadorEventos implements ActionListener{

	
	private VentanaPrincipal ventana;
	
	
	public ManejadorEventos(VentanaPrincipal ventana){	
		this.ventana= ventana;
	}
	
	
	
	@Override
	public void actionPerformed(ActionEvent e) {
		
	//aqui tenemos que hacer lo que queremos que responda cada boton.
		ventana.getCajaTexto1();
		if(e.getSource()== ventana.getBotonSuma()) {
			
			double num1 = Double.parseDouble(ventana.getCajaTexto1().getText());
			double num2 = Double.parseDouble(ventana.getCajaTexto2().getText());
			
			double resultado= num1 + num2;
			JOptionPane.showMessageDialog(ventana, "El resultado es: " + resultado, null, JOptionPane.INFORMATION_MESSAGE);
			
		}else if(e.getSource()== ventana.getBotonResta()) {
			
			double num1 = Double.parseDouble(ventana.getCajaTexto1().getText());
			double num2 = Double.parseDouble(ventana.getCajaTexto2().getText());
			
			double resultado= num1 - num2;
			JOptionPane.showMessageDialog(ventana, "El resultado es: " + resultado, null, JOptionPane.INFORMATION_MESSAGE);
			
		}else if(e.getSource()== ventana.getBotonMul()) {
			
			double num1 = Double.parseDouble(ventana.getCajaTexto1().getText());
			double num2 = Double.parseDouble(ventana.getCajaTexto2().getText());
			
			double resultado= num1 * num2;
			JOptionPane.showMessageDialog(ventana, "El resultado es: " + resultado, null, JOptionPane.INFORMATION_MESSAGE);
			
		}else if(e.getSource()== ventana.getBotonDiv()) {
			
			double num1 = Double.parseDouble(ventana.getCajaTexto1().getText());
			double num2 = Double.parseDouble(ventana.getCajaTexto2().getText());
			
			double resultado= num1 / num2;
			JOptionPane.showMessageDialog(ventana, "El resultado es: " + resultado, null, JOptionPane.INFORMATION_MESSAGE);
			
		}else if(e.getSource()== ventana.getBotonR1()) {
			
			double num1 = Double.parseDouble(ventana.getCajaTexto1().getText());
			double num2 = Double.parseDouble(ventana.getCajaTexto2().getText());
			
			double resultado= Math.sqrt(num1);
			double resultado2=Math.sqrt(num2);
			JOptionPane.showMessageDialog(ventana, "Funcionalidad no disponible", null, JOptionPane.INFORMATION_MESSAGE);
			
		}else if(e.getSource()== ventana.getBotonR2()) {
			String contraseña="1234";
			String res= JOptionPane.showInputDialog("Escriba la contraseña");
			if(res.equals(contraseña)) {
				double num1 = Double.parseDouble(ventana.getCajaTexto1().getText());
				double num2 = Double.parseDouble(ventana.getCajaTexto2().getText());
				
				double resultado= Math.cbrt(num1);
				double resultado2=Math.cbrt(num2);
				
				JOptionPane.showMessageDialog(ventana, "La raiz cuadrada de "+ num1 + " es: " + resultado + ". La raiz cuadrada de "+ num2 + " es: " + resultado2, null, JOptionPane.INFORMATION_MESSAGE);
			}else  {
				JOptionPane.showMessageDialog(null,"Contraseña incorrecta","Cuadro 1", JOptionPane.WARNING_MESSAGE);
			}
			
			
			
			
			
		}
		
		
		
		
	
		
	}

}
