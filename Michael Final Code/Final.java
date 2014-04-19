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
		Bump testBump = new Bump();
		ballArm getBall= new ballArm();
		Forward moveForward= new Forward();
		Backward moveBackward= new Backward();
		Right turnRight= new Right();
		Left turnLeft = new Left();
		int[] Balls = new int [4];
		double[] expectedPosition={0,0};
		//int Turb100,Turb10,Salt100,Salt10;
		
		//corrector.testPosition(r,expectedPosition);
		
		ballCoverDown.coverClose(r);//get to starting positions
		r.sleep(200);
		getBall.ballArm(r, 180);
		r.sleep(200);
		
		
		//.14 in/Tick
		
		FEncoded.EForward(r, 100);//go forward to water//about 3 ft
		r.sleep(200);
		FEncoded.EForward(r, 100);
		r.sleep(200);
		goUp.Up(r, 2000);
		r.sleep(200);
		FEncoded.EForward(r, 100);
		
		expectedPosition[0]=0;
		expectedPosition[1]=0;
		
		//corrector.testPosition(r,expectedPosition);
		
		
		goDown.Down(r, 1500);//dip into water bowl
	
		
		double[] testValues=testWater.waterTests(r);//test water
		
		//Balls= MATH.waterMath(testValues,First,Second,Third,Fourth);
		Balls[0]=1;
		Balls[1]=2;
		Balls[2]=3;
		Balls[3]=4;
		
		
		goUp.Up(r,2000);
		BEncoded.EBackward(r,75);//unsure about number
		goDown.Down(r, 2500);
		LEncoded.ELeft(r,67);//turn Right toward dispenser, needs 70 ticks
		
		moveForward.Forward(r, 0);//drives toward dispenser// about 3.5 ft
		while(testBump.Bump(r)==false){//goes until bump sensor says true
			r.sleep(50);
		}
		FEncoded.EForward(r, 1);//stops
		
		expectedPosition[0]=0;//leftover from x/y navigation
		expectedPosition[1]=0;
		
		//corrector.testPosition(r,expectedPosition);
		
		
		ballRetrieve.Retrieve(r,(Balls[0]-1));//retrieves number of balls, -1 b/c of first hit
		
		BEncoded.EBackward(r,50);
		
		LEncoded.ELeft(r, 80);
		
		FEncoded.EForward(r, 100);//goes to second dispenser//about 2 feet
		r.sleep(200);
		FEncoded.EForward(r, 55);
		
		REncoded.ERight(r, 80);//left needs 80 ticks
		
		moveForward.Forward(r, 0);
		while(testBump.Bump(r)==false){
			r.sleep(50);
		}
		FEncoded.EForward(r, 1);//stops
		
		ballRetrieve.Retrieve(r, (Balls[1]-1));
		
		expectedPosition[0]=0;
		expectedPosition[1]=0;
		
		//corrector.testPosition(r,expectedPosition);
		
		
		BEncoded.EBackward(r,100);//does  S shape back to first dispenser on left side
		r.sleep(200);
		LEncoded.ELeft(r, 80);
		r.sleep(200);
		FEncoded.EForward(r, 100);
		r.sleep(200);
		FEncoded.EForward(r, 75);
		r.sleep(200);
		LEncoded.ELeft(r, 80);
		r.sleep(200);
		
		moveForward.Forward(r, 0);
		while(testBump.Bump(r)==false){
			r.sleep(50);
		}
		FEncoded.EForward(r, 1);//stops
		
		expectedPosition[0]=0;
		expectedPosition[1]=0;
		
		//corrector.testPosition(r,expectedPosition);
		
		
		ballRetrieve.Retrieve(r,(Balls[2]-1));//retrieves number of balls
		
		BEncoded.EBackward(r,25);
		
		LEncoded.ELeft(r, 80);
		
		FEncoded.EForward(r, 100);//goes to second dispenser//about 2 feet
		r.sleep(200);
		FEncoded.EForward(r, 70);
		
				REncoded.ERight(r, 80);
		
		moveForward.Forward(r, 0);
		while(testBump.Bump(r)==false){
			r.sleep(50);
		}
		FEncoded.EForward(r, 1);//stops
		
		ballRetrieve.Retrieve(r, (Balls[3]-1));
		
		expectedPosition[0]=0;
		expectedPosition[1]=0;
		
		
		BEncoded.EBackward(r, 25);//gets soccer ball hopefully
		LEncoded.ELeft(r, 80);
		FEncoded.EForward(r, 5000);
		r.sleep(100);
		getBall.ballArm(r, 0);
		r.sleep(1000);
		r.close();
		//corrector.testPosition(r,expectedPosition);
		
		BEncoded.EBackward(r, 10);
		
				REncoded.ERight(r, 80);
		
		FEncoded.EForward(r, 470);//goes to side of canyon//about 5.5 feet
		
				REncoded.ERight(r, 80);
		
		expectedPosition[0]=0;
		expectedPosition[1]=0;
		
		//corrector.testPosition(r,expectedPosition);
		
		
		findBridge.testBridge(r);
		
		expectedPosition[0]=0;
		expectedPosition[1]=0;
		
		//corrector.testPosition(r,expectedPosition);
		
		
				REncoded.ERight(r, 80);
		
		FEncoded.EForward(r,275);//go to release pit and release balls//about 3.5 feet
		
		expectedPosition[0]=0;
		expectedPosition[1]=0;
		
		//corrector.testPosition(r,expectedPosition);
		
		
		ballCoverUp.coverOpen(r);
		
		
		ballCoverDown.coverClose(r);
		
		

	}
}
