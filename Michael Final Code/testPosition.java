import rxtxrobot.RXTXRobot;


public class testPosition {
	getPosition test=new getPosition();
	correctPosition correction=new correctPosition();
	
	public testPosition(){}
	
	public void testPosition(RXTXRobot r, int [] expectedPosition, LolaObjectMichael Lola) {
		//driver function for below functions
		int[] newPosition=new int[2];
		String Done="NO";
		while(Done=="NO"){
		expectedPosition=test.getPosition(r,expectedPosition, Lola);
		correction.correctPosition(r, expectedPosition, Lola);
		newPosition=test.getPosition(r);
		if(newPosition[2]-expectedPosition[2]<=5&&newPosition[2]-expectedPosition[2]>=-5){
			if(newPosition[3]-expectedPosition[3]<=5&&newPosition[3]-expectedPosition[3]>=-5){
				Done="YES";
				}
			}
		}
	}
}
