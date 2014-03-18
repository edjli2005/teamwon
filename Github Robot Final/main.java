import rxtxrobot.RXTXRobot;

public class main {

	public static void main(String[] args) {
		RXTXRobot r = new RXTXRobot(); // Create RXTXRobot object 
		r.setPort("COM4"); // Set the port to COM4 
		r.setVerbose(true); // Turn on debugging messages 
		r.connect(); 
		int Time=3000;
		Forward moveForward= new Forward();
		//Backward moveBackward= new Backward();
		//Right turnRight= new Right();
		//Left turnLeft = new Left();
		//waterTests Sensors= new waterTests();
		moveForward.Forward(r,Time);
		//turnLeft.Left(r,Time);
		//moveRight(r,Time);
		//moveBackward.Backward(r,Time);
		r.close();
	}

}
