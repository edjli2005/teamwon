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
		private JLabel Out;
		
		public robotWindow(final RXTXRobot r){
		setLayout(new BorderLayout(3,2));
		
		movementPanel= new JPanel();
		sensorPanel= new JPanel();
		movementPanel.setLayout(new FlowLayout(FlowLayout.LEFT,10,20));
		sensorPanel.setLayout(new FlowLayout(FlowLayout.LEFT,10,20));
		movementPanel.setPreferredSize(new Dimension(200,100));
		sensorPanel.setPreferredSize(new Dimension(200,100));
		movementPanel.setBackground(Color.magenta);
		sensorPanel.setBackground(Color.cyan);
		//instantiates panels and sets their defaults
		
		//instead of instantiating this all here, wehy don't we instatiate
		//it when the variabls are declared so the code is more condenced?
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
		Out=new JLabel("<html>Hello, my name is Lola.<br />What do you want Human?<html>");
		
		//instantiates buttons and gives them labels
		
		Timefield=new JTextField(10);
		
		//instantiates textfield for Time imput  
		
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
		sensorPanel.add(Out);
		
		add(movementPanel, BorderLayout.WEST);
		add(sensorPanel, BorderLayout.EAST);
		//adds all our elements to the panels and the panels to the window
		
		
		//r.close();//closes connection at end
		}

	
	}

