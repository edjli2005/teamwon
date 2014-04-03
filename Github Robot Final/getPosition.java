import rxtxrobot.RXTXRobot;


public class getPosition {
	public getPosition(){}
	public int[] getPosition(RXTXRobot r,  int[] expectedPosition){
		setPing newPing=new setPing();
		int PingX=0,PingY=0;
		
		  	
		PingX=newPing.setPing(r,0);//Delay for getting precise ping now incorporated in overloaded getPing function
		System.out.println("X Coordinate is " + PingX ); 
			
	
		PingY=newPing.setPing(r,1);//Delay for getting precise ping now incorporated in overloaded getPing function
		System.out.println("Y Coordinate is" + PingY ); 
			
		int[] Coordinates={PingX,PingY,0,0};
		int XChanges=0,YChanges=0;
		
		if (Coordinates[0]!=expectedPosition[0]){
			System.out.print("Current X is incorrect.\n");
			XChanges=(expectedPosition[0]-Coordinates[0]);//+ if current X too small, - if current X too big
			}
		
		System.out.println("X needs change of: "+ XChanges);
		
		
		if (Coordinates[1]!=expectedPosition[1]){
			System.out.print("Current Y is incorrect.\n");
			YChanges=(expectedPosition[1]-Coordinates[1]);//+ if current Y too small, - if current Y too big
			}
		
		System.out.println("Y needs change of: "+ YChanges);
		
		Coordinates[0]=XChanges;
		Coordinates[1]=YChanges;
		Coordinates[2]=PingX;
		Coordinates[3]=PingY;
		System.out.print("Coordinates: "+Coordinates[2]+", "+Coordinates[3]);
		return Coordinates;
	

	}
}
