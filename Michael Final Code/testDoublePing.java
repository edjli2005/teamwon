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
		int X=0;
		int Y=0;
		int XTOT=0;
		int YTOT=0;
		int XCount=0;
		int YCount=0;
		while(XTOT==0||YTOT==0){
			for(int i=3;i>0;i--){
			
				Y=r.getPing(8);
				r.sleep(250);
				X=r.getPing(13);
				if(X>5&&X<500){
					XTOT=XTOT+X;
					XCount++;
				}
				if(Y>5&&Y<500){
					YTOT=YTOT+Y;
					YCount++;
				}
				System.out.println("PINGS = ["+X+","+Y+"] <- MY CODE");
			}
		}
		X=XTOT/XCount;
		Y=YTOT/YCount;
		System.out.println("PINGS = ["+X+","+Y+"] <- MY CODE");

		int[] Pings={X,Y};
		
		return Pings;
	}
}
