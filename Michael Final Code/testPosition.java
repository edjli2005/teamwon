import rxtxrobot.RXTXRobot;


public class testPosition {
	getPosition test=new getPosition();
	correctPosition correction=new correctPosition();
	
	public testPosition(){}
	
	public void testPosition(RXTXRobot r, int [] expectedPosition, LolaObjectMichael Lola) {
		//driver function for below functions
	expectedPosition=test.getPosition(r,expectedPosition, Lola);
	correction.correctPosition(r, expectedPosition, Lola);

	}
}
