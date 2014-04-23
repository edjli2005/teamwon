import rxtxrobot.RXTXRobot;

public class Ping {
	//getPosition newgetPosition = new getPosition();
	//correctPosition newcorrectPosition = new correctPosition();
	setPing newsetPing= new setPing();
	testDoublePing newtestDoublePing = new testDoublePing();
	testPosition newtestPosition = new testPosition();
	createExpectedPosition newcreateExpectedPosition= new createExpectedPosition();
	public Ping(){}
	//Ping object created for easy coding for Ping sensors.
	//Contains:
		//get position, correct position, and the driver function test position
		//set ping, including all permutations
		//test double ping sensors
		////conversions between centimeters and ticks, including all permutations
//	public void getPosition(RXTXRobot r,  int[] expectedPosition,LolaObjectMichael Lola){
//		newgetPosition.getPosition(r,expectedPosition,Lola);
//	}
//	public void getPosition(RXTXRobot r){
//		newgetPosition.getPosition(r);
//	}
	/*public void correctPosition(RXTXRobot r, int[] Changes,LolaObjectMichael Lola){
		newcorrectPosition.correctPosition(r, Changes, Lola);
	}*/
	public void setPing(RXTXRobot r, int whichPing, LolaObjectMichael Lola){
		newsetPing.setPing(r, whichPing, Lola);
	}
	public void setPing(RXTXRobot r, int whichPing){
		newsetPing.setPing(r, whichPing);
	}
	public void setPing(RXTXRobot r,LolaObjectMichael Lola){
		newsetPing.setPing(r, Lola);
	}
	public int[] testDoublePing(RXTXRobot r,LolaObjectMichael Lola){
		int[] returnArray;
		returnArray=newtestDoublePing.testDoublePing(r, Lola);
		return returnArray;
	}
	public int[] testDoublePing(RXTXRobot r){
		int[] returnArray;
		returnArray=newtestDoublePing.testDoublePing(r);
		return returnArray;
	}
	public void testPosition(RXTXRobot r, int [] expectedPosition,LolaObjectMichael Lola){
		newtestPosition.testPosition(r, expectedPosition, Lola);
	}
	//to go 90 ticks [-65,-72]==33 cm
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
			public void checkTopForward(RXTXRobot r){
				r.refreshAnalogPins();
				int R=-122;
				int L=-100;
				int[] Speed={L,R};
				int[] PingValues;
				while(r.getAnalogPin(2).getValue()<900){
					r.refreshAnalogPins();
					r.runMotor(RXTXRobot.MOTOR1, Speed[0], RXTXRobot.MOTOR2, Speed[1],0 );
					PingValues=testDoublePing(r);
					
					if(PingValues[0]>115){
						PingValues[0]=PingValues[0]-115;
						Speed[1]=(int) (Speed[1]-(PingValues[0]*.5));
					}
					if(PingValues[0]<105){
						PingValues[0]=105-PingValues[0];
						Speed[1]=(int) (Speed[1]+(PingValues[0]*.5));
					}
					System.out.println(r.getAnalogPin(2).getValue());
				}
			
			}
			public void checkBotForward(RXTXRobot r){
				r.refreshAnalogPins();
				int R=-122;
				int L=-100;
				int[] Speed={L,R};
				int[] PingValues;
				while(r.getAnalogPin(1).getValue()<900){
					r.refreshAnalogPins();
					r.runMotor(RXTXRobot.MOTOR1, Speed[0], RXTXRobot.MOTOR2, Speed[1],0 );
					PingValues=testDoublePing(r);
					
					if(PingValues[0]>115){
						PingValues[0]=PingValues[0]-115;
						Speed[1]=(int) (Speed[1]-(PingValues[0]*.5));
					}
					if(PingValues[0]<105){
						PingValues[0]=105-PingValues[0];
						Speed[1]=(int) (Speed[1]+(PingValues[0]*.5));
					}
					System.out.println(r.getAnalogPin(1).getValue());
				}
			
			}
}