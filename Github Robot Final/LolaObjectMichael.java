
public class LolaObjectMichael {
	int X;
	int Y;
	int[] Coordinates=new int[2];
	int turbBallNumber;
	int saltBallNumber;
	//declarations for all attributes
	public void LolaObjectMichael(){}
	
	public String setX(int newX){//sets X, sets Lola's X coordinate, prints and returns a string confirmation
		X=newX;
		Coordinates [0]=newX;
		String Confirm=("X Coordinate is now "+ X + " AND " +newX);
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
		String Confirm=("Y Coordinate is now "+ Y + " AND " +newY);
		System.out.println(Confirm);
		return Confirm;
	}
	public int getY(){
		System.out.println("Getting Y: "+ Y);
		return Y;
	}
	
	public String setTurbBall(int newTurbBall){//sets number of turbidity balls being carried, prints and returns a string confirmation
		turbBallNumber=newTurbBall;
		String Confirm=("Turbidity balls now "+ turbBallNumber + " AND " +newTurbBall);
		System.out.println(Confirm);
		return Confirm;
	}
	public int getTurbBall(){
		System.out.println("Getting Turbidity Balls: "+ turbBallNumber);
		return turbBallNumber;
	}
	
	public String setSaltBall(int newSaltBall){//sets number of salt balls being carried, prints and returns a string confirmation
		saltBallNumber=newSaltBall;
		String Confirm=("Salinity balls now "+ saltBallNumber + " AND " +newSaltBall);
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
		String Confirm=("Coordinates now ["+ Coordinates[0]+","+Coordinates[1] + "] AND [" +newCoordinates[0]+","+newCoordinates[1]+"]" );
		System.out.println(Confirm);
		return Confirm;
	}
	public String setCoordinates(int newX,int newY){//sets coordinates with 2 int values passed in, prints and returns a string confirmation
		Coordinates[0]=newX;
		Coordinates[1]=newY;
		setX(newX);
		setY(newY);
		String Confirm= ("Coordinates now ["+ Coordinates[0]+","+Coordinates[1] + "] AND [" +newX+","+newY+"]" );
		System.out.println(Confirm);
		return Confirm;
	}
	public int[] getCoordinates(){
		System.out.println("Getting Coordinates: ["+ Coordinates[0]+","+Coordinates[1]+"]");
		return Coordinates;
	}
}
