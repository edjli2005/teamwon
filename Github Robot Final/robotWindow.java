import java.awt.*;

import javax.swing.*;

import java.awt.event.*;
import java.io.*;


	
	
public class robotWindow extends JFrame implements ActionListener{
		
		
		private JPanel movementPanel;
		private JPanel sensorPanel;
		private JButton Up;
		private JButton Down;
		private JButton Left;
		private JButton Right;
		private JButton testWater;
		private JButton testSalinity;
		private JButton testTurbidity;
		private JButton Forward;
		private JButton Backward;
		
		public robotWindow(){
		setLayout(new BorderLayout(3,2));
		
		movementPanel= new JPanel();
		sensorPanel= new JPanel();
		movementPanel.setLayout(new FlowLayout(FlowLayout.LEFT,10,20));
		sensorPanel.setLayout(new FlowLayout(FlowLayout.LEFT,10,20));
		movementPanel.setPreferredSize(new Dimension(100,50));
		sensorPanel.setPreferredSize(new Dimension(100,50));
		Up=new JButton("UP");
		Down=new JButton("DOWN");
		Left=new JButton("LEFT");
		Right=new JButton("RIGHT");
		Forward=new JButton("FORWARD");
		Backward=new JButton("BACKWARD");
		testWater=new JButton("TEST ALL");
		testSalinity=new JButton("TEST SALT");
		testTurbidity=new JButton("TEST TURB.");
		Up.addActionListener(this);
		Down.addActionListener(this);
		Left.addActionListener(this);
		Right.addActionListener(this);
		Forward.addActionListener(this);
		Backward.addActionListener(this);
		testWater.addActionListener(this);
		testSalinity.addActionListener(this);
		testTurbidity.addActionListener(this);
		movementPanel.add(Up);
		movementPanel.add(Down);
		movementPanel.add(Left);
		movementPanel.add(Right);
		movementPanel.add(Forward);
		movementPanel.add(Backward);
		sensorPanel.add(testWater);
		sensorPanel.add(testSalinity);
		sensorPanel.add(testTurbidity);
		
		
		}
		

	public void actionPerformed(ActionEvent arg0) {
		
		
	}

}