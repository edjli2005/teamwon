import rxtxrobot.RXTXRobot;


public class getEPosition {
	public getEPosition(){}
	public int[] getEPosition(RXTXRobot r){
		int RMotor =r.getEncodedMotorPosition(RXTXRobot.MOTOR1);
		int LMotor =r.getEncodedMotorPosition(RXTXRobot.MOTOR2);
		
		//math for converting encoded motor output to our earlier coordinate system
		
		int[] Motors= {LMotor,RMotor};
		
		return Motors;
	
		
	}
}
			