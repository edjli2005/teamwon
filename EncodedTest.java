import rxtxrobot.*; 
 
public class EncodedTest
{ 
	public static void main(String[] args) 
	{ 
		RXTXRobot r = new RXTXRobot(); // Create RXTXRobot object 
		r.setPort("COM2"); // Set port to COM2 
		r.setHasEncodedMotors(true); 
		r.connect(); 
                r.runEncodedMotor(RXTXRobot.MOTOR1, -255, 50000, RXTXRobot.MOTOR2, 255, 50000);
                r.runEncodedMotor(RXTXRobot.MOTOR1, 255, 50000, RXTXRobot.MOTOR2, -255, 100000);
                r.runEncodedMotor(RXTXRobot.MOTOR1, -255, 50000);
                r.runEncodedMotor(RXTXRobot.MOTOR2, 255, 50000);
		r.close(); 
	} 
}