package com.sandsness.report;
import java.awt.*;

import javax.swing.*;

import backend.CompSystem;


public class Display
{
	static String temp = new String();
	JFrame display = new JFrame();
	JTextArea textArea = new JTextArea();
	CompSystem selectedSystem = new CompSystem();
	
	public Display (String label, String text)
	{
		
		display.setVisible(true);
		display.setSize(500,500);
		display.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		display.add(textArea);
//		textArea.setText("Hello this is the text string \n");
		temp = textArea.getText();
//		textArea.append("more");
	}
	
	public void printReport()
	{
		
		this.textArea.append(selectedSystem.getTestString());

	}





}
