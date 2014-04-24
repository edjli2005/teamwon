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
		//conversions between centimeters and ticks, including all permutations
		//checkforward, including with bump sensor functionality
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
			public void checkTopForward(RXTXRobot r,int Line){
				r.refreshAnalogPins();
				int R=-100;
				int L=-100;
				int[] Speed={R,L};
				int[] PingValues;
				
				int Changes;
				while(r.getAnalogPin(2).getValue()<900){
					Changes=0;
					Speed[0]=R;
					Speed[1]=L;
					r.refreshAnalogPins();
					r.runMotor(r.MOTOR1, Speed[0], r.MOTOR2, Speed[1],0 );
					
					if(Line==-1){
						System.out.println("Skipped checks B/C Line = -1!");
					}
					else{
						PingValues=testDoublePing(r);
						if(PingValues[0]>Line+30||PingValues[0]<Line-30){
							PingValues[0]=Line;
						}
						if(PingValues[1]>200||PingValues[1]<5){
							PingValues[1]=100;
						}
					
						if(PingValues[0]>Line+3){
							//r.runMotor(RXTXRobot.MOTOR1, 0, RXTXRobot.MOTOR2, 0,0 );
							Changes=PingValues[0]-Line;
							Speed[1]=(int) (Speed[1]+(Changes*1.5));
							System.out.println("too far");
							System.out.println("Changes Are: "+Changes);
							System.out.println("new Speed left wheel is "+Speed[1]);
							//r.runMotor(RXTXRobot.MOTOR1, 0, RXTXRobot.MOTOR2, 0,0 );
							r.runMotor(r.MOTOR1, Speed[0], r.MOTOR2, Speed[1],0 );
							r.sleep(200);
						
							Speed[1]=(int) (Speed[1]+(Changes*2));
							//r.runMotor(r.MOTOR1, 0, r.MOTOR2, 0,0 );
							r.runMotor(r.MOTOR1, Speed[0], r.MOTOR2, Speed[1],0 );
						
						}
						if(PingValues[0]<Line-3){
							//r.runMotor(r.MOTOR1, 0, r.MOTOR2, 0,0 );
							Changes=95-PingValues[0];
							System.out.println("too close");
							Speed[0]=(int) (Speed[0]+(Changes*1.5));
							System.out.println("Changes Are: "+Changes);
							System.out.println("new Speed is "+Speed[0]);
							//r.runMotor(r.MOTOR1, 0, r.MOTOR2, 0,0 );
							r.runMotor(r.MOTOR1, Speed[0], r.MOTOR2, Speed[1],0 );
							r.sleep(200);
							
							Speed[0]=(int) (Speed[0]+(Changes*2));
							//r.runMotor(r.MOTOR1, 0, r.MOTOR2, 0,0 );
							r.runMotor(r.MOTOR1, Speed[0], r.MOTOR2, Speed[1],0 );
						}	
					}
					System.out.println("Checked");
				}
				r.refreshAnalogPins();
				System.out.println(r.getAnalogPin(2).getValue());
			}
			
			
			public void checkBotForward(RXTXRobot r,int Line){
				r.refreshAnalogPins();
				int R=-100;
				int L=-100;
				int[] Speed={R,L};
				int[] PingValues;
				
				int Changes;
				while(r.getAnalogPin(1).getValue()<900){
					Changes=0;
					Speed[0]=R;
					Speed[1]=L;
					r.refreshAnalogPins();
					r.runMotor(r.MOTOR1, Speed[0], r.MOTOR2, Speed[1],0 );
					if(Line==-1){
						System.out.println("Skipped checks B/C Line = -1!");
					}
					else{
						PingValues=testDoublePing(r);
						if(PingValues[0]>Line+30||PingValues[0]<Line-30){
							PingValues[0]=Line;
						}
						if(PingValues[1]>200||PingValues[1]<5){
							PingValues[1]=100;
						}
						
						if(PingValues[0]>Line+3){
							//r.runMotor(RXTXRobot.MOTOR1, 0, RXTXRobot.MOTOR2, 0,0 );
							Changes=PingValues[0]-Line;
							Speed[1]=(int) (Speed[1]+(Changes*1.5));
							System.out.println("too far");
							System.out.println("Changes Are: "+Changes);
							System.out.println("new Speed left wheel is "+Speed[1]);
							//r.runMotor(RXTXRobot.MOTOR1, 0, RXTXRobot.MOTOR2, 0,0 );
							r.runMotor(r.MOTOR1, Speed[0], r.MOTOR2, Speed[1],0 );
							r.sleep(200);
							
							Speed[1]=(int) (Speed[1]+(Changes*2));
							//r.runMotor(r.MOTOR1, 0, r.MOTOR2, 0,0 );
							r.runMotor(r.MOTOR1, Speed[0], r.MOTOR2, Speed[1],0 );
							
						}
						if(PingValues[0]<Line-3){
							//r.runMotor(r.MOTOR1, 0, r.MOTOR2, 0,0 );
							Changes=95-PingValues[0];
							System.out.println("too close");
							Speed[0]=(int) (Speed[0]+(Changes*1.5));
							System.out.println("Changes Are: "+Changes);
							System.out.println("new Speed is "+Speed[0]);
							//r.runMotor(r.MOTOR1, 0, r.MOTOR2, 0,0 );
							r.runMotor(r.MOTOR1, Speed[0], r.MOTOR2, Speed[1],0 );
							r.sleep(200);
							
							Speed[0]=(int) (Speed[0]+(Changes*2));
							//r.runMotor(r.MOTOR1, 0, r.MOTOR2, 0,0 );
							r.runMotor(r.MOTOR1, Speed[0], r.MOTOR2, Speed[1],0 );
						}
					}
					System.out.println("Checked");
				}
				r.refreshAnalogPins();
				System.out.println(r.getAnalogPin(1).getValue());
			}
			
				public void checkForward(RXTXRobot r,int Seconds,int Line){
					r.refreshAnalogPins();
					int R=-100;
					int L=-100;
					int[] Speed={R,L};
					int[] PingValues;
					int totalTime=0;
					int Changes;
					while(Seconds>totalTime){
						Changes=0;
						Speed[0]=R;
						Speed[1]=L;
						r.refreshAnalogPins();
						r.runMotor(r.MOTOR1, Speed[0], r.MOTOR2, Speed[1],0 );
						PingValues=testDoublePing(r);
						if(PingValues[0]>Line+30||PingValues[0]<Line-30){
							PingValues[0]=Line;
						}
						if(PingValues[1]>200||PingValues[1]<5){
							PingValues[1]=100;
						}
						
						if(PingValues[0]>Line+3){
							//r.runMotor(RXTXRobot.MOTOR1, 0, RXTXRobot.MOTOR2, 0,0 );
							Changes=PingValues[0]-Line;
							Speed[1]=(int) (Speed[1]+(Changes*1.5));
							System.out.println("too far");
							System.out.println("Changes Are: "+Changes);
							System.out.println("new Speed left wheel is "+Speed[1]);
							//r.runMotor(RXTXRobot.MOTOR1, 0, RXTXRobot.MOTOR2, 0,0 );
							r.runMotor(r.MOTOR1, Speed[0], r.MOTOR2, Speed[1],0 );
							r.sleep(200);
							
							Speed[1]=(int) (Speed[1]+(Changes*2));
							//r.runMotor(r.MOTOR1, 0, r.MOTOR2, 0,0 );
							r.runMotor(r.MOTOR1, Speed[0], r.MOTOR2, Speed[1],0 );
							
						}
						if(PingValues[0]<Line-3){
							//r.runMotor(r.MOTOR1, 0, r.MOTOR2, 0,0 );
							Changes=95-PingValues[0];
							System.out.println("too close");
							Speed[0]=(int) (Speed[0]+(Changes*1.5));
							System.out.println("Changes Are: "+Changes);
							System.out.println("new Speed is "+Speed[0]);
							//r.runMotor(r.MOTOR1, 0, r.MOTOR2, 0,0 );
							r.runMotor(r.MOTOR1, Speed[0], r.MOTOR2, Speed[1],0 );
							r.sleep(200);
							
							Speed[0]=(int) (Speed[0]+(Changes*2));
							//r.runMotor(r.MOTOR1, 0, r.MOTOR2, 0,0 );
							r.runMotor(r.MOTOR1, Speed[0], r.MOTOR2, Speed[1],0 );
						}
						totalTime=totalTime+250;
						System.out.println("Checked");
					}
					r.runMotor(r.MOTOR1, 0, r.MOTOR2, 0,0 );
			}
}