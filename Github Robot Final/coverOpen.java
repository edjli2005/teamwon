import rxtxrobot.RXTXRobot;



public class coverOpen {
	
	public coverOpen(){}//constructor 
	public void coverOpen(RXTXRobot r) {
		final Up goUp=new Up();
	
		r.moveServo(RXTXRobot.SERVO1, 90);//Opens Cover
		r.sleep(2500);
		System.out.println("Cover Opened");

		
	
	}
	

	

}
