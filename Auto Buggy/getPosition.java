import rxtxrobot.RXTXRobot;

//contained within Ping object
public class getPosition {
	public getPosition(){}
	setPing newPing=new setPing();
	public int[] getPosition(RXTXRobot r,  int[] expectedPosition, LolaObjectMichael Lola){
		
		int[] Pings={-1,-1,-1,-1};//{xchanges,ychanges,xcoor,ycoor}
		
		
		Pings=newPing.setPing(r,Lola);//Delay for getting precise ping now incorporated in overloaded getPing function
		
		
		System.out.println("X Coordinate is " + Pings[2] ); 
		System.out.println("Y Coordinate is" + Pings[3] ); 
		
		int XChanges=0,YChanges=0;
		
		if (Pings[2]!=expectedPosition[0]){
			System.out.print("Current X is incorrect.\n");
			XChanges=(expectedPosition[0]-Pings[2]);//+ if current X too small, - if current X too big
			}
		
		System.out.println("X needs change of: "+ XChanges);
		
		
		if (Pings[3]!=expectedPosition[1]){
			System.out.print("Current Y is incorrect.\n");
			YChanges=(expectedPosition[1]-Pings[3]);//+ if current Y too small, - if current Y too big
			}
		
		System.out.println("Y needs change of: "+ YChanges);
		
		Pings[0]=XChanges;//Changes is in cm, needs conversion to ticks
		Pings[1]=YChanges;
		System.out.print("Coordinates: "+Pings[2]+", "+Pings[3]);
		return Pings;
	

	}
	public int[] getPosition(RXTXRobot r){
		setPing newPing=new setPing();
		
		
		  	
		int[] Pings={-1,-1,-1,-1};
		
	  	
		Pings=newPing.setPing(r);//Delay for getting precise ping now incorporated in overloaded getPing function
		System.out.println("X Coordinate is " + Pings[2] ); 
		System.out.println("Y Coordinate is" + Pings[3] ); 
		
	
	
		System.out.print("Coordinates: "+Pings[2]+", "+Pings[3]);
		return Pings;
	

	}
}
