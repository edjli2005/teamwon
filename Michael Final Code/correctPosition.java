
import rxtxrobot.RXTXRobot;

//Contained within Ping object
public class correctPosition {
	Movement Movement = new Movement();
	
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
//			Movement.ERight(r,  Lola);//turns right
			Movement.EForward(r, Movement.CentToTickLF(RChanges[0]),Movement.CentToTickRF(RChanges[0]),Lola);//moves forward to new position
//			Movement.ELeft(r, Lola);//turns left again
			Changes[1]=0;
			Lola.setEPLIST(0,0);
		}
		if (Changes[1]>0&&( (Lola.getMovementState()==("+XBackward")) || (Lola.getMovementState()==("-XForward")) )){
//			Movement.ERight(r,  Lola);//turns right
			Movement.EBackward(r, Movement.CentToTickLB(RChanges[0]),Movement.CentToTickRB(RChanges[0]),Lola);//moves forward to new position
//			Movement.ELeft(r, Lola);//turns left again
			Changes[1]=0;
			Lola.setEPLIST(0,0);
		}
		
		if (Changes[0]>0&&( (Lola.getMovementState()==("+YForward")) || (Lola.getMovementState()==("-YBackward")) )){
			Movement.ELeft(r,  Lola);//turns left
			Movement.EForward(r, Movement.CentToTickLF(Changes[0]),Movement.CentToTickRF(Changes[0]),Lola);//moves forward to new position
			Movement.ERight(r, Lola);//turns right again
			Changes[0]=0;
			Lola.setEPLIST(0,0);
		}
		if (Changes[0]>0&&( (Lola.getMovementState()==("+YBackward")) || (Lola.getMovementState()==("-YForward")) )){
			Movement.ERight(r,  Lola);//turns right
			Movement.EForward(r, Movement.CentToTickLF(Changes[0]),Movement.CentToTickRF(Changes[0]),Lola);//moves forward to new position
			Movement.ELeft(r, Lola);//turns left again
			Changes[0]=0;
			Lola.setEPLIST(0,0);
		}
		
		if (Changes[1]<0&&( (Lola.getMovementState()==("+XForward")) || (Lola.getMovementState()==("-XBackward")) )){
			
			RChanges[0]=(RChanges[0]*(-1));//Changed to + to interact with run motor
			
//			Movement.ELeft(r,Lola);//turns left
			Movement.EBackward(r,Movement.CentToTickLB(RChanges[0]),Movement.CentToTickRB(RChanges[0]) ,Lola);//moves forward to new position
//			Movement.ERight(r,Lola);//turns right again
			
			RChanges[0]=0;
			Lola.setEPLIST(0,0);
			}
		
		if (Changes[1]<0&&( (Lola.getMovementState()==("-XForward")) || (Lola.getMovementState()==("+XBackward")) )){
			
			RChanges[0]=(RChanges[0]*(-1));//Changed to + to interact with run motor
			
//			Movement.ELeft(r,Lola);//turns left
			Movement.EForward(r,Movement.CentToTickLF(RChanges[0]),Movement.CentToTickRF(RChanges[0]) ,Lola);//moves forward to new position
//			Movement.ERight(r,Lola);//turns right again
			
			Changes[1]=0;
			Lola.setEPLIST(0,0);
			}
		if (Changes[0]<0&&( (Lola.getMovementState()==("-YForward")) || (Lola.getMovementState()==("+YBackward")) )){
			Movement.ELeft(r,  Lola);//turns left
			Movement.EForward(r, Movement.CentToTickLF(Changes[0]),Movement.CentToTickRF(Changes[0]),Lola);//moves forward to new position
			Movement.ERight(r, Lola);//turns right again
			Changes[0]=0;
			Lola.setEPLIST(0,0);
		}
		if (Changes[0]<0&&( (Lola.getMovementState()==("-YBackward")) || (Lola.getMovementState()==("+YForward")) )){
			Movement.ERight(r,  Lola);//turns right
			Movement.EForward(r, Movement.CentToTickLF(Changes[0]),Movement.CentToTickRF(Changes[0]),Lola);//moves forward to new position
			Movement.ELeft(r, Lola);//turns left again
			Changes[0]=0;
			Lola.setEPLIST(0,0);
		}
		
		
		
		
		
		
	
		if (Changes[0]>0&&( (Lola.getMovementState()==("+XForward")) || (Lola.getMovementState()==("-XBackward")) )){
			Movement.ERight(r,  Lola);//turns right
			Movement.EForward(r, Movement.CentToTickLF(RChanges[1]),Movement.CentToTickRF(RChanges[1]),Lola);//moves forward to new position
			Movement.ELeft(r, Lola);//turns left again
			Changes[0]=0;
			Lola.setEPLIST(1,0);
		}
		if (Changes[0]>0&&( (Lola.getMovementState()==("+XBackward")) || (Lola.getMovementState()==("-XForward")) )){
			Movement.ELeft(r,  Lola);//turns right
			Movement.EForward(r, Movement.CentToTickLF(RChanges[1]),Movement.CentToTickRF(RChanges[1]),Lola);//moves forward to new position
			Movement.ERight(r, Lola);//turns left again
			Changes[0]=0;
			Lola.setEPLIST(1,0);
		}
		
		if (Changes[1]>0&&( (Lola.getMovementState()==("+YForward")) || (Lola.getMovementState()==("-YBackward")) )){
			
			Movement.EForward(r, Movement.CentToTickLF(Changes[1]),Movement.CentToTickRF(Changes[1]),Lola);//moves forward to new position
			
			Changes[1]=0;
			Lola.setEPLIST(1,0);
		}
		if (Changes[1]>0&&( (Lola.getMovementState()==("+YBackward")) || (Lola.getMovementState()==("-YForward")) )){
			
			Movement.EBackward(r, Movement.CentToTickLB(Changes[1]),Movement.CentToTickRB(Changes[1]),Lola);//moves forward to new position
			
			Changes[1]=0;
			Lola.setEPLIST(1,0);
		}
		
		if (Changes[0]<0&&( (Lola.getMovementState()==("+XForward")) || (Lola.getMovementState()==("-XBackward")) )){
			
			Changes[0]=(Changes[0]*(-1));//Changed to + to interact with run motor
			
			Movement.ELeft(r,Lola);//turns left
			Movement.EForward(r,Movement.CentToTickLF(RChanges[1]),Movement.CentToTickRF(RChanges[1]) ,Lola);//moves forward to new position
			Movement.ERight(r,Lola);//turns right again
			
			Changes[0]=0;
			Lola.setEPLIST(1,0);
		}
		
		if (Changes[0]<0&&( (Lola.getMovementState()==("-XForward")) || (Lola.getMovementState()==("+XBackward")) )){
			
			Changes[0]=(Changes[0]*(-1));//Changed to + to interact with run motor
			
			Movement.ERight(r,Lola);//turns left
			Movement.EForward(r,Movement.CentToTickLF(RChanges[1]),Movement.CentToTickRF(RChanges[1]) ,Lola);//moves forward to new position
			Movement.ELeft(r,Lola);//turns right again
			
			Changes[0]=0;
			Lola.setEPLIST(1,0);
			}
		if (Changes[1]<0&&( (Lola.getMovementState()==("-YForward")) || (Lola.getMovementState()==("+YBackward")) )){
			
			Movement.EForward(r, Movement.CentToTickLF(Changes[1]),Movement.CentToTickRF(Changes[1]),Lola);//moves forward to new position
			
			Changes[1]=0;
			Lola.setEPLIST(1,0);
		}
		if (Changes[1]<0&&( (Lola.getMovementState()==("-YBackward")) || (Lola.getMovementState()==("+YForward")) )){
			
			Movement.EBackward(r, Movement.CentToTickLB(Changes[1]),Movement.CentToTickRB(Changes[1]),Lola);//moves forward to new position
			
			Changes[1]=0;
			Lola.setEPLIST(1,0);
		}
	}
}