
import rxtxrobot.RXTXRobot;


public class correctPosition {
	public void correctPosition(RXTXRobot r, double[] Changes){
		EForward FEncoded= new EForward();
		EBackward BEncoded=new EBackward();
		ELeft LEncoded=new ELeft();
		ERight REncoded = new ERight();
		
		if (Changes[0]>0){
			REncoded.ERight(r, 100);//turns right
			FEncoded.EForward(r,(int) (Changes[0]*30) );//moves forward to new position
			LEncoded.ELeft(r, 100);//turns left again
			
		}
		
		if (Changes[0]<0){
			
			Changes[0]=(Changes[0]*(-1));//Changed to + to interact with run motor
			
			LEncoded.ELeft(r, 100);//turns left
			FEncoded.EForward(r,(int) (Changes[0]*30) );//moves forward to new position
			REncoded.ERight(r, 100);//turns right again
			
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