import rxtxrobot.RXTXRobot;


public class Automonous_Driver {
	Movement Movement=new Movement();
	Ping Ping = new Ping();
	bridgeFind Find=new bridgeFind();
	
	Automonous_Driver(){}
	
	public String Automonous_Driver(RXTXRobot r, LolaObjectMichael Lola){
		String CONFIRM="Completed Successfully";
		int[] EPLIST={  50,174,  109,174   ,118,39,  54,41,    21,120 ,  0,0 ,  0,0 , 0,0    };//Coordinates for stationary positions{1st, 2nd, 3rd,fourth dispensers,1st,2nd,third bridge pos}
		Lola.setMovementState("-YForward");//sets lola's starting position
		Lola.setEPLIST(EPLIST);
		Movement.coverClose(r);
		r.refreshAnalogPins();
		r.refreshDigitalPins();
		Ping.checkBotForward(r,100);//runs to water
		
		Movement.EBackward(r,50);
		Movement.Up(r, 3000);
		Movement.EForward(r, 75);
		Movement.Down(r, 3000);//gets in, tests water, and turns towards first dispenser
		r.sleep(1000);
		Movement.Up(r, 3000);
		Movement.EBackward(r, 100);
		Movement.Down(r, 3000);
		Lola.changeMovementState(r, "+XForward", Lola);
		
		Ping.testPosition(r, Movement.createExpectedPosition( r, Lola) ,Lola);//go to first dispenser
		Ping.checkTopForward(r,50);
		Movement.Retrieve(r, 2);//gets balls
		Movement.EBackward(r, 50);
		
		
		Ping.testPosition(r, Movement.createExpectedPosition( r, Lola) ,Lola);//go to second dispenser	
		Ping.checkTopForward(r,109);
		Movement.Retrieve(r, 2);//get balls
		
		Ping.testPosition(r, Movement.createExpectedPosition( r, Lola) ,Lola);//go to third dispenser, backwards ;p
		Lola.changeMovementState(r, "-XForward", Lola);
		Ping.checkTopForward(r,118);
		Movement.Retrieve(r, 2);
		
		Lola.changeMovementState(r, "+XForward", Lola);//goes to fourth dispenser, oddly?
		Ping.testPosition(r, Movement.createExpectedPosition( r, Lola) ,Lola);//go to Fourth dispenser, backwards ;p
		Lola.changeMovementState(r, "-XForward", Lola);
		Movement.Retrieve(r, 2);
		
		Lola.changeMovementState(r,"+YForward",Lola);
		Find.bridgeFind(r,Lola);//duh		
		Lola.changeMovementState(r, "-YForward", Lola);//Turn around so can go up backward
		
		Movement.bridgeRun(r);//duh
		
		Lola.changeMovementState(r,"+XForward",Lola);
		Movement.coverOpen(r);
		
		
		//ALL BALL STUFF
		/*
		Movement.coverClose(r);
		Find.bridgeFind(r,Lola);//finds to re-cross bridge	
		Lola.changeMovementState(r, "+YForward", Lola);//Turn around so can go up backward
		
		Movement.bridgeRun(r);//duh
		
		Lola.changeMovementState(r,"+XForward",Lola);
		Ping.testPosition(r, Movement.createExpectedPosition( r, Lola) ,Lola);//go to 1st ball position
		Movement.ballArm(r, 160);//unsheathe arm
		Movement.EForward(r, 50);
		Movement.Up(r,1500);//knock ball off
		Movement.ballArm(r, 0);//sheathe arm
		Movement.Down(r,2000);
		
		Ping.testPosition(r, Movement.createExpectedPosition( r, Lola) ,Lola);//go to 2nd ball position
		Lola.changeMovementState(r, "-XForward", Lola);
		Movement.ballArm(r, 160);//unsheathe arm
		Movement.EForward(r, 50);
		Movement.Up(r,1500);//knock ball off
		Movement.ballArm(r, 0);//sheathe arm
		Movement.Down(r,2000);
		Movement.EBackward(r, 75);
		//Movement.Dance(r);
		*/
		
		
		return CONFIRM;
	}

}
