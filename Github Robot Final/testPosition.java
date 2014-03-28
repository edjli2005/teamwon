import rxtxrobot.RXTXRobot;


public class testPosition {
	public testPosition(){}
	public void testPosition(RXTXRobot r) {
	
	double[] expectedPosition={50,60};
	getPosition test=new getPosition();
	correctPosition correction=new correctPosition();
	expectedPosition=test.getPosition(r,expectedPosition);
	correction.correctPosition(r, expectedPosition);
	
	}
}
