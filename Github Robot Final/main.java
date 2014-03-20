import java.awt.*;

import javax.swing.JFrame;

import rxtxrobot.RXTXRobot;

public class main {

	public static void main(String[] args) {
		RXTXRobot r = new RXTXRobot(); // Create RXTXRobot object 
		r.setPort("COM4"); // Set the port to COM4 
		r.setVerbose(true); // Turn on debugging messages 
		//r.connect(); //connects to robot
	
		
		robotWindow window= new robotWindow(r);
		window.setSize(600,175);
		window.setPreferredSize(new Dimension(1000,500));
		window.setVisible(true);
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.setTitle("LOLA'S TO-DO-LIST");
		window.pack();
		window.getContentPane().setBackground(Color.pink);
		//basic window creation and robot connection
		
		
		
		
		/*
		 int Time=5000;
		Forward moveForward= new Forward();
		Backward moveBackward= new Backward();
		Right turnRight= new Right();
		Left turnLeft = new Left();
		Up goUp=new Up();
		Down goDown=new Down();
		waterTests testWater= new waterTests();
		salinityTest testSalinity = new salinityTest();
		turbidityTest testTurbidity= new turbidityTest();
		FullRun LolasFolly= new FullRun();
		*/
		
		/*moveForward.Forward(r,Time);
		turnLeft.Left(r,Time);
		moveRight(r,Time);
		moveBackward.Backward(r,Time);
		r.close();
		*/
	}

}
