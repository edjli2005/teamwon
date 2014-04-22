import rxtxrobot.RXTXRobot;


public class LolaObjectMichael {
	int X;
	int Y;
	int[] Coordinates=new int[2];
	int turbBallNumber;
	int saltBallNumber;
	int DistanceX;
	int DistanceY;
	int startEncoderValueLeft;
	int endEncoderValueLeft;
	int startEncoderValueRight;
	int endEncoderValueRight;
	int LolaX;
	int LolaY;
	String movementState;
	int[] EPLIST;
	Movement Movement=new Movement();
	//declarations for all attributes
	public void LolaObjectMichael(){}
	
	public String setX(int newX){//sets X, sets Lola's X coordinate, prints and returns a string confirmation
		X=newX;
		Coordinates [0]=newX;
		String Confirm=("X Coordinate is now "+ X +"!");
		System.out.println(Confirm);
		return Confirm;
	}
	public int getX(){//gets X, prints confirmation
		System.out.println("Getting X: "+ X);
		return X;
	}
	
	public String setY(int newY){//sets Y, prints and returns a string confirmation
		Y=newY;
		Coordinates[1]=newY;
		String Confirm=("Y Coordinate is now "+ Y + "!");
		System.out.println(Confirm);
		return Confirm;
	}
	public int getY(){
		System.out.println("Getting Y: "+ Y);
		return Y;
	}
	
	public String setTurbBall(int newTurbBall){//sets number of turbidity balls being carried, prints and returns a string confirmation
		turbBallNumber=newTurbBall;
		String Confirm=("Turbidity balls now "+ turbBallNumber + "!");
		System.out.println(Confirm);
		return Confirm;
	}
	public int getTurbBall(){
		System.out.println("Getting Turbidity Balls: "+ turbBallNumber);
		return turbBallNumber;
	}
	
	public String setSaltBall(int newSaltBall){//sets number of salt balls being carried, prints and returns a string confirmation
		saltBallNumber=newSaltBall;
		String Confirm=("Salinity balls now "+ saltBallNumber + "!");
		System.out.println(Confirm);
		return Confirm;
	}
	public int getSaltBall(){
		System.out.println("Getting Salinity Balls: "+ saltBallNumber);
		return saltBallNumber;
	}
	
	public String setCoordinates(int [] newCoordinates){//sets coordinates with int array passed in, prints and returns a string confirmation
		Coordinates=newCoordinates;
		setX(Coordinates[0]);
		setY(Coordinates[1]);
		String Confirm=("Coordinates now [" + Coordinates[0] + "," + Coordinates[1] + "]!");
		System.out.println(Confirm);
		return Confirm;
	}
	public String setCoordinates(int newX,int newY){//sets coordinates with 2 int values passed in, prints and returns a string confirmation
		Coordinates[0]=newX;
		Coordinates[1]=newY;
		setX(newX);
		setY(newY);
		String Confirm= ("Coordinates now [" + Coordinates[0] + "," + Coordinates[1] + "]!" );
		System.out.println(Confirm);
		return Confirm;
	}
	public int[] getCoordinates(){
		System.out.println("Getting Coordinates: [" + Coordinates[0] + "," + Coordinates[1] + "]" );
		return Coordinates;
	}
	public String setDistanceXTraveled(int newDistanceX){//passed in theory by encoders
		DistanceX=DistanceX+newDistanceX;
		String Confirm=("Total X Distance Traveled: " + DistanceX);
		System.out.println(Confirm);
		return Confirm;
	}
	
