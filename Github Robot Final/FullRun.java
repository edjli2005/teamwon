import rxtxrobot.*;


public class FullRun {
	public FullRun(){}//constructor needed for ActionListener
	public void FULLRUN(RXTXRobot r){
		
		//Where we can plan out the full run actions and have it execute
		//with a button
		Forward moveForward= new Forward();
		Backward moveBackward= new Backward();
		Right turnRight= new Right();
		Left turnLeft = new Left();
		Up goUp=new Up();
		Down goDown=new Down();
		waterTests testWater= new waterTests();
		salinityTest testSalinity = new salinityTest();
		turbidityTest testTurbidity= new turbidityTest();
		getPing Ping=new getPing();
		EForward FEncoded= new EForward();
		EBackward BEncoded=new EBackward();
		ELeft LEncoded=new ELeft();
		ERight REncoded = new ERight();
		Retrieve ballRetrieve = new Retrieve();
		coverOpen ballCoverUp= new coverOpen();
		coverClose ballCoverDown= new coverClose();
		bridgeRun bridgeAttack= new bridgeRun();
		testPosition corrector=new testPosition();
		getPosition positionGetter=new getPosition();
		Uturn U=new Uturn();
		testBridge findBridge=new testBridge();
		waterMath MATH=new waterMath();
		
		FEncoded.EForward(r, 200);//go forward to water
		corrector.testPosition(r);
		
		goDown.Down(r, 500);
		
		double[] testValues= testWater.waterTests(r);//test water
		int[] Balls= MATH.waterMath(testValues);
		goUp.Up(r,500);
		
		LEncoded.ELeft(r,100);//turn left toward dispenser
		FEncoded.EForward(r, 300);//drives toward dispenser
		
		
		ballRetrieve.Retrieve(r,Balls[0]);//retrieves number of balls
		BEncoded.EBackward(r,50);
		LEncoded.ELeft(r, 100);
		FEncoded.EForward(r, 150);//goes to second dispenser
		REncoded.ERight(r, 100);
		FEncoded.EForward(r,50);
		ballRetrieve.Retrieve(r, Balls[1]);
		
		
		BEncoded.EBackward(r,200);
		U.Uturn(r, 0);
		FEncoded.EForward(r, 300);//go to other side
		
		
		ballRetrieve.Retrieve(r,Balls[4]);//retrieves number of balls
		BEncoded.EBackward(r,50);
		LEncoded.ELeft(r, 100);
		FEncoded.EForward(r, 150);//goes to second dispenser
		REncoded.ERight(r, 100);
		FEncoded.EForward(r,50);
		ballRetrieve.Retrieve(r, Balls[3]);
		
		
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
		
	}
}
