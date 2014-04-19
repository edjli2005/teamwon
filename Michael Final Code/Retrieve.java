import rxtxrobot.*;

public class Retrieve {
	public  Retrieve(){}//constructor and final needed for ActionListener
	public void Retrieve(RXTXRobot r, final int Times) {
		
		for(int i=0;i<Times;i++){
			r.runMotor(RXTXRobot.MOTOR1, -130, RXTXRobot.MOTOR2, 160,1000 );//starts moving
			r.runEncodedMotor(RXTXRobot.MOTOR1, 100, 75, RXTXRobot.MOTOR2, -125, 75);
	}
		
		System.out.println("Retrieve Done");

	}
}
