
public class NormalObjectMichael {

	int XLength;
	int YLength;
	int[] Lengths=new int[2];
	int XPosition;
	int YPosition;
	int[] Coordinates=new int[2];
	public void NormalObjectMichael(){}//Use to instantiate objects on course to avoid hitting, i.e. dispensers. Check to make sure not hitting anything.

	public int getXLength(){
		System.out.println("XLength is "+ XLength);
		return XLength;
	}
	public String setXLength(int newXLength){
		String Confirm=("Setting new XLength to "+ newXLength);
		System.out.println(Confirm);
		XLength=newXLength;
		Lengths[0]= newXLength;
		return Confirm;
	}
	public int getYLength(){
		System.out.println("YLength is "+ YLength);
		return YLength;
	}
	public String setYLength(int newYLength){
		String Confirm=("Setting new YLength to "+ newYLength);
		System.out.println(Confirm);
		YLength=newYLength;
		Lengths[1]=newYLength;
		return Confirm;
	}
	public int[] getLengths(){
		System.out.println("XLength is "+ Lengths[0]+" and YLength is "+ Lengths[1]);
		return Lengths;
	}
	public String setLengths(int[] newLengths){
		String Confirm=("Setting new XLength to "+ newLengths[0]+ "and setting new YLength to "+newLengths[1]);
		System.out.println(Confirm);
		Lengths=newLengths;
		XLength=newLengths[0];
		YLength=newLengths[1];
		return Confirm;
	}
	public String setX(int newX){//sets X, sets Lola's X coordinate, prints and returns a string confirmation
		XPosition=newX;
		Coordinates [0]=newX;
		String Confirm=("X Coordinate is now "+ XPosition +"!");
		System.out.println(Confirm);
		return Confirm;
	}
	public int getX(){//gets X, prints confirmation
		System.out.println("Getting X: "+ XPosition);
		return XPosition;
	}
	
	public String setY(int newY){//sets Y, prints and returns a string confirmation
		YPosition=newY;
		Coordinates[1]=newY;
		String Confirm=("Y Coordinate is now "+ YPosition + "!");
		System.out.println(Confirm);
		return Confirm;
	}
	public int getY(){
		System.out.println("Getting Y: "+ YPosition);
		return YPosition;
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
}
