import rxtxrobot.*;


public class FullRun {
	public FullRun(){}//constructor needed for ActionListener
	public void FULLRUN(RXTXRobot r){
		
		//Where we can plan out the full run actions and have it execute
		//with a button
		Up goUp=new Up();
		Down goDown=new Down();
		waterTests testWater= new waterTests();
		EForward FEncoded= new EForward();
		EBackward BEncoded=new EBackward();
		ELeft LEncoded=new ELeft();
		ERight REncoded = new ERight();
		Retrieve ballRetrieve = new Retrieve();
		coverOpen ballCoverUp= new coverOpen();
		coverClose ballCoverDown= new coverClose();
		Uturn U=new Uturn();
		testBridge findBridge=new testBridge();		
		waterMath MATH=new waterMath();
		
		int[] Balls;
		int Turb100,Turb10,Salt100,Salt10;
		
		

		FEncoded.EForward(r, 200);//go forward to water
		
		
		goDown.Down(r, 500);
		
		double[] testValues= testWater.waterTests(r);//test water
		Balls= MATH.waterMath(testValues);
		Turb100=Balls[0];
		Turb10=Balls[1];
		Salt100=Balls[2];
		Salt10=Balls[3];
		
		goUp.Up(r,500);
		LEncoded.ELeft(r,100);//turn left toward dispenser
		FEncoded.EForward(r, 300);//drives toward dispenser
		
		
		ballRetrieve.Retrieve(r,Turb100);//retrieves number of balls,change for different placement of dispensers, front-left from start
		BEncoded.EBackward(r,50);
		LEncoded.ELeft(r, 100);
		FEncoded.EForward(r, 150);//goes to second dispenser
		REncoded.ERight(r, 100);
		FEncoded.EForward(r,50);
		ballRetrieve.Retrieve(r, Turb10);//change for different placement of dispensers, back-left from start
		
		
		BEncoded.EBackward(r,200);
		U.Uturn(r, 0);
		FEncoded.EForward(r, 300);//go to other side
		
		
		ballRetrieve.Retrieve(r,Salt10);//retrieves number of balls, change for different placement of dispensers, back-right from start
		BEncoded.EBackward(r,50);
		LEncoded.ELeft(r, 100);
		FEncoded.EForward(r, 150);//goes to second dispenser
		REncoded.ERight(r, 100);
		FEncoded.EForward(r,50);
		ballRetrieve.Retrieve(r, Salt100);//change for different placement of dispensers, front right from start
		
		
		BEncoded.EBackward(r, 50);
		REncoded.ERight(r, 100);
		FEncoded.EForward(r, 200);//goes to side of canyon
		REncoded.ERight(r, 100);
		
		
		findBridge.testBridge(r);
		
		
		REncoded.ERight(r, 100);
		FEncoded.EForward(r,100);//go to release pit and release balls
		
		
		ballCoverUp.coverOpen(r);
		r.sleep(2500);
		ballCoverDown.coverClose(r);
		r.close();

	}
}
