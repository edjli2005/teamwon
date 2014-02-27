import rxtxrobot.*; 
 
public class EncoderSample 
{ 
   public static void main(String[] args) 
   { 
	RXTXRobot r = new RXTXRobot(); // Create RXTXRobot object 
	r.setPort("COM2"); // Set port to COM2 
	r.setHasEncodedMotors(true); 
	r.connect(); 
	r.runEncodedMotor(RXTXRobot.MOTOR1, -150, 100000, 	
        RXTXRobot.MOTOR2, 250, 100000); // Runs motors at 3/5 ratio for 	100,000 ticks
	r.close(); 
   } 
} 