import java.awt.*;
import java.io.*;

import javax.swing.JFrame;

import rxtxrobot.*;

public class main {

	public static void main(String[] args) {//PROGRAM ARDUINO IN ANSI C
		RXTXRobot r = new RXTXRobot(); // Create RXTXRobot object 
		r.setPort("COM3"); // Set the port to COM4 
		r.setVerbose(true); // Turn on debugging messages 
		r.setHasEncodedMotors(true); 
		//r.connect(); //connects to robot
		//10 ticks is 1.5 in
		//1 tick is .15 in
		/*PrintStream Carrol = null;//new PrintStream('End of all time");
		try {
			Carrol = new PrintStream(new File("output.txt"));
			//System.out.println("Ryan Hardy is meaningless to Carrol??!!");
		} 
		catch (FileNotFoundException e) {
			e.printStackTrace();
			System.out.println("OMFG CLAIRE'S ALIVE!!!!");
		}
		System.setOut(Carrol);
		//System.out.println("Why not Poe?");
		//Carrol.println("Ryan Hardy. The one cop who refuses to carry a tazer. Despite the hordes of crazies with knives.");
		*/
		try{
			File file= new File("output.txt");
			FileOutputStream FOS = new FileOutputStream(file, true);
			PrintStream HA = new PrintStream(FOS);
			System.setOut(HA);
			FOS.toString();
		}
		catch (FileNotFoundException e) {
			e.printStackTrace();
			System.out.println("OMFG CLAIRE'S ALIVE!!!!");
		}
		System.out.println("YOYO");
		
		robotWindow window= new robotWindow(r);
		window.setSize(600,175);
		window.setPreferredSize(new Dimension(1000,500));
		window.setVisible(true);
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.setTitle("LOLA'S TO-DO-LIST");
		window.pack();
		window.getContentPane().setBackground(Color.black);
		//basic window creation and robot connection
		
		
		
		
	}

}
