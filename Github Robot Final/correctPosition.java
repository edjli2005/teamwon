
import rxtxrobot.RXTXRobot;


public class correctPosition {
	public void correctPosition(RXTXRobot r, double[] Changes){
		
		if (Changes[0]>0){
			r.runMotor(RXTXRobot.MOTOR1,- 125, RXTXRobot.MOTOR2, -125,900 );//turns left
			r.runMotor(RXTXRobot.MOTOR1,- 100, RXTXRobot.MOTOR2, 130,(int) (Changes[0]*30) );//moves forward to new position
			r.runMotor(RXTXRobot.MOTOR1, 125, RXTXRobot.MOTOR2, 125,900 );//turns right again
			
		}
		
		if (Changes[0]<0){
			Changes[0]=(Changes[0]*(-1));//Changed to + to interact with run motor
			
			r.runMotor(RXTXRobot.MOTOR1, 125, RXTXRobot.MOTOR2, 125,900 );//turns left
			r.runMotor(RXTXRobot.MOTOR1,- 100, RXTXRobot.MOTOR2, 130,(int) (Changes[0]*30) );//moves forward to new position
			r.runMotor(RXTXRobot.MOTOR1, -125, RXTXRobot.MOTOR2, -125,900 );//turns right again
			Changes[0]=(Changes[0]*(-1));//Changed back
			
		}
	
		if(Changes[1]>0){
			r.runMotor(RXTXRobot.MOTOR1,- 100, RXTXRobot.MOTOR2, 130,(int) (Changes[0]*30));//move forward to new position
		}
		
		if(Changes[1]<0){
			Changes[1]=(Changes[1]*(-1));//Changed to + to interact with run motor
			r.runMotor(RXTXRobot.MOTOR1,100, RXTXRobot.MOTOR2, -130,(int) (Changes[0]*30));//move backward to new position
			Changes[1]=(Changes[1]*(-1));//Changed back
					
		}
	}
}