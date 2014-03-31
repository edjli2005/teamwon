import rxtxrobot.RXTXRobot;


public class Final {
	public Final(){}
	public void Final(RXTXRobot r,int First,int Second,int Third,int Fourth){

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
		
		//corrector.testPosition(r,expectedPosition);
		r.connect();
		ballCoverDown.coverClose(r);

		
		r.connect();
		FEncoded.EForward(r, 240);//go forward to water//about 3 ft
		
		
		expectedPosition[0]=0;
		expectedPosition[1]=0;
		r.connect();
		//corrector.testPosition(r,expectedPosition);
		
		r.connect();
		goDown.Down(r, 500);
		
		r.connect();
		double[] testValues= testWater.waterTests(r);//test water
		r.connect();
		Balls= MATH.waterMath(testValues,First,Second,Third,Fourth);
		First=Balls[0];
		Turb10=Balls[1];
		Salt100=Balls[2];
		Salt10=Balls[3];
		
		r.connect();
		goUp.Up(r,500);
		r.connect();
		LEncoded.ELeft(r,100);//turn left toward dispenser
		r.connect();
		FEncoded.EForward(r, 280);//drives toward dispenser// about 3.5 ft
		
		expectedPosition[0]=0;
		expectedPosition[1]=0;
		r.connect();
		//corrector.testPosition(r,expectedPosition);
		
		r.connect();
		ballRetrieve.Retrieve(r,Balls[0]);//retrieves number of balls,change for different placement of dispensers, front-left from start
		r.connect();
		BEncoded.EBackward(r,10);
		r.connect();
		LEncoded.ELeft(r, 100);
		r.connect();
		FEncoded.EForward(r, 160);//goes to second dispenser//about 2 feet
		r.connect();
		REncoded.ERight(r, 100);
		r.connect();
		FEncoded.EForward(r,20);
		r.connect();
		ballRetrieve.Retrieve(r, Balls[1]);//change for different placement of dispensers, back-left from start
		
		expectedPosition[0]=0;
		expectedPosition[1]=0;
		r.connect();
		//corrector.testPosition(r,expectedPosition);
		
		r.connect();
		BEncoded.EBackward(r,100);
		r.connect();
		U.Uturn(r, 0);
		r.connect();
		FEncoded.EForward(r, 460);//go to other side//about 7 feet
		
		expectedPosition[0]=0;
		expectedPosition[1]=0;
		r.connect();
		//corrector.testPosition(r,expectedPosition);
		
		r.connect();
		ballRetrieve.Retrieve(r,Balls[2]);//retrieves number of balls, change for different placement of dispensers, back-right from start
		r.connect();
		BEncoded.EBackward(r,10);
		r.connect();
		LEncoded.ELeft(r, 100);
		r.connect();
		FEncoded.EForward(r, 160);//goes to second dispenser//abou 2 feet
		r.connect();
		REncoded.ERight(r, 100);
		r.connect();
		FEncoded.EForward(r,20);
		r.connect();
		ballRetrieve.Retrieve(r, Balls[3]);//change for different placement of dispensers, front right from start
		
		expectedPosition[0]=0;
		expectedPosition[1]=0;
		r.connect();
		//corrector.testPosition(r,expectedPosition);
		
		r.connect();
		BEncoded.EBackward(r, 10);
		r.connect();
		REncoded.ERight(r, 100);
		r.connect();
		FEncoded.EForward(r, 440);//goes to side of canyon//about 5.5 feet
		r.connect();
		REncoded.ERight(r, 100);
		
		expectedPosition[0]=0;
		expectedPosition[1]=0;
		r.connect();
		//corrector.testPosition(r,expectedPosition);
		
		r.connect();
		findBridge.testBridge(r);
		
		expectedPosition[0]=0;
		expectedPosition[1]=0;
		r.connect();
		//corrector.testPosition(r,expectedPosition);
		
		r.connect();
		REncoded.ERight(r, 100);
		r.connect();
		FEncoded.EForward(r,300);//go to release pit and release balls//about 3.5 feet
		
		expectedPosition[0]=0;
		expectedPosition[1]=0;
		r.connect();
		//corrector.testPosition(r,expectedPosition);
		
		r.connect();
		ballCoverUp.coverOpen(r);
		
		r.connect();
		ballCoverDown.coverClose(r);
		
		

	}
}
