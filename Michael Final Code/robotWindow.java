import java.awt.*;

import javax.swing.*;

import rxtxrobot.*;

import java.awt.event.*;


	
	
public class robotWindow extends JFrame {
		
		//declares all our panels and buttons etc.
		private JPanel movementPanel = new JPanel();
		private JPanel sensorPanel = new JPanel();
		private JPanel outputPanel=new JPanel();
		private JButton Up =new JButton("Up");
		private JButton Down =new JButton("Down");
		private JButton Left =new JButton("LEFT");
		private JButton Right =new JButton("RIGHT");
		private JButton Water =new JButton("TEST WATER");
		private JButton Salinity =new JButton("TEST SALT");
		private JButton Turbidity =new JButton("TEST TURB.");
		private JButton Forward =new JButton("FORWARD");
		private JButton Backward =new JButton("BACKWARD");
		Ping Ping = new Ping();
		private JTextField Timefield1 =new JTextField(10); //instatiates textfield for time input
		private JTextField Timefield2 =new JTextField(10); //instatiates textfield for time input
		private JTextField Timefield3 =new JTextField(10); //instatiates textfield for time input
		private JTextField Timefield4 =new JTextField(10); //instatiates textfield for time input
		private JLabel Out =new JLabel("<html>Hello, my name is Lola.<br />What do you want Human? <html>");
		private JButton setPingX=new JButton("Get Ping X");
		private JButton setPingY= new JButton("Get Ping Y");
		private JButton setPingAll=new JButton("Get Both Pings");
		private JButton EForward=new JButton("EForward");
		private JButton EBackward=new JButton("EBackward");
		private JButton ELeft=new JButton("ELeft");
		private JButton ERight=new JButton("ERight");
		private JButton Retrieve=new JButton("Retrieve");
		private JButton coverOpen=new JButton("Open Cover");
		private JButton coverClose=new JButton("Close Cover");
		private JButton bridgeRun=new JButton("Bridge");
		private JButton testPosition=new JButton("Position");
		private JButton getPosition=new JButton("Get Position");
		private JButton Uturn= new JButton("U-Turn");
		private JButton testBridge= new JButton("Test Bridge");
		private JButton Final = new JButton("Final");
		private JButton Bump=new JButton("Bump");
		private JButton IR= new JButton("Test IR");
		private JButton ColorTest=new JButton("Test Color");
		private JButton ballArm=new JButton("Ball Arm");
		private JButton getEPosition = new JButton ("EPosition");
		
		private JButton getCoordinates= new JButton("Get Coordinates");
		
		private JButton setCoordinates= new JButton("Set Coordinates");
		private JButton getTurbBall= new JButton("Get Turb Balls");
		private JButton setTurbBall=new JButton ("Set Turb Balls");
		private JButton getSaltBall= new JButton ("Get Salt Balls");
		private JButton setSaltBall= new JButton ("Set Salt Balls");
		
		private JButton testDoublePing= new JButton("Test Pings");	
		private JButton Automonous_Driver=new JButton("Auto Drive");
		
