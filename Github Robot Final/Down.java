import rxtxrobot.*;


public class Down {
	public  Down(){}//constructor and final needed for ActionListener
	public void Down(RXTXRobot r, final int Time) {
		r.runMotor(RXTXRobot.MOTOR4, -120,Time );//starts moving
		r.runMotor(RXTXRobot.MOTOR4, 150,50 );//brakes

		
		
		System.out.println("Down Done");
		//r.sleep(1500);
		
	}
	

	

}

