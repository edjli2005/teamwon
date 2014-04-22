import rxtxrobot.RXTXRobot;


public class Movement {
	Forward moveForward= new Forward();
	Backward moveBackward= new Backward();
	Right turnRight= new Right();
	Left turnLeft = new Left();
	Up goUp=new Up();
	Down goDown=new Down();
	EForward moveEForward= new EForward();
	EBackward moveEBackward= new EBackward();
	ERight turnERight= new ERight();
	ELeft turnELeft = new ELeft();
	Uturn U=new Uturn();
	Retrieve Retrieve=new Retrieve();
	createExpectedPosition EP=new createExpectedPosition();
	public Movement(){}
	//Movement object created for easy coding of movement.
	//Contains:
		//all non-encoded motor movement
		//all encoded movement with permutations, including separate values for wheels and passing movement data to Lola object
		//conversions between centimeters and ticks, including all permutations
		//expected position creation
	
	public void Forward(RXTXRobot r,int Time){
		moveForward.Forward(r, Time);
	}
	public void Backward(RXTXRobot r,int Time){
		moveBackward.Backward(r, Time);
	}
	public void Left(RXTXRobot r,int Time){
		turnLeft.Left(r, Time);
	}
	public void Right(RXTXRobot r,int Time){
		turnRight.Right(r, Time);
	}
	public void EForward(RXTXRobot r, int Ticks,LolaObjectMichael Lola) {
			moveEForward.EForward(r, Ticks);
			Lola.setstartEncoderValue( (Lola.getendEncoderValueLeft()) , (Lola.getendEncoderValueRight()) );
			Lola.setendEncoderValue(r.getEncodedMotorPosition(RXTXRobot.MOTOR1), r.getEncodedMotorPosition(RXTXRobot.MOTOR2));
	}
	public void EForward(RXTXRobot r, int TicksL, int TicksR,LolaObjectMichael Lola){
		moveEForward.EForward(r, TicksL, TicksR);
		Lola.setstartEncoderValue( (Lola.getendEncoderValueLeft()) , (Lola.getendEncoderValueRight()) );
		Lola.setendEncoderValue(r.getEncodedMotorPosition(RXTXRobot.MOTOR1), r.getEncodedMotorPosition(RXTXRobot.MOTOR2));
	}
	public void EBackward(RXTXRobot r,int Ticks,LolaObjectMichael Lola){
		moveEBackward.EBackward(r, Ticks);
		Lola.setstartEncoderValue( (Lola.getendEncoderValueLeft()) , (Lola.getendEncoderValueRight()) );
		Lola.setendEncoderValue(r.getEncodedMotorPosition(RXTXRobot.MOTOR1), r.getEncodedMotorPosition(RXTXRobot.MOTOR2));
}
	public void EBackward(RXTXRobot r, int TicksL, int TicksR,LolaObjectMichael Lola){
		moveEBackward.EBackward(r, TicksL, TicksR);
		Lola.setstartEncoderValue( (Lola.getendEncoderValueLeft()) , (Lola.getendEncoderValueRight()) );
		Lola.setendEncoderValue(r.getEncodedMotorPosition(RXTXRobot.MOTOR1), r.getEncodedMotorPosition(RXTXRobot.MOTOR2));
}
	public void ELeft(RXTXRobot r,int Ticks,LolaObjectMichael Lola){
		turnELeft.ELeft(r, Ticks);
		Lola.setstartEncoderValue( (Lola.getendEncoderValueLeft()) , (Lola.getendEncoderValueRight()) );
		Lola.setendEncoderValue(r.getEncodedMotorPosition(RXTXRobot.MOTOR1), r.getEncodedMotorPosition(RXTXRobot.MOTOR2));
	}
	public void ELeft(RXTXRobot r,LolaObjectMichael Lola){
		turnELeft.ELeft(r);
		Lola.setstartEncoderValue( (Lola.getendEncoderValueLeft()) , (Lola.getendEncoderValueRight()) );
		Lola.setendEncoderValue(r.getEncodedMotorPosition(RXTXRobot.MOTOR1), r.getEncodedMotorPosition(RXTXRobot.MOTOR2));
	}
	public void ERight(RXTXRobot r,int Ticks,LolaObjectMichael Lola){
		turnERight.ERight(r, Ticks);
		Lola.setstartEncoderValue( (Lola.getendEncoderValueLeft()) , (Lola.getendEncoderValueRight()) );
		Lola.setendEncoderValue(r.getEncodedMotorPosition(RXTXRobot.MOTOR1), r.getEncodedMotorPosition(RXTXRobot.MOTOR2));
	}
	public void ERight(RXTXRobot r,LolaObjectMichael Lola){
		turnERight.ERight(r);
		Lola.setstartEncoderValue( (Lola.getendEncoderValueLeft()) , (Lola.getendEncoderValueRight()) );
		Lola.setendEncoderValue(r.getEncodedMotorPosition(RXTXRobot.MOTOR1), r.getEncodedMotorPosition(RXTXRobot.MOTOR2));
	}
	public void Up(RXTXRobot r, int Time){
		goUp.Up(r, Time);
	}
	public void Down(RXTXRobot r, int Time){
		goDown.Down(r, Time);
	}
	public void Retrieve(RXTXRobot r, int Times){
		Retrieve.Retrieve(r, Times);
	}
	public void Uturn(RXTXRobot r){
		U.Uturn(r);
	}
	public void setDistanceX(RXTXRobot r, LolaObjectMichael Lola){
		Lola.setDistanceXTraveled( ( Lola.getendEncoderValueLeft() ) - ( Lola.getstartEncoderValueLeft() ) );
	}
	public void setDistanceY(RXTXRobot r, LolaObjectMichael Lola){
		Lola.setDistanceXTraveled( ( Lola.getendEncoderValueLeft() ) - ( Lola.getstartEncoderValueLeft() ) );
	}
	//to go 90 ticks [-94/93/97/96,-91]==33 cm
	//contains all conversions for:
		//centimeter to tick and vice versa
		//forward and backward
		//left and right wheels
		//int or double values
		public int CentToTickLF(int Cent){
			Cent=Cent*(93/33);
			return Cent;
		}
		public int CentToTickLB(int Cent){
			Cent=Cent*(97/33);
			return Cent;
		}
		public int CentToTickRF(int Cent){
			Cent=Cent*(90/33);
			return Cent;
		}
		public int CentToTickRB(int Cent){
			Cent=Cent*(90/33);
			return Cent;
		}
		public double CentToTickLF(double Cent){
			Cent=Cent*(93/33);
			return Cent;
		}
		public double CentToTickLB(double Cent){
			Cent=Cent*(97/33);
			return Cent;
		}
		public double CentToTickRF(double Cent){
			Cent=Cent*(90/33);
			return Cent;
		}
		public double CentToTickRB(double Cent){
			Cent=Cent*(90/33);
			return Cent;
		}
		public int TickToCentLF(int Tick){
			Tick=Tick*(33/93);
			return Tick;
		}
		public int TickToCentLB(int Tick){
			Tick=Tick*(33/97);
			return Tick;
		}
		public int TickToCentRF(int Tick){
			Tick=Tick*(33/90);
			return Tick;
		}
		public int TickToCentRB(int Tick){
			Tick=Tick*(33/90);
			return Tick;
		}
		public double TickToCentLF(double Tick){
			Tick=Tick*(33/93);
			return Tick;
		}
		public double TickToCentLB(double Tick){
			Tick=Tick*(33/97);
			return Tick;
		}
		public double TickToCentRF(double Tick){
			Tick=Tick*(33/90);
			return Tick;
		}
		public double TickToCentRB(double Tick){
			Tick=Tick*(33/90);
			return Tick;
		}
		//passes to expected position function, only included for ease of use.
		public int[] createExpectedPosition(RXTXRobot r, LolaObjectMichael Lola){
			int[] expectedPosition = EP.createExpectedPosition(r, Lola);
			return expectedPosition;
		}
}
