import rxtxrobot.RXTXRobot;



public class coverOpen {
	
	public coverOpen(){}//constructor 
	public void coverOpen(RXTXRobot r) {
		
	
		r.moveServo(RXTXRobot.SERVO1, 160);//Opens Cover
		System.out.println("Cover Opened");

		
	
	}
	

	

}
