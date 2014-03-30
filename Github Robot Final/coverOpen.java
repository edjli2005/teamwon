import rxtxrobot.RXTXRobot;



public class coverOpen {
	
	public coverOpen(){}//constructor 
	public void coverOpen(RXTXRobot r) {
		final Up goUp=new Up();
		
		r.moveServo(RXTXRobot.SERVO1, 170);//Opens Cover
		//goUp.Up(r, 1500);
		System.out.println("Cover Opened");
		
		
	
	}
	

	

}
