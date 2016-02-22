import javax.swing.*;
import java.awt.*;

public class Ventana{

	public static void main (String ar[]){
		JFrame ventana = new JFrame("Titulo");
		ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		ventana.setVisible(true);

		Container container = ventana.getContentPane();
		container.setLayout(new GridBagLayout());

		JButton b1,b2,b3;
		b1= new JButton ("Boton1");
		b2= new JButton ("Boton2");
		b3= new JButton ("Boton3");	
	}

}
