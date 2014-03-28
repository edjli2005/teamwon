import java.awt.*;

import javax.swing.*;

import rxtxrobot.*;

import java.awt.event.*;

import java.io.*;


	
	
public class robotWindow extends JFrame {
		
		//declares all our panels and buttons etc.
		private JPanel movementPanel = new JPanel();
		private JPanel sensorPanel = new JPanel();
		private JButton Up =new JButton("UP");
		private JButton Down =new JButton("DOWN");
		private JButton Left =new JButton("LEFT");
		private JButton Right =new JButton("RIGHT");
		private JButton Water =new JButton("TEST ALL");
		private JButton Salinity =new JButton("TEST SALT");
		private JButton Turbidity =new JButton("TEST TURB.");
		private JButton Forward =new JButton("FORWARD");
		private JButton Backward =new JButton("BACKWARD");
		private JButton Run =new JButton("Lola's Folly");
		private JTextField Timefield =new JTextField(10); //instatiates texfield for time input
		private JLabel Out =new JLabel("<html>Hello, my name is Lola.<br />What do you want Human?<html>");

		private JButton getPing=new JButton("Get Ping");
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
		
		public robotWindow(final RXTXRobot r){
		setLayout(new BorderLayout(3,2));
		
		
		movementPanel.setLayout(new GridLayout(6,2));
		sensorPanel.setLayout(new GridLayout(6,2));
		movementPanel.setPreferredSize(new Dimension(300,200));
		sensorPanel.setPreferredSize(new Dimension(300,200));
		movementPanel.setBackground(Color.magenta);
		sensorPanel.setBackground(Color.cyan);
		//instantiates panels and sets their defaults
		final double[] expectedPosition={60,40};
		
		final Forward moveForward= new Forward();
		final Backward moveBackward= new Backward();
		final Right turnRight= new Right();
		final Left turnLeft = new Left();
		final Up goUp=new Up();
		final Down goDown=new Down();
		final waterTests testWater= new waterTests();
		final salinityTest testSalinity = new salinityTest();
		final turbidityTest testTurbidity= new turbidityTest();
		final FullRun LolasFolly= new FullRun();
		final getPing Ping=new getPing();
		final EForward FEncoded= new EForward();
		final EBackward BEncoded=new EBackward();
		final ELeft LEncoded=new ELeft();
		final ERight REncoded = new ERight();
		final Retrieve ballRetrieve = new Retrieve();
		final coverOpen ballCoverUp= new coverOpen();
		final coverClose ballCoverDown= new coverClose();
		final bridgeRun bridgeAttack= new bridgeRun();
		final testPosition corrector=new testPosition();
		final getPosition positionGetter=new getPosition();
		//instantiates calls to all out methods, final b/c final required for threaded action listener 
		
		
		 Up.addActionListener(new ActionListener() {//action listener for the button listens
	         public void actionPerformed(ActionEvent e) {//for action event, when the button is pressed
	        	 String Timestring = Timefield.getText();//converts string input to final integer, b/c final int req. for threaded action listener
	     		final int Time=Integer.valueOf(Timestring);
	        	 goUp.Up(r,Time);//and calls the appropriate method
	            Out.setText("Up Done");
	           
	         }          
	      });
		 //repeated below for all others
		Down.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {String Timestring = Timefield.getText(); final int Time=Integer.valueOf(Timestring); goDown.Down(r,Time); Out.setText("Down Done"); } });
		Left.addActionListener(new ActionListener() {
		    public void actionPerformed(ActionEvent e) {String Timestring = Timefield.getText(); final int Time=Integer.valueOf(Timestring); turnLeft.Left(r,Time); Out.setText("Left Done");} });
		Right.addActionListener(new ActionListener() {
		    public void actionPerformed(ActionEvent e) {String Timestring = Timefield.getText(); final int Time=Integer.valueOf(Timestring); turnRight.Right(r,Time); Out.setText("Right Done");} });
		Forward.addActionListener(new ActionListener() {
		    public void actionPerformed(ActionEvent e) {String Timestring = Timefield.getText(); final int Time=Integer.valueOf(Timestring); moveForward.Forward(r,Time); Out.setText("Forward Done");} });
		Backward.addActionListener(new ActionListener() {
		    public void actionPerformed(ActionEvent e) {String Timestring = Timefield.getText(); final int Time=Integer.valueOf(Timestring); moveBackward.Backward(r,Time); Out.setText("Backward Done");} });
		Water.addActionListener(new ActionListener() {
		    public void actionPerformed(ActionEvent e) {testWater.waterTests(r); Out.setText("Water Tests Done");} });
		Salinity.addActionListener(new ActionListener() {
		    public void actionPerformed(ActionEvent e) {testSalinity.salinityTest(r); Out.setText("Salt Test Done");} });
		Turbidity.addActionListener(new ActionListener() {
		    public void actionPerformed(ActionEvent e) {testTurbidity.turbidityTest(r); Out.setText("Turb. Test Done");} });
		Run.addActionListener(new ActionListener() {
		    public void actionPerformed(ActionEvent e) {LolasFolly.FULLRUN(r); Out.setText("Lola's Folly Done?");} });	
		getPing.addActionListener(new ActionListener() {
		    public void actionPerformed(ActionEvent e) {Ping.getPing(r); Out.setText("PING!!");} });	
		EForward.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {String Timestring = Timefield.getText(); final int Time=Integer.valueOf(Timestring); FEncoded.EForward(r,Time); Out.setText("EForward Done"); } });
		EBackward.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {String Timestring = Timefield.getText(); final int Time=Integer.valueOf(Timestring); BEncoded.EBackward(r,Time); Out.setText("EBackward Done"); } });
		ELeft.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {String Timestring = Timefield.getText(); final int Time=Integer.valueOf(Timestring); REncoded.ERight(r,Time); Out.setText("ELeft Done"); } });
		ERight.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {String Timestring = Timefield.getText(); final int Time=Integer.valueOf(Timestring); LEncoded.ELeft(r,Time); Out.setText("ERight Done"); } });		
		Retrieve.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {String Timestring = Timefield.getText(); final int Time=Integer.valueOf(Timestring); ballRetrieve.Retrieve(r, Time); Out.setText("Retrieve Done"); } });
		coverOpen.addActionListener(new ActionListener() {
		    public void actionPerformed(ActionEvent e) {ballCoverUp.coverOpen(r); Out.setText("Cover Opened");} });
		coverClose.addActionListener(new ActionListener() {
		    public void actionPerformed(ActionEvent e) {ballCoverDown.coverClose(r); Out.setText("Cover Closed");} });
		bridgeRun.addActionListener(new ActionListener() {
		    public void actionPerformed(ActionEvent e) {String Timestring = Timefield.getText(); final int Time=Integer.valueOf(Timestring); bridgeAttack.bridgeRun(r,Time); Out.setText("Bridge Bridged!");} });
		testPosition.addActionListener(new ActionListener() {
		    public void actionPerformed(ActionEvent e) {corrector.testPosition(r); Out.setText("Position Corrected!");} });
		getPosition.addActionListener(new ActionListener() {
		    public void actionPerformed(ActionEvent e) {positionGetter.getPosition(r,expectedPosition); Out.setText("Position Got!");} });
		
		
		movementPanel.add(Up);
		movementPanel.add(Down);
		movementPanel.add(Left);
		movementPanel.add(Right);
		movementPanel.add(Forward);
		movementPanel.add(Backward);
		sensorPanel.add(Water);
		sensorPanel.add(Salinity);
		sensorPanel.add(Turbidity);
		movementPanel.add(Run);
		sensorPanel.add(getPing);
		movementPanel.add(EForward);
		movementPanel.add(EBackward);
		movementPanel.add(ELeft);
		movementPanel.add(ERight);
		sensorPanel.add(Retrieve);
		sensorPanel.add(coverOpen);
		sensorPanel.add(coverClose);
		movementPanel.add(bridgeRun);
		movementPanel.add(testPosition);
		movementPanel.add(getPosition);
		sensorPanel.add(Timefield);
		sensorPanel.add(Out);
		
		add(movementPanel, BorderLayout.WEST);
		add(sensorPanel, BorderLayout.EAST);
		//adds all our elements to the panels and the panels to the window
		
		
		//r.close();//closes connection at end
		}

	
	}