	public int getDistanceXTraveled(){
		System.out.println("Total X Distance Traveled: " + DistanceX);
		return DistanceX;
	}
	public String setDistanceYTraveled(int newDistanceY){
		DistanceY=DistanceY+newDistanceY;
		String Confirm=("Total Y Distance Traveled: " + DistanceY);
		System.out.println(Confirm);
		return Confirm;	
	}
	public int getDistanceYTraveled(){
		System.out.println("Total Y Distance Traveled: " + DistanceY);
		return DistanceY;
	}
	public String setLolaX(int newLolaX){
		LolaX=newLolaX;
		String Confirm=("Lola's new width is: "+ LolaX);
		System.out.println(Confirm);
		return Confirm;
	}
	public int getLolaX(){
		System.out.println("Lola's width is: "+ LolaX);
		return LolaX;
	}
	public String setLolaY(int newLolaY){
		LolaY=newLolaY;
		String Confirm=("Lola's new Length is: "+LolaY);
		System.out.println(Confirm);
		return Confirm;
	}
	public int getLolaY(){
		System.out.println("Lola's length is: "+LolaY);
		return LolaY;
	}
	
	
	public String setstartEncoderValue(int newEncoderValueLeft,int newEncoderValueY){
		startEncoderValueLeft=newEncoderValueLeft;
		startEncoderValueRight=newEncoderValueY;
		String Confirm=("Lola's new Start Encoder Values are: "+startEncoderValueLeft+" and "+startEncoderValueRight);
		System.out.println(Confirm);
		return Confirm;
	}
	public String setstartEncoderValueLeft(int newEncoderValueLeft){
		startEncoderValueLeft=newEncoderValueLeft;
		
		String Confirm=("Lola's new Start Encoder Values are: "+startEncoderValueLeft+" and "+startEncoderValueRight);
		System.out.println(Confirm);
		return Confirm;
	}
	public String setstartEncoderValueRight(int newEncoderValueRight){
		
		startEncoderValueRight=newEncoderValueRight;
		String Confirm=("Lola's new Start Encoder Values are: "+startEncoderValueLeft+" and "+startEncoderValueRight);
		System.out.println(Confirm);
		return Confirm;
	}
	public int getstartEncoderValueLeft(){
		System.out.println("Start encoder value left is: "+startEncoderValueLeft);
		return startEncoderValueLeft;
		
	}
	public int getstartEncoderValueRight(){
		System.out.println("Start encoder value Right is: "+startEncoderValueRight);
		return startEncoderValueRight;
		
	}
	
	
	public String setendEncoderValue(int newEncoderValueLeft,int newEncoderValueY){
		endEncoderValueLeft=newEncoderValueLeft;
		endEncoderValueRight=newEncoderValueY;
		String Confirm=("Lola's new End Encoder Values are: "+endEncoderValueLeft+" and "+endEncoderValueRight);
		System.out.println(Confirm);
		return Confirm;
	}
	public String setendEncoderValueLeft(int newEncoderValueLeft){
		endEncoderValueLeft=newEncoderValueLeft;
		
		String Confirm=("Lola's new End Encoder Values are: "+endEncoderValueLeft+" and "+endEncoderValueRight);
		System.out.println(Confirm);
		return Confirm;
	}
	public String setendEncoderValueRight(int newEncoderValueRight){
		
		endEncoderValueRight=newEncoderValueRight;
		String Confirm=("Lola's new End Encoder Values are: "+endEncoderValueLeft+" and "+endEncoderValueRight);
		System.out.println(Confirm);
		return Confirm;
	}
	public int getendEncoderValueLeft(){
		System.out.println("End encoder value left is: "+endEncoderValueLeft);
		return endEncoderValueLeft;
		
	}
	public int getendEncoderValueRight(){
		System.out.println("End encoder value Right is: "+endEncoderValueRight);
		return endEncoderValueRight;
		
	}
	public String getMovementState(){
		System.out.println(movementState);
		return movementState;
	}
	public String setMovementState(String newMovement){
		movementState=newMovement;
		String Confirm="New Movement State is "+movementState;
		System.out.println(Confirm);
		return Confirm;
	}
	public String changeMovementState(RXTXRobot r,String newMovement,LolaObjectMichael Lola){
		String Confirm="ERROR in changeMovementState";//checks movement state, and uses that to change the orientation of Lola
		
		if(movementState=="+XForward"||movementState=="-XBackward"){
			
			if(newMovement=="-XForward"||newMovement=="+XBackward"){
				Movement.Uturn(r);
				Confirm=("Uturned to "+newMovement);
			}
			if(newMovement=="+YForward"||newMovement=="-YBackward"){
				Movement.ERight(r, Lola);
				Confirm=("Right turned to "+newMovement);
			}
			if(newMovement=="-YForward"||newMovement=="+YBackward"){
				Movement.ELeft(r, Lola);
				Confirm=("Left turned to "+newMovement);
			}
		}
		
		
		if(movementState=="-XForward"||movementState=="+XBackward"){
			if(newMovement=="+XForward"||newMovement=="-XBackward"){
				Movement.Uturn(r);
				Confirm=("Uturned to "+newMovement);
			}
			if(newMovement=="+YForward"||newMovement=="-YBackward"){
				Movement.ELeft(r, Lola);
				Confirm=("Left turned to "+newMovement);
			}
			if(newMovement=="-YForward"||newMovement=="+YBackward"){
				Movement.ERight(r, Lola);
				Confirm=("Right turned to "+newMovement);
			}
		}
		
		if(movementState=="+YForward"||movementState=="-YBackward"){
			
			if(newMovement=="-XForward"||newMovement=="+XBackward"){
				Movement.ERight(r,Lola);
				Confirm=("Right turned to "+newMovement);
			}
			if(newMovement=="+XForward"||newMovement=="-XBackward"){
				Movement.ELeft(r, Lola);
				Confirm=("Left turned to "+newMovement);
			}
			if(newMovement=="-YForward"||newMovement=="+YBackward"){
				Movement.Uturn(r);
				Confirm=("Uturned to "+newMovement);
			}
		}
		
		if(movementState=="-YForward"||movementState=="+YBackward"){
			
			if(newMovement=="-XForward"||newMovement=="+XBackward"){
				Movement.ELeft(r,Lola);
				Confirm=("Left turned to "+newMovement);
			}
			if(newMovement=="+YForward"||newMovement=="-YBackward"){
				Movement.Uturn(r);
				Confirm=("Uturned to "+newMovement);
			}
			if(newMovement=="+XForward"||newMovement=="-XBackward"){
				Movement.ERight(r, Lola);
				Confirm=("Right turned to "+newMovement);
			}
		}
		movementState=newMovement;
		System.out.println(Confirm);
		return Confirm;
	}
	public int[] getEPLIST(){
		int[] returnList=EPLIST;
		System.out.println("Positions left to go: ");
		
		for(int i=0;i<EPLIST.length;i++){
			System.out.print(EPLIST[i]+",");
			
		}
//		int j=0;
//		int i=0;
//		while(j<=2){
//			if(EPLIST[i]!=0){
//				EPLIST[i]=0;
//				j++;
//				}
//			i++;	
//			}
	
		return returnList;
	}
	public String setEPLIST(int[] newEPLIST){
		EPLIST=newEPLIST;
		String Confirm = "It is done.";
		System.out.println(Confirm);
		return Confirm;
	
	}
	public String setEPLIST(int Position, int number){
		EPLIST[Position]=number;
		String Confirm = "It is done.";
		System.out.println(Confirm);
		return Confirm;
	
	}
	
}
