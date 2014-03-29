import rxtxrobot.RXTXRobot;


public class Final {
	public Final(){}
	public void Final(RXTXRobot r){

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
		testPosition corrector=new testPosition();
		Uturn U=new Uturn();
		testBridge findBridge=new testBridge();
		waterMath MATH=new waterMath();
		int[] Balls;
		double[] expectedPosition={0,0};
		int Turb100,Turb10,Salt100,Salt10;
		
		corrector.testPosition(r,expectedPosition);

		FEncoded.EForward(r, 240);//go forward to water//about 3 ft
		
		expectedPosition[0]=0;
		expectedPosition[1]=0;
		corrector.testPosition(r,expectedPosition);
		
		goDown.Down(r, 500);
		
		double[] testValues= testWater.waterTests(r);//test water
		Balls= MATH.waterMath(testValues);
		Turb100=Balls[0];
		Turb10=Balls[1];
		Salt100=Balls[2];
		Salt10=Balls[3];
		
		goUp.Up(r,500);
		LEncoded.ELeft(r,100);//turn left toward dispenser
		FEncoded.EForward(r, 280);//drives toward dispenser// about 3.5 ft
		
		expectedPosition[0]=0;
		expectedPosition[1]=0;
		corrector.testPosition(r,expectedPosition);
		
		ballRetrieve.Retrieve(r,Turb100);//retrieves number of balls,change for different placement of dispensers, front-left from start
		BEncoded.EBackward(r,10);
		LEncoded.ELeft(r, 100);
		FEncoded.EForward(r, 160);//goes to second dispenser//about 2 feet
		REncoded.ERight(r, 100);
		FEncoded.EForward(r,20);
		ballRetrieve.Retrieve(r, Turb10);//change for different placement of dispensers, back-left from start
		
		expectedPosition[0]=0;
		expectedPosition[1]=0;
		corrector.testPosition(r,expectedPosition);
		
		BEncoded.EBackward(r,100);
		U.Uturn(r, 0);
		FEncoded.EForward(r, 460);//go to other side//about 7 feet
		
		expectedPosition[0]=0;
		expectedPosition[1]=0;
		corrector.testPosition(r,expectedPosition);
		
		ballRetrieve.Retrieve(r,Salt10);//retrieves number of balls, change for different placement of dispensers, back-right from start
		BEncoded.EBackward(r,10);
		LEncoded.ELeft(r, 100);
		FEncoded.EForward(r, 160);//goes to second dispenser//abou 2 feet
		REncoded.ERight(r, 100);
		FEncoded.EForward(r,20);
		ballRetrieve.Retrieve(r, Salt100);//change for different placement of dispensers, front right from start
		
		expectedPosition[0]=0;
		expectedPosition[1]=0;
		corrector.testPosition(r,expectedPosition);
		
		BEncoded.EBackward(r, 10);
		REncoded.ERight(r, 100);
		FEncoded.EForward(r, 440);//goes to side of canyon//about 5.5 feet
		REncoded.ERight(r, 100);
		
		expectedPosition[0]=0;
		expectedPosition[1]=0;
		corrector.testPosition(r,expectedPosition);
		
		findBridge.testBridge(r);
		
		expectedPosition[0]=0;
		expectedPosition[1]=0;
		corrector.testPosition(r,expectedPosition);
		
		REncoded.ERight(r, 100);
		FEncoded.EForward(r,300);//go to release pit and release balls//about 3.5 feet
		
		expectedPosition[0]=0;
		expectedPosition[1]=0;
		corrector.testPosition(r,expectedPosition);
		
		ballCoverUp.coverOpen(r);
		r.sleep(2500);
		ballCoverDown.coverClose(r);
		
		
	}
}
