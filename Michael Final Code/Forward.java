import rxtxrobot.*;



public class Forward {
	
	public  Forward(){}//constructor and final needed for ActionListener
	public void Forward(RXTXRobot r, final int Time) {
		r.runMotor(r.MOTOR1, -122, Time );//starts moving		
		System.out.println("Forward Done");
		
		//r.sleep(1500);
	
	}


}
