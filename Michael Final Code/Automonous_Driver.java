import rxtxrobot.RXTXRobot;


public class Automonous_Driver {
	Movement Movement=new Movement();
	Ping Ping = new Ping();
	
	
	Automonous_Driver(){}
	
	public String Automonous_Driver(RXTXRobot r, LolaObjectMichael Lola){
		String CONFIRM="Completed Successfully";
		int[] EPLIST={40,160,   60,80,  100,100,  48,110};//Coordinates for stationary positions
		Lola.setMovementState("-YForward");//sets lola's starting position
		Lola.setEPLIST(EPLIST);
		
		Ping.testPosition(r, Movement.createExpectedPosition( r, Lola) ,Lola);//go to water
		Lola.changeMovementState(r, "-XForward", Lola);//changes Lola's orientation autonomously, hopefully
	
		Ping.testPosition(r,Movement.createExpectedPosition(r, Lola),Lola);//go to first dispenser
		Movement.Retrieve(r,2);
		
		Ping.testPosition(r,Movement.createExpectedPosition(r, Lola),Lola);//go to second dispenser
		Movement.Retrieve(r, 2);
		Lola.changeMovementState(r, "+XForward", Lola);
		Ping.testPosition(r,Movement.createExpectedPosition(r, Lola),Lola);//third dispenser
		Movement.Retrieve(r, 2);
		Ping.testPosition(r,Movement.createExpectedPosition(r, Lola),Lola);//fourth dispenser
		Movement.Retrieve(r, 2);
		
		
		
		
		return CONFIRM;
	}

}
