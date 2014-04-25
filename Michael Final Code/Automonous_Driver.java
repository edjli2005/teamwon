import rxtxrobot.RXTXRobot;


public class Automonous_Driver {
	Movement Movement=new Movement();
	Ping Ping = new Ping();
	bridgeFind Find=new bridgeFind();
	waterTests Water = new waterTests();
	Automonous_Driver(){}
	
	public String Automonous_Driver(RXTXRobot r, LolaObjectMichael Lola, int disOneVal, int disTwoVal, int disThreeVal, int disFourVal){
		String CONFIRM="Completed Successfully";
		
		int[] EPLIST={  47,44,  170,116   ,49,176,  107,172,    96,15 ,  0,0 ,  0,0 , 0,0    };//Coordinates for stationary positions{1st, 2nd, 3rd,fourth dispensers,First bridge pos,(ball pos 1 and 2)}
		Lola.setMovementState("+XForward");//sets lola's starting position
		
		Lola.setEPLIST(EPLIST);
//		Movement.coverClose(r);

//		Movement.Forward(r, 5);
//		Movement.EForward(r, 100);
		//Ping.checkBotForward(r,110);//runs to water
		while(r.getAnalogPin(1).getValue()<900){
			Movement.Forward(r, 0);
			r.refreshAnalogPins();
		}
		Movement.Forward(r, 1);
		Movement.EBackward(r,25);
		Movement.Up(r, 1500);
		Movement.ETurnF(r, 60, 5);
		Movement.Down(r, 1500);//gets in, tests water, and turns towards first dispenser
		double[] waterValues=Water.waterTests(r);//[0] salinity   [1] turbidity
		int lowSalt=0;
		int highSalt=0;
		int lowTurb=0;
		int highTurb=0;
		Movement.Up(r, 1500);
		Movement.ETurnB(r, 60,5);
		Movement.Down(r, 2000);
		Lola.changeMovementState(r, "+XForward", Lola);
		
		Ping.testPosition(r, Movement.createExpectedPosition( r, Lola) ,Lola);//go to first dispenser
		Lola.changeMovementState(r, "-XForward", Lola);
		
		while(waterValues[0]>=150){//calcs Salinity balls
			waterValues[0]=waterValues[0]-150;
			highSalt++;
		}
		lowSalt=(int) (waterValues[0]/20);
		
		while(waterValues[1]>=15){//calcs Turbidity balls
			waterValues[1]=waterValues[1]-15;
			highTurb++;
		}
		lowTurb= (int) (waterValues[1]/5);
		
		
		
		if(disOneVal==150){//retrieves number of balls based on input value
		Movement.Retrieve(r, highSalt);//gets balls
		System.out.println("Getting "+highSalt+ " Salinity balls worth 150 ms/cm each!");
		}
		else if(disOneVal==20){
			Movement.Retrieve(r, lowSalt);
			System.out.println("Getting "+lowSalt+ " Salinity balls worth 20 ms/cm each!");
		}
		else if(disOneVal==15){
			Movement.Retrieve(r, highTurb);
			System.out.println("Getting "+highTurb+ " Turbidity balls worth 15 NTU each!");
		}
		else if(disOneVal==5){
			Movement.Retrieve(r, lowTurb);
			System.out.println("Getting "+lowTurb+ " Turbidity balls worth 5 NTU each!");
		}
		Movement.EBackward(r, 50); //why is this here
		
		Lola.changeMovementState(r, "+YForward", Lola);
		Ping.testPosition(r, Movement.createExpectedPosition( r, Lola) ,Lola);//go to second dispenser	
		Lola.changeMovementState(r, "-XForward", Lola);
		
		if(disTwoVal==150){//retrieves number of balls based on input value
			Movement.Retrieve(r, highSalt);//gets balls
			System.out.println("Getting "+highSalt+ " Salinity balls worth 150 ms/cm each!");
			}
			else if(disTwoVal==20){
				Movement.Retrieve(r, lowSalt);
				System.out.println("Getting "+lowSalt+ " Salinity balls worth 20 ms/cm each!");
			}
			else if(disTwoVal==15){
				Movement.Retrieve(r, highTurb);
				System.out.println("Getting "+highTurb+ " Turbidity balls worth 15 NTU each!");
			}
			else if(disTwoVal==5){
				Movement.Retrieve(r, lowTurb);
				System.out.println("Getting "+lowTurb+ " Turbidity balls worth 5 NTU each!");
			}
		
		Lola.changeMovementState(r, "+XForward", Lola);
		Ping.testPosition(r, Movement.createExpectedPosition( r, Lola) ,Lola);//go to third dispenser
		
		if(disThreeVal==150){//retrieves number of balls based on input value
			Movement.Retrieve(r, highSalt);//gets balls
			System.out.println("Getting "+highSalt+ " Salinity balls worth 150 ms/cm each!");
			}
			else if(disThreeVal==20){
				Movement.Retrieve(r, lowSalt);
				System.out.println("Getting "+lowSalt+ " Salinity balls worth 20 ms/cm each!");
			}
			else if(disThreeVal==15){
				Movement.Retrieve(r, highTurb);
				System.out.println("Getting "+highTurb+ " Turbidity balls worth 15 NTU each!");
			}
			else if(disThreeVal==5){
				Movement.Retrieve(r, lowTurb);
				System.out.println("Getting "+lowTurb+ " Turbidity balls worth 5 NTU each!");
			}
		
		Ping.testPosition(r, Movement.createExpectedPosition( r, Lola) ,Lola);//go to Fourth dispenser
		
		if(disFourVal==150){//retrieves number of balls based on input value
			Movement.Retrieve(r, highSalt);//gets balls
			System.out.println("Getting "+highSalt+ " Salinity balls worth 150 ms/cm each!");
			}
			else if(disFourVal==20){
				Movement.Retrieve(r, lowSalt);
				System.out.println("Getting "+lowSalt+ " Salinity balls worth 20 ms/cm each!");
			}
			else if(disFourVal==15){
				Movement.Retrieve(r, highTurb);
				System.out.println("Getting "+highTurb+ " Turbidity balls worth 15 NTU each!");
			}
			else if(disFourVal==5){
				Movement.Retrieve(r, lowTurb);
				System.out.println("Getting "+lowTurb+ " Turbidity balls worth 5 NTU each!");
			}
		Ping.testPosition(r, Movement.createExpectedPosition( r, Lola) ,Lola);//go to EP for first bridge pos
		Lola.changeMovementState(r,"-XForward",Lola);
		Find.bridgeFind(r,Lola);//duh this function is interesting to me........ 		
		Lola.changeMovementState(r, "-YForward", Lola);//Turn around so can go up backward

		Movement.bridgeRun(r);//duh
		
		Lola.changeMovementState(r,"+XForward",Lola);
		Movement.coverOpen(r);
		
		//ALL BALL STUFF
	
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
		Movement.Dance(r);
		
		
		
		return CONFIRM;
	}

}
