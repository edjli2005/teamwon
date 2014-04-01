import rxtxrobot.*;

public class Retrieve {
	public  Retrieve(){}//constructor and final needed for ActionListener
	public void Retrieve(RXTXRobot r, final int Times) {
		
		for(int i=0;i<Times;i++){
			r.runEncodedMotor(RXTXRobot.MOTOR1, -105, 50, RXTXRobot.MOTOR2, 125, 50);
			r.runEncodedMotor(RXTXRobot.MOTOR1, 105, 50, RXTXRobot.MOTOR2, -125, 50);
	}
		
		System.out.println("Retrieve Done");

	}
}
