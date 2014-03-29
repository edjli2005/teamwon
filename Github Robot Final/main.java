import java.awt.*;

import javax.swing.JFrame;

import rxtxrobot.*;

public class main {

	public static void main(String[] args) {
		RXTXRobot r = new RXTXRobot(); // Create RXTXRobot object 
		r.setPort("COM4"); // Set the port to COM4 
		r.setVerbose(true); // Turn on debugging messages 
		r.setHasEncodedMotors(true); 
		r.connect(); //connects to robot
	//10 ticks is 1.5 in
	//1 tick is .15 in
		
		robotWindow window= new robotWindow(r);
		window.setSize(600,175);
		window.setPreferredSize(new Dimension(1000,500));
		window.setVisible(true);
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.setTitle("LOLA'S TO-DO-LIST");
		window.pack();
		window.getContentPane().setBackground(Color.pink);
		//basic window creation and robot connection
		
		
		
		
	}

}
