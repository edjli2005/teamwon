import rxtxrobot.RXTXRobot;


public class getPosition {
	//Position(){}
	public double[] getPosition(RXTXRobot r,  double[] expectedPosition){
		double PingX=0,PingY=0;
		for (int x=0; x < 10; ++x) 
		{ 
			System.out.println("Response: " + r.getPing() + " cm"); 
			r.sleep(300); 
			PingX=r.getPing();
		} 
		for (int x=0; x < 10; ++x) 
		{ 
			System.out.println("Response: " + r.getPing() + " cm"); 
			r.sleep(300); 
			PingY=r.getPing();
		} 
		double[] Coordinates={PingX,PingY,0,0};
		double XChanges=0;
		double YChanges=0;
		
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
