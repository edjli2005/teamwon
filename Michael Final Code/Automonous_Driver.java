import rxtxrobot.RXTXRobot;


public class Automonous_Driver {
	Movement Movement=new Movement();
	Ping Ping = new Ping();
	
	
	Automonous_Driver(){}
	
	public String Automonous_Driver(RXTXRobot r, LolaObjectMichael Lola){
		String CONFIRM="Completed Successfully";
		int[] EPLIST={80,80,60,40};//Coordinates for stationary positions
		Lola.setMovementState("+XForward");
		Lola.setEPLIST(EPLIST);
		
		Ping.testPosition(r, Movement.createExpectedPosition( r, Lola) ,Lola);
		
		
		Ping.testPosition(r,Movement.createExpectedPosition(r, Lola),Lola);
		
		
		
		return CONFIRM;
	}

}
