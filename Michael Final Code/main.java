import java.awt.*;
import java.io.*;

import javax.swing.JFrame;

import rxtxrobot.*;

public class main {

	public static void main(String[] args) {//PROGRAM ARDUINO IN ANSI C
		RXTXRobot r = new RXTXRobot(); // Create RXTXRobot object 
		r.setPort("COM8"); // Set the port to COM4 
		//r.setVerbose(true); // Turn on debugging messages 
		r.setHasEncodedMotors(true); 
		//r.connect(); //connects to robot
			//10 ticks is 1.5 in
			//1 tick is .15 in
			
			
			robotWindow window= new robotWindow(r);
			window.setSize(1200,350);
			window.setPreferredSize(new Dimension(1250,600));
			window.setVisible(true);
			window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			window.setTitle("LOLA'S TO-DO-LIST");
			window.pack();
			window.getContentPane().setBackground(Color.black);
			//basic window creation and robot connection
			

		
		
		
	}

}
