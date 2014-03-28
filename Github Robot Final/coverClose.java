import rxtxrobot.RXTXRobot;



public class coverClose {
	
	public coverClose(){}//constructor 
	public void coverClose(RXTXRobot r) {
		r.moveServo(RXTXRobot.SERVO1, 30);//Closes Cover
		System.out.println("Cover Closed");
		
		
	
	}
	

	

}

