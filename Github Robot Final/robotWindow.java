import java.awt.*;

import javax.swing.*;

import rxtxrobot.RXTXRobot;

import java.awt.event.*;
import java.io.*;


	
	
public class robotWindow extends JFrame {
		
		//declares all our panels and buttons etc.
		private JPanel movementPanel;
		private JPanel sensorPanel;
		private JButton Up;
		private JButton Down;
		private JButton Left;
		private JButton Right;
		private JButton Water;
		private JButton Salinity;
		private JButton Turbidity;
		private JButton Forward;
		private JButton Backward;
		private JButton Run;
		private JTextField Timefield;
		
		public robotWindow(final RXTXRobot r){
		setLayout(new BorderLayout(3,2));
		
		movementPanel= new JPanel();
		sensorPanel= new JPanel();
		movementPanel.setLayout(new FlowLayout(FlowLayout.LEFT,10,20));
		sensorPanel.setLayout(new FlowLayout(FlowLayout.LEFT,10,20));
		movementPanel.setPreferredSize(new Dimension(100,50));
		sensorPanel.setPreferredSize(new Dimension(100,50));
		//instantiates panels and sets their defaults
		
		Up=new JButton("UP");
		Down=new JButton("DOWN");
		Left=new JButton("LEFT");
		Right=new JButton("RIGHT");
		Forward=new JButton("FORWARD");
		Backward=new JButton("BACKWARD");
		Water=new JButton("TEST ALL");
		Salinity=new JButton("TEST SALT");
		Turbidity=new JButton("TEST TURB.");
		Run=new JButton("Lola's Folly");
		//instantiates buttons and gives them labels
		
		Timefield=new JTextField("Time?",25);
		String Timestring = "-1";
		final int Time=Integer.valueOf(Timestring);
		//instantiates textfield for Time imput and converts string input
		//to final integer, final b/c final required for threaded action listener 
		
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
		//instantiates calls to all out methods, final b/c final required for threaded action listener 
		
		
		 Up.addActionListener(new ActionListener() {//action listener for the button listens
	         public void actionPerformed(ActionEvent e) {//for action event, when the button is pressed
	            goUp.Up(r,Time);//and calls the appropriate method
	         }          
	      });
		 //repeated below for all others
		Down.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {goDown.Down(r,Time); } });
		Left.addActionListener(new ActionListener() {
		    public void actionPerformed(ActionEvent e) {turnLeft.Left(r,Time); } });
		Right.addActionListener(new ActionListener() {
		    public void actionPerformed(ActionEvent e) {turnRight.Right(r,Time); } });
		Forward.addActionListener(new ActionListener() {
		    public void actionPerformed(ActionEvent e) {moveForward.Forward(r,Time); } });
		Backward.addActionListener(new ActionListener() {
		    public void actionPerformed(ActionEvent e) {moveBackward.Backward(r,Time); } });
		Water.addActionListener(new ActionListener() {
		    public void actionPerformed(ActionEvent e) {testWater.waterTests(r); } });
		Salinity.addActionListener(new ActionListener() {
		    public void actionPerformed(ActionEvent e) {testSalinity.salinityTest(r); } });
		Turbidity.addActionListener(new ActionListener() {
		    public void actionPerformed(ActionEvent e) {testTurbidity.turbidityTest(r); } });
		Run.addActionListener(new ActionListener() {
		    public void actionPerformed(ActionEvent e) {LolasFolly.FULLRUN(r); } });	
		
		
		movementPanel.add(Up);
		movementPanel.add(Down);
		movementPanel.add(Left);
		movementPanel.add(Right);
		movementPanel.add(Forward);
		movementPanel.add(Backward);
		sensorPanel.add(Water);
		sensorPanel.add(Salinity);
		sensorPanel.add(Turbidity);
		sensorPanel.add(Run);
		sensorPanel.add(Timefield);
		add(movementPanel, BorderLayout.WEST);
		add(sensorPanel, BorderLayout.EAST);
		//adds all our elements to the panels and the panels to the window
		
		
		r.close();//closes connection at end
		}

	
	}

