import rxtxrobot.RXTXRobot;



public class bridgeRun {
	
	public  bridgeRun(){}//constructor and final needed for ActionListener
	public void bridgeRun(RXTXRobot r, final int Time) {
		// to get up ramp
		r.runEncodedMotor(RXTXRobot.MOTOR1, -150, Time, RXTXRobot.MOTOR2, 195, Time);
		
		System.out.println("Bridge HO!");
				
	}
	public void bridgeRun(RXTXRobot r) {
		// to get up ramp
		int IRreadings=100;
		int count=0;
		r.runEncodedMotor(RXTXRobot.MOTOR1, -150, 0, RXTXRobot.MOTOR2, 195, 0);
		while(count<8){
			r.refreshAnalogPins(); 
			IRreadings=r.getAnalogPin(5).getValue(); 
			if(IRreadings<30){
				r.runEncodedMotor(RXTXRobot.MOTOR1, -145, 0, RXTXRobot.MOTOR2, 195, 0);
				}
			if(IRreadings>30){
				r.runEncodedMotor(RXTXRobot.MOTOR1, -150, 0, RXTXRobot.MOTOR2, 190, 0);
			}
			r.sleep(250);
		}
		r.runEncodedMotor(RXTXRobot.MOTOR1, 0, 0, RXTXRobot.MOTOR2, 0, 0);
		System.out.println("Bridge HO!");
		r.close();

	}
	

	

}
