import rxtxrobot.RXTXRobot;

public class main {

	public static void main(String[] args) {
		RXTXRobot r = new RXTXRobot(); // Create RXTXRobot object 
		r.setPort("COM4"); // Set the port to COM4 
		r.setVerbose(true); // Turn on debugging messages 
		r.connect(); 
		int Time=0;
		Forward moveForward= new Forward(r,Time);
		Backward moveBackward= new Backward(r,Time);
		Right turnRight= new Right(r,Time);
		Left turnLeft = new Left(r,Time);
		waterTests Sensors= new waterTests();
	}

}
