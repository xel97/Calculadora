package vista;

import java.awt.Color;
import java.awt.Font;
import java.awt.Toolkit;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import controlador.ManejadorEventos;

public class VentanaPrincipal extends JFrame{								//importamos JFrame
	

	//ahora vamos a meter los controles(componentes de la ventana
	//todos funcionan ingual se crean, se les da tamaño y una ubicacion en el contenedor y añadirlos a la ventana
	//todos los componentes de la ventana provienen de la clase JFrame por lo que se les considera propiedades por lo que deben ir al principio
	
	private JLabel logo;
	private JLabel etiqueta1;
	private JTextField cajaTexto1 ;
	private JLabel etiqueta2;
	private JTextField cajaTexto2 ;
	private JButton botonSuma;
	private JButton botonResta;
	private JButton botonMul;
	private JButton botonDiv;
	private JButton botonR1;
	private JButton botonR2;
	
	public VentanaPrincipal() {
		
		//propiedades de la ventana
		
		setSize(285,445);													//tamaño
		setLocationRelativeTo(null);										//se centra en pantalla    //setBounds(x, y, w, h) 2 en 1 primero localizacion y luego tamaño
		setDefaultCloseOperation(EXIT_ON_CLOSE);							//como se comporta la maquina al cerrar la ventana
		setResizable(false);												//Evitar que se cambie el tamaño de la ventana
		setTitle("Calculadora");											//Poner un titulo, lo que aparece en la zona de cerrar,minimizar ,etc
		setIconImage(Toolkit.getDefaultToolkit().getImage("icono.png"));	//Poner el icono de la aplicacion
		setLayout(null);													//cuando ponemos controles o botones en una ventana hay un organizador para organizar los botones(layout)
																			// como los organizamos manualmente desactivamos el layout
		//ahora creamos y ubicamos las propiedades de arriba en la ventana
		inicializarComponentes();											//lo hacemos en un metodo para tenerlo ordenado todo

		setVisible(true);													//Como hacerla visible. Tiene que ir como ultimo metodo para que no de fallos
		
		
	}
	
	
	private void inicializarComponentes() {
		
		getContentPane().setBackground(new Color(50,50,50));//color de fondo
		//para sustituir una frase como" numero 1" por una una imagen
		//etiqueta1 = new JLabel(new ImageIcon("Numero1.png"));	
		//etiqueta1 = new JLabel("numero1");
		
		
		logo = new JLabel(new ImageIcon("IconP.png"));			
		logo.setBounds(90, 50, 100, 100);							//Ubicacion y tamaño
		add(logo);							
		
		
		
		etiqueta1 = new JLabel(new ImageIcon("Grupo 1.png"));									//inicializamos el componente(crear)
			etiqueta1.setBounds(45, 180, 100, 30);							//Ubicacion y tamaño
			add(etiqueta1);													//añadir 
		
		cajaTexto1 = new JTextField();
			
			cajaTexto1.setBounds(155, 180, 60, 30);							
			cajaTexto1.setBorder(null);										//eliminar el borde de la caja texto
			cajaTexto1.setFont(new Font("Rial",Font.BOLD,16));				//Cambiamos la fuente, en dialog el tipo de letra , En BOLD negrita, 14 el tamaño
			cajaTexto1.setForeground(new Color(223,99,31));					//Color texto dentro caja
			cajaTexto1.setBackground(Color.DARK_GRAY);						// Cambiar color de fondo
			add(cajaTexto1);													 
																				
		etiqueta2 = new JLabel(new ImageIcon("Grupo 2.png"));									
			etiqueta2.setBounds(45, 220, 100, 30);								
			add(etiqueta2);													
		
		cajaTexto2 = new JTextField();										
			cajaTexto2.setBounds(155, 220, 60, 30);	
			cajaTexto2.setBorder(null);										//eliminar el borde de la caja texto
			cajaTexto2.setFont(new Font("Rial",Font.BOLD,16));				//Cambiamos la fuente, en dialog el tipo de letra , En BOLD negrita, 14 el tamaño
			cajaTexto2.setForeground(new Color(223,99,31));					//Color texto dentro caja
			cajaTexto2.setBackground(Color.DARK_GRAY);
			add(cajaTexto2);					
		
		botonSuma = new JButton(new ImageIcon("Suma2.png"));										
			botonSuma.setBounds(30, 270, 100, 30);
			botonSuma.setBackground(Color.ORANGE);
			botonSuma.setFont(new Font("Arial",Font.BOLD,16));
			botonSuma.setBorder(null);
			add(botonSuma);														 	
			
			
		botonResta = new JButton(new ImageIcon("resta.png"));										
			botonResta.setBounds(140, 270, 100, 30);	
			botonResta.setBorder(null);
			add(botonResta);
			
		botonMul = new JButton(new ImageIcon("multiplicar.png"));										
			botonMul.setBounds(30, 310, 100, 30);
			botonMul.setBorder(null);
			add(botonMul);	
		
		botonDiv = new JButton(new ImageIcon("dividir.png"));										
			botonDiv.setBounds(140, 310, 100, 30);		
			botonDiv.setBorder(null);
			add(botonDiv);	
			
		botonR1 = new JButton(new ImageIcon("raiz2.png"));										
			botonR1.setBounds(30, 350, 100, 30);
			botonR1.setBorder(null);
			add(botonR1);	
			
		botonR2 = new JButton(new ImageIcon("Raiz3.png"));										
			botonR2.setBounds(140, 350, 100, 30);
			botonR2.setBorder(null);
			add(botonR2);	
		
	}
	//funcion de escucha
	public void establecerManejador(ManejadorEventos manejador) {
		botonSuma.addActionListener(manejador);
		botonResta.addActionListener(manejador);
		botonMul.addActionListener(manejador);
		botonDiv.addActionListener(manejador);
		botonR1.addActionListener(manejador);
		botonR2.addActionListener(manejador);
	}
	
	//getter and setters
	public JTextField getCajaTexto1() {
		return cajaTexto1;
	}


	public JTextField getCajaTexto2() {
		return cajaTexto2;
	}
	
	public JButton getBotonSuma() {
		return botonSuma;
	}


	public JButton getBotonResta() {
		return botonResta;
	}


	public JButton getBotonMul() {
		return botonMul;
	}


	public JButton getBotonDiv() {
		return botonDiv;
	}


	public JButton getBotonR1() {
		return botonR1;
	}


	public JButton getBotonR2() {
		return botonR2;
	}

}
