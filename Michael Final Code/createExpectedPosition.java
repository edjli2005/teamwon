import java.util.ArrayList;

import rxtxrobot.RXTXRobot;


public class createExpectedPosition {

	createExpectedPosition(){}
	public int[] createExpectedPosition(RXTXRobot r, LolaObjectMichael Lola){
		int[] expectedPosition={-1,-1};
		
//		if (Lola.getMovementState()=="+XForward"){
//			expectedPosition=Lola.getCoordinates();
//			expectedPosition[0]=expectedPosition[0]+3;
//			return expectedPosition;
//		}
//		if(Lola.getMovementState()=="-XForward"){
//			expectedPosition=Lola.getCoordinates();
//			expectedPosition[0]=expectedPosition[0]+3;
//			return expectedPosition;
//		}
//		if(Lola.getMovementState()=="+XBackward"){	
//			expectedPosition=Lola.getCoordinates();
//			expectedPosition[0]=expectedPosition[0]-3;
//			return expectedPosition;
//		}
//		if(Lola.getMovementState()=="-XBackward"){
//			expectedPosition=Lola.getCoordinates();
//			expectedPosition[0]=expectedPosition[0]-3;
//			return expectedPosition;
//		}
//		if (Lola.getMovementState()=="+YForward"){
//			expectedPosition=Lola.getCoordinates();
//			expectedPosition[1]=expectedPosition[1]+3;
//			return expectedPosition;
//		}
//		if(Lola.getMovementState()=="-YForward"){
//			expectedPosition=Lola.getCoordinates();
//			expectedPosition[1]=expectedPosition[1]-3;
//			return expectedPosition;
//		}
//		if(Lola.getMovementState()=="+YBackward"){	
//			expectedPosition=Lola.getCoordinates();
//			expectedPosition[1]=expectedPosition[1]+3;
//			return expectedPosition;
//		}
//		if(Lola.getMovementState()=="-YBackward"){
//			expectedPosition=Lola.getCoordinates();
//			expectedPosition[1]=expectedPosition[1]-3;
//			return expectedPosition;
//		}
//		
//		if(Lola.getMovementState()=="Left"||Lola.getMovementState()=="Right"){
//			expectedPosition=Lola.getCoordinates();
//			return expectedPosition;
//		}
//		
//		if(Lola.getMovementState()=="Stationary"){
			
			expectedPosition=Lola.getEPLIST();//gets the expected position full list from lola
			ArrayList<Integer> transferArray =new ArrayList();
			for(int i=0; i<expectedPosition.length;i++){
				if(expectedPosition[i]!=0){//if a object in expected position IS 0, it is shuffled out. The logic is that once a position is reached the expected position
											//is changed to 0 and then shuffled out.
					transferArray.add(expectedPosition[i]);
				}
			}
			for(int i=0; i<transferArray.size();i++){
				expectedPosition[i]=transferArray.get(i);
			}
			
			int[] returnPosition={expectedPosition[0],expectedPosition[1]};//only return next 2 elements for 2 coordinates
			
			System.out.println("Expected Position: "+expectedPosition[0]+","+expectedPosition[1]);
			
			return returnPosition;
//		}
		
//		return expectedPosition;
	}
}
