
import rxtxrobot.RXTXRobot;

//Contained within Ping object
public class correctPosition {
	
	EForward For=new EForward();
	EBackward Back=new EBackward();
	ELeft Left=new ELeft();
	ERight Right=new ERight();
	public correctPosition(){}
	
	public void correctPosition(RXTXRobot r, int[] Changes,LolaObjectMichael Lola){
		int[] RChanges={Changes[1],Changes[0]};//Changes array reversed for when the orientation of Lola is 90 degrees to start, so x and y are switched
		if(Changes[0]<5&&Changes[0]>-5){
			Changes[0]=0;
			Lola.setEPLIST(0,0);
		}
		if(Changes[1]<5&&Changes[1]>-5){
			Changes[1]=0;
			Lola.setEPLIST(1,0);
		}
		// changes the position of lola based on the passed changes
		if (Changes[1]>0&&( (Lola.getMovementState()==("+XForward")) || (Lola.getMovementState()==("-XBackward")) )){//is 90 degrees of start, so needs x and y switched
//			Right.ERight(r,  Lola);//turns right
			For.EForward(r, Lola.CentToTickLF(RChanges[0]),Lola.CentToTickRF(RChanges[0]));//moves forward to new position
//			Left.ELeft(r, Lola);//turns left again
			Changes[1]=0;
			Lola.setEPLIST(0,0);
		}
		if (Changes[1]>0&&( (Lola.getMovementState()==("+XBackward")) || (Lola.getMovementState()==("-XForward")) )){
//			Right.ERight(r,  Lola);//turns right
			Back.EBackward(r, Lola.CentToTickLB(RChanges[0]),Lola.CentToTickRB(RChanges[0]));//moves forward to new position
//			Left.ELeft(r, Lola);//turns left again
			Changes[1]=0;
			Lola.setEPLIST(0,0);
		}
		
		if (Changes[0]>0&&( (Lola.getMovementState()==("+YForward")) || (Lola.getMovementState()==("-YBackward")) )){
			Left.ELeft(r);//turns left
			For.EForward(r, Lola.CentToTickLF(Changes[0]),Lola.CentToTickRF(Changes[0]));//moves forward to new position
			Right.ERight(r);//turns right again
			Changes[0]=0;
			Lola.setEPLIST(0,0);
		}
		if (Changes[0]>0&&( (Lola.getMovementState()==("+YBackward")) || (Lola.getMovementState()==("-YForward")) )){
			Right.ERight(r);//turns right
			For.EForward(r, Lola.CentToTickLF(Changes[0]),Lola.CentToTickRF(Changes[0]));//moves forward to new position
			Left.ELeft(r);//turns left again
			Changes[0]=0;
			Lola.setEPLIST(0,0);
		}
		
		if (Changes[1]<0&&( (Lola.getMovementState()==("+XForward")) || (Lola.getMovementState()==("-XBackward")) )){
			
			RChanges[0]=(RChanges[0]*(-1));//Changed to + to interact with run motor
			
//			Left.ELeft(r,Lola);//turns left
			Back.EBackward(r,Lola.CentToTickLB(RChanges[0]),Lola.CentToTickRB(RChanges[0]));//moves forward to new position
//			Right.ERight(r,Lola);//turns right again
			
			RChanges[0]=0;
			Lola.setEPLIST(0,0);
			}
		
		if (Changes[1]<0&&( (Lola.getMovementState()==("-XForward")) || (Lola.getMovementState()==("+XBackward")) )){
			
			RChanges[0]=(RChanges[0]*(-1));//Changed to + to interact with run motor
			
//			Left.ELeft(r,Lola);//turns left
			For.EForward(r,Lola.CentToTickLF(RChanges[0]),Lola.CentToTickRF(RChanges[0]));//moves forward to new position
//			Right.ERight(r,Lola);//turns right again
			
			Changes[1]=0;
			Lola.setEPLIST(0,0);
			}
		if (Changes[0]<0&&( (Lola.getMovementState()==("-YForward")) || (Lola.getMovementState()==("+YBackward")) )){
			Left.ELeft(r);//turns left
			For.EForward(r, Lola.CentToTickLF(Changes[0]),Lola.CentToTickRF(Changes[0]));//moves forward to new position
			Right.ERight(r);//turns right again
			Changes[0]=0;
			Lola.setEPLIST(0,0);
		}
		if (Changes[0]<0&&( (Lola.getMovementState()==("-YBackward")) || (Lola.getMovementState()==("+YForward")) )){
			Right.ERight(r);//turns right
			For.EForward(r, Lola.CentToTickLF(Changes[0]),Lola.CentToTickRF(Changes[0]));//moves forward to new position
			Left.ELeft(r);//turns left again
			Changes[0]=0;
			Lola.setEPLIST(0,0);
		}
		
		
		
		
		
		
	
		if (Changes[0]>0&&( (Lola.getMovementState()==("+XForward")) || (Lola.getMovementState()==("-XBackward")) )){
			Right.ERight(r);//turns right
			For.EForward(r, Lola.CentToTickLF(RChanges[1]),Lola.CentToTickRF(RChanges[1]));//moves forward to new position
			Left.ELeft(r);//turns left again
			Changes[0]=0;
			Lola.setEPLIST(1,0);
		}
		if (Changes[0]>0&&( (Lola.getMovementState()==("+XBackward")) || (Lola.getMovementState()==("-XForward")) )){
			Left.ELeft(r);//turns right
			For.EForward(r, Lola.CentToTickLF(RChanges[1]),Lola.CentToTickRF(RChanges[1]));//moves forward to new position
			Right.ERight(r);//turns left again
			Changes[0]=0;
			Lola.setEPLIST(1,0);
		}
		
		if (Changes[1]>0&&( (Lola.getMovementState()==("+YForward")) || (Lola.getMovementState()==("-YBackward")) )){
			
			For.EForward(r, Lola.CentToTickLF(Changes[1]),Lola.CentToTickRF(Changes[1]));//moves forward to new position
			
			Changes[1]=0;
			Lola.setEPLIST(1,0);
		}
		if (Changes[1]>0&&( (Lola.getMovementState()==("+YBackward")) || (Lola.getMovementState()==("-YForward")) )){
			
			Back.EBackward(r, Lola.CentToTickLB(Changes[1]),Lola.CentToTickRB(Changes[1]));//moves forward to new position
			
			Changes[1]=0;
			Lola.setEPLIST(1,0);
		}
		
		if (Changes[0]<0&&( (Lola.getMovementState()==("+XForward")) || (Lola.getMovementState()==("-XBackward")) )){
			
			Changes[0]=(Changes[0]*(-1));//Changed to + to interact with run motor
			
			Left.ELeft(r);//turns left
			For.EForward(r,Lola.CentToTickLF(RChanges[1]),Lola.CentToTickRF(RChanges[1]) );//moves forward to new position
			Right.ERight(r);//turns right again
			
			Changes[0]=0;
			Lola.setEPLIST(1,0);
		}
		
		if (Changes[0]<0&&( (Lola.getMovementState()==("-XForward")) || (Lola.getMovementState()==("+XBackward")) )){
			
			Changes[0]=(Changes[0]*(-1));//Changed to + to interact with run motor
			
			Right.ERight(r);//turns left
			For.EForward(r,Lola.CentToTickLF(RChanges[1]),Lola.CentToTickRF(RChanges[1]) );//moves forward to new position
			Left.ELeft(r);//turns right again
			
			Changes[0]=0;
			Lola.setEPLIST(1,0);
			}
		if (Changes[1]<0&&( (Lola.getMovementState()==("-YForward")) || (Lola.getMovementState()==("+YBackward")) )){
			
			For.EForward(r, Lola.CentToTickLF(Changes[1]),Lola.CentToTickRF(Changes[1]));//moves forward to new position
			
			Changes[1]=0;
			Lola.setEPLIST(1,0);
		}
		if (Changes[1]<0&&( (Lola.getMovementState()==("-YBackward")) || (Lola.getMovementState()==("+YForward")) )){
			
			Back.EBackward(r, Lola.CentToTickLB(Changes[1]),Lola.CentToTickRB(Changes[1]));//moves forward to new position
			
			Changes[1]=0;
			Lola.setEPLIST(1,0);
		}
	}
}