		public robotWindow(final RXTXRobot r){
		
			setLayout(new GridLayout(1,3));
		
		
			movementPanel.setLayout(new GridLayout(6,3));
			sensorPanel.setLayout(new GridLayout(6,3));
			outputPanel.setLayout(new BorderLayout(3,2));
			outputPanel.setPreferredSize(new Dimension(200,200));
			movementPanel.setPreferredSize(new Dimension(300,400));
			sensorPanel.setPreferredSize(new Dimension(300,400));
			
			movementPanel.setBackground(Color.cyan);
			sensorPanel.setBackground(Color.orange);
			outputPanel.setBackground(Color.lightGray);
			//instantiates panels and sets their defaults
			final int[] expectedPosition={60,40};
			
			final Forward moveForward= new Forward();
			final Backward moveBackward= new Backward();
			final Right turnRight= new Right();
			final Left turnLeft = new Left();
			final Up goUp=new Up();
			final Down goDown=new Down();
			final waterTests testWater= new waterTests();
			final salinityTest testSalinity = new salinityTest();
			final turbidityTest testTurbidity= new turbidityTest();
			
			final setPing PingX=new setPing();
			final setPing PingY=new setPing();
			final setPing setPing=new setPing();
			final EForward FEncoded= new EForward();
			final EBackward BEncoded=new EBackward();
			final ELeft LEncoded=new ELeft();
			final ERight REncoded = new ERight();
			final Retrieve ballRetrieve = new Retrieve();
			final coverOpen ballCoverUp= new coverOpen();
			final coverClose ballCoverDown= new coverClose();
			final bridgeRun bridgeAttack= new bridgeRun();
			final getPosition positionGetter=new getPosition();
			final testPosition corrector=new testPosition();
			final Uturn U=new Uturn();
			final testBridge findBridge=new testBridge();
			final Bump testBump = new Bump();
			final IR testIR= new IR();
			final ColorTest TestColor= new ColorTest();
			final ballArm getBall= new ballArm();
			final getEPosition EPosition = new getEPosition();
			final LolaObjectMichael Lola= new  LolaObjectMichael();
			final Final testFinal = new Final();
			
			final testDoublePing DoublePing=new testDoublePing();
			final Automonous_Driver DRIVE = new Automonous_Driver();
			//instantiates calls to all out methods, final b/c final required for threaded action listener 
			
		
			Up.addActionListener(new ActionListener() {//action listener for the button listens
				public void actionPerformed(ActionEvent e) {//for action event, when the button is pressed
					
					String Timestring = Timefield1.getText();//converts string input to final integer, b/c final int req. for threaded action listener
					final int Time=Integer.valueOf(Timestring);
					goUp.Up(r,Time);//and calls the appropriate method
					Out.setText("Up Done");
	           
				}          
			});
			//repeated below for all others
			Down.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {String Timestring = Timefield1.getText(); final int Time=Integer.valueOf(Timestring); goDown.Down(r,Time); Out.setText("Down Done"); } });
			Left.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {String Timestring = Timefield1.getText(); final int Time=Integer.valueOf(Timestring); turnLeft.Left(r,Time); Out.setText("Left Done");} });
			Right.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {String Timestring = Timefield1.getText(); final int Time=Integer.valueOf(Timestring); turnRight.Right(r,Time); Out.setText("Right Done");} });
			Forward.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {String Timestring = Timefield1.getText(); final int Time=Integer.valueOf(Timestring); moveForward.Forward(r,Time); Out.setText("Forward Done");} });
			Backward.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {String Timestring = Timefield1.getText(); final int Time=Integer.valueOf(Timestring); moveBackward.Backward(r,Time); Out.setText("Backward Done");} });
			Water.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {testWater.waterTests(r); Out.setText("Water Tests Done");} });
			Salinity.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {testSalinity.salinityTest(r); Out.setText("Salt Test Done");} });
			Turbidity.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {testTurbidity.turbidityTest(r); Out.setText("Turb. Test Done");} });
			setPingX.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {int returnPing=PingX.setPing(r,0); Out.setText("PING X is "+returnPing);} });	
			setPingY.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {int returnPing=PingY.setPing(r,1); Out.setText("PING Y is "+returnPing);} });
			setPingAll.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {final int[] returnPing=setPing.setPing(r, Lola); Out.setText("Ping X is "+ returnPing[0]+" and Ping Y is "+returnPing[1]);}});
			EForward.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {String Timestring = Timefield1.getText(); final int Time=Integer.valueOf(Timestring); FEncoded.EForward(r,Time); Out.setText("EForward Done"); } });
			EBackward.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {String Timestring = Timefield1.getText(); final int Time=Integer.valueOf(Timestring); BEncoded.EBackward(r,Time); Out.setText("EBackward Done"); } });
			ERight.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {if(Timefield1.getText().length()==0){String Confirm=REncoded.ERight(r); Out.setText(Confirm);}else{String Timestring = Timefield1.getText();final int Time=Integer.valueOf(Timestring);REncoded.ERight(r,Time);Out.setText("ERight Done");}}});
			ELeft.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {if(Timefield1.getText().length()==0){String Confirm=LEncoded.ELeft(r); Out.setText(Confirm);} else{String Timestring = Timefield1.getText(); final int Time=Integer.valueOf(Timestring); LEncoded.ELeft(r,Time); Out.setText("ELeft Done"); }} });		
			Retrieve.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {String Timestring = Timefield1.getText(); final int Time=Integer.valueOf(Timestring); ballRetrieve.Retrieve(r, Time); Out.setText("Retrieve Done"); } });
			coverOpen.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {ballCoverUp.coverOpen(r); Out.setText("Cover Opened");} });
			coverClose.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {ballCoverDown.coverClose(r); Out.setText("Cover Closed");} });
			bridgeRun.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {bridgeAttack.bridgeRun(r); Out.setText("Bridge Bridged!");} });
			testPosition.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {String posX = Timefield1.getText(); final int inputX=Integer.valueOf(posX);String posY = Timefield1.getText(); final int inputY=Integer.valueOf(posY);final int[] expectedPosition={inputX,inputY}; corrector.testPosition(r, expectedPosition, Lola); Out.setText("Position Corrected!");} });
			getPosition.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {String posX = Timefield1.getText(); final int inputX=Integer.valueOf(posX);String posY = Timefield1.getText(); final int inputY=Integer.valueOf(posY);int[] expectedPosition={inputX,inputY,0,0};expectedPosition=positionGetter.getPosition(r,expectedPosition, Lola); Out.setText("Position Got! Coordinates [ "+ expectedPosition[2]+", "+expectedPosition[3]+"]!");} });
			Uturn.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) { U.Uturn(r); Out.setText("OTHER WAY OTHER WAY!!");} });	
			testBridge.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {findBridge.testBridge(r); Out.setText("Found it.");} });
			Bump.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {testBump.Bump(r); Out.setText("BUMP!!");} });
			IR.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {testIR.IR(r); Out.setText("IR DUDES!!");} });
			ColorTest.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {TestColor.ColorTest(r); Out.setText("SEPIA FTW!!");} });
			ballArm.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {String Timestring = Timefield1.getText(); final int Time=Integer.valueOf(Timestring);getBall.ballArm(r,Time); Out.setText("Ouch!!");} });
			Final.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {String First = Timefield1.getText();String Second = Timefield2.getText();String Third = Timefield3.getText();String Fourth = Timefield4.getText();
				final int Points1=Integer.valueOf(First);final int Points2=Integer.valueOf(Second);final int Points3=Integer.valueOf(Third);final int Points4=Integer.valueOf(Fourth);testFinal.Final(r,Points1,Points2,Points3,Points4); Out.setText("FINALLY!!");} });
			//Pulls input from all four boxes, each one being the value of the dispensers. The code pretty much accepts input the same as the other methods four times.
			
			getCoordinates.addActionListener(new ActionListener(){
				 public void actionPerformed(ActionEvent e){int [] Coordinates=Lola.getCoordinates();Out.setText("Coordinates are ["+ Coordinates[0]+","+ Coordinates[1]+"]"); }});
			getTurbBall.addActionListener(new ActionListener(){
				 public void actionPerformed(ActionEvent e){int turbBall=Lola.getTurbBall();Out.setText("Turbidity Balls: "+ turbBall);}});
			getSaltBall.addActionListener(new ActionListener(){
				 public void actionPerformed(ActionEvent e){int saltBall=Lola.getSaltBall();Out.setText("Salinity Balls: "+ saltBall);}});
			setCoordinates.addActionListener(new ActionListener(){
				public void actionPerformed(ActionEvent e){String First = Timefield1.getText();String Second = Timefield2.getText();
				final int X=Integer.valueOf(First);final int Y=Integer.valueOf(Second);String Confirm=Lola.setCoordinates(X,Y);Out.setText(Confirm);}});
			setSaltBall.addActionListener(new ActionListener(){
				public void actionPerformed(ActionEvent e){String First = Timefield1.getText();final int Salt=Integer.valueOf(First);String Confirm=Lola.setSaltBall(Salt);Out.setText(Confirm);}});
			setTurbBall.addActionListener(new ActionListener(){
				public void actionPerformed(ActionEvent e){String First = Timefield1.getText();final int Turb=Integer.valueOf(First);String Confirm=Lola.setTurbBall(Turb);Out.setText(Confirm);}});
			getEPosition.addActionListener(new ActionListener(){
				 public void actionPerformed(ActionEvent e){int [] Position=EPosition.getEPosition(r);Out.setText("Coordinates are ["+ Position[0]+","+ Position[1]+"]"); }});
			
			testDoublePing.addActionListener(new ActionListener(){
				 public void actionPerformed(ActionEvent e){int [] Position=Ping.testDoublePing(r);Out.setText("Coordinates are ["+ Position[0]+","+ Position[1]+"]"); }});
			Automonous_Driver.addActionListener(new ActionListener(){
				 public void actionPerformed(ActionEvent e){String First = Timefield1.getText();String Second = Timefield2.getText();String Third = Timefield3.getText();String Fourth = Timefield4.getText();
					final int Points1=Integer.valueOf(First);final int Points2=Integer.valueOf(Second);final int Points3=Integer.valueOf(Third);final int Points4=Integer.valueOf(Fourth);String Position=DRIVE.Automonous_Driver(r, Lola,Points1,Points2,Points3,Points4);Out.setText(Position); }});
			
			movementPanel.add(Up);
			movementPanel.add(Down);
			//movementPanel.add(Left);
			//movementPanel.add(Right);
			movementPanel.add(Forward);
			//movementPanel.add(Backward);
			sensorPanel.add(Water);
			//sensorPanel.add(Salinity);
			//sensorPanel.add(Turbidity);
			//sensorPanel.add(setPingX);
			//sensorPanel.add(setPingY);
			//sensorPanel.add(setPingAll);
			movementPanel.add(EForward);
			movementPanel.add(EBackward);
			movementPanel.add(ELeft);
			movementPanel.add(ERight);
			sensorPanel.add(Retrieve);
			//sensorPanel.add(testBridge);
			sensorPanel.add(coverOpen);
			sensorPanel.add(coverClose);
			//movementPanel.add(bridgeRun);
			movementPanel.add(Uturn);
			//movementPanel.add(testPosition);
			//movementPanel.add(getPosition);
			movementPanel.add(testDoublePing);
			movementPanel.add(getEPosition);	
			
			movementPanel.add(Final);
			sensorPanel.add(Bump);
			sensorPanel.add(IR);
			sensorPanel.add(ColorTest);
			sensorPanel.add(ballArm);
			//movementPanel.add(getCoordinates);
			//sensorPanel.add(setCoordinates);
			sensorPanel.add(setSaltBall);
			sensorPanel.add(setTurbBall);
			movementPanel.add(getSaltBall);
			movementPanel.add(getTurbBall);
			sensorPanel.add(Automonous_Driver);
			sensorPanel.add(Timefield1);
			sensorPanel.add(Timefield2);
			sensorPanel.add(Timefield3);
			sensorPanel.add(Timefield4);

			outputPanel.add(Out, BorderLayout.SOUTH);
		
		
			add(movementPanel);
			add(outputPanel);
			add(sensorPanel);
			
			//adds all our elements to the panels and the panels to the window
		
			}

	
		}

