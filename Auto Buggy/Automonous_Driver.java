import rxtxrobot.RXTXRobot;


public class Automonous_Driver {
	Movement Movement=new Movement();
	Ping Ping = new Ping();
	
	
	Automonous_Driver(){}
	
	public String Automonous_Driver(RXTXRobot r, LolaObjectMichael Lola){
		String CONFIRM="Completed Successfully";
		int[] EPLIST={50,184,  48,110   ,280,179,  109,184,    0,0    };//Coordinates for stationary positions{1st,second dispensers,1st,2nd,third bridge pos}
		Lola.setMovementState("-YForward");//sets lola's starting position
		Lola.setEPLIST(EPLIST);
		Movement.coverClose(r);
		Movement.Up(r, 750);
//		Ping.testPosition(r, Movement.createExpectedPosition( r, Lola) ,Lola);//go to water
		Ping.checkBotForward(r);
		
	
		Movement.Down(r, 750);
		r.sleep(2000);
		Movement.Up(r,750);
		Movement.EBackward(r, 50, Lola);
		Movement.Down(r,750);
		Lola.changeMovementState(r, "+XForward", Lola);//changes Lola's orientation autonomously, hopefully
		Movement.Down(r, 1000);
		Ping.testPosition(r,Movement.createExpectedPosition(r, Lola),Lola);//go to first dispenser
		Movement.Retrieve(r,2);
		
		Ping.testPosition(r,Movement.createExpectedPosition(r, Lola),Lola);//go to second dispenser
		Movement.Retrieve(r, 2);
		Lola.changeMovementState(r, "-XForward", Lola);
		Ping.checkTopForward(r);//Runs until it hits the third dispenser
		Movement.EBackward(r, 50, Lola);
		Movement.Retrieve(r, 2);
		
		Lola.changeMovementState(r, "+YForward", Lola);//turns left
		
		Ping.testPosition(r,Movement.createExpectedPosition(r, Lola),Lola);//in front of fourth dispenser
		Lola.changeMovementState(r, "-XForward", Lola);
		Movement.Retrieve(r, 2);
		
		
		
		Movement.bridgeFind(r,Lola);
	
		
		Lola.changeMovementState(r, "-YForward", Lola);//Turn around so can go up backward
		
		Movement.bridgeRun(r);
		
		Lola.changeMovementState(r,"+XForward",Lola);
		Movement.coverOpen(r);
		return CONFIRM;
	}

}
