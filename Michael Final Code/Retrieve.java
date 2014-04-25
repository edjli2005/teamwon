import rxtxrobot.*;

public class Retrieve {
	public  Retrieve(){}//constructor and final needed for ActionListener
	public void Retrieve(RXTXRobot r, final int Times) {
		
		for(int i=0;i<Times;i++){
			/*while(r.getAnalogPin(2).getValue()< 900){//Top bump sensor
			r.runMotor(RXTXRobot.MOTOR1, -130, RXTXRobot.MOTOR2, 160,0 );//starts moving to dispenser
			r.refreshAnalogPins();
			}
			*/
			r.runMotor(RXTXRobot.MOTOR1, -175, RXTXRobot.MOTOR2, -175,500 );//extra in case it jams 
			r.runMotor(RXTXRobot.MOTOR1, 125, RXTXRobot.MOTOR2, 115,500 );//reverses back
	}
		
		System.out.println("Retrieve Done");

	}
}
