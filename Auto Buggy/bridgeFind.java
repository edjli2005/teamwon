import rxtxrobot.RXTXRobot;


public class bridgeFind {
	Ping Ping=new Ping();
	Movement Movement=new Movement();
	public bridgeFind(){};
	public void bridgeFind(RXTXRobot r,LolaObjectMichael Lola){
		int[] Pings=new int[2];
		
		Ping.testPosition(r,Movement.createExpectedPosition(r, Lola),Lola);//Sets up facing -X ready to scan for bridge first pos
		
		Pings=Ping.testDoublePing(r);
		if(Pings[0]<120){
			Lola.setEPLIST(4,0);
			Lola.setEPLIST(5,0);
			Lola.setEPLIST(6,0);
			Lola.setEPLIST(7,0);
			Lola.setEPLIST(8,0);
			Lola.setEPLIST(9,0);
			return;
		}
		Ping.testPosition(r,Movement.createExpectedPosition(r, Lola),Lola);//Sets up facing -X ready to scan for bridge second pos
		Pings=Ping.testDoublePing(r);
		if(Pings[0]<120){
			Lola.setEPLIST(4,0);
			Lola.setEPLIST(5,0);
			Lola.setEPLIST(6,0);
			Lola.setEPLIST(7,0);
			Lola.setEPLIST(8,0);
			Lola.setEPLIST(9,0);
			return;
		}
		Ping.testPosition(r,Movement.createExpectedPosition(r, Lola),Lola);//readies to cross bridge at third pos
		return;
	}
}
