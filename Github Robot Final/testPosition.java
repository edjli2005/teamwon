import rxtxrobot.RXTXRobot;


public class testPosition {
	public testPosition(){}
	public void testPosition(RXTXRobot r, int [] expectedPosition) {
	
	
	getPosition test=new getPosition();
	correctPosition correction=new correctPosition();
	expectedPosition=test.getPosition(r,expectedPosition);
	correction.correctPosition(r, expectedPosition);

	}
}
