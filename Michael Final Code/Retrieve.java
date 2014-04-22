import rxtxrobot.*;

public class Retrieve {
	public  Retrieve(){}//constructor and final needed for ActionListener
	public void Retrieve(RXTXRobot r, final int Times) {
		
		for(int i=0;i<Times;i++){
			while(/*Bump Sensor pin*/<1000){
			r.runMotor(RXTXRobot.MOTOR1, -130, RXTXRobot.MOTOR2, 160,0 );//starts moving
			r.refreshAnalogPins();
			}
			r.runMotor(RXTXRobot.MOTOR1, -130, RXTXRobot.MOTOR2, 160,500 );
			r.runMotor(RXTXRobot.MOTOR1, 130, RXTXRobot.MOTOR2, -160,1000 );
	}
		
		System.out.println("Retrieve Done");

	}
}
