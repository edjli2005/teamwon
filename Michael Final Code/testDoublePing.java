import rxtxrobot.RXTXRobot;

//Contained within Ping object
public class testDoublePing {

	
	public testDoublePing(){}
	public  int[] testDoublePing(RXTXRobot r,LolaObjectMichael Lola){
		int X=-1;
		int Y=-1;
		for(int i=10;i>0;i--){
			r.refreshDigitalPins();
			r.refreshAnalogPins();
			Y=r.getPing(8);
			X=r.getPing(13);
			
			System.out.println("PINGS = ["+X+","+Y+"] <- MY CODE");
		}
		int[] Pings={X,Y};
		Lola.setCoordinates(Pings);
		return Pings;
	}
	public  int[] testDoublePing(RXTXRobot r){
		int X=-1;
		int Y=-1;
		
		r.refreshDigitalPins();
		r.refreshAnalogPins();
		Y=r.getPing(8);
		X=r.getPing(13);
			
		System.out.println("PINGS = ["+X+","+Y+"] <- MY CODE");
	
		int[] Pings={X,Y};
		
		return Pings;
	}
}
