package com.sandsness.report;
import java.awt.*;
import java.util.List;

import javax.swing.*;

import backend.CompSystem;
import backend.Component;
import backend.CompSystem.*;
import backend.Recommendation.*;


public class Display
{
	static String temp = new String();
	JFrame display = new JFrame();
	static JTextArea textArea = new JTextArea();
	List<Component>selectedParts;
	Component selectedProcessor;
	Component selectedHardDrive;
	Component selectedMemory;
//	CompSystem selectedSystem = new CompSystem();
//	Recommendation recParts = new Recommendation();
	
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
	
	public static void addText(String newText)
	{
		textArea.append(newText);
	}
	
	
	public void printReport()
	{
		//ratings reported. Most of these are from the Recommendation class.
		selectedParts = CompSystem.getParts();
		addText("" + selectedParts.size());
		selectedProcessor = selectedParts.get(0);
		selectedHardDrive = selectedParts.get(1);
		
		//getting values for memory is throwing an exception.
//		selectedMemory = selectedParts.get(2);
//		
//		
//		addText(selectedMemory.getDescription());
//		addText("" + (selectedMemory.getRating()));

//		addText(selectedSystem.getTestString() + "\n");
		
		//print out processor selected information
		addText("\nYour processor is ");
		addText(selectedProcessor.getDescription());
		addText("\nYour processor has ");
		addText("" + (selectedProcessor.getRating()));
		addText("overall rating on 0 to 100 scale\n");
		addText("Here are the processors you can use for upgrade:\n");
		//print out array list of processor descriptions from recommendation class
		
		
		//print out hard drive selected information
		addText("\nYour hard drive is ");
		addText(selectedHardDrive.getDescription());
		addText("\nYour hard drive has ");
		addText("" + (selectedHardDrive.getRating()));
		addText("overall rating on 0 to 100 scale\n");
		addText("Here are the hard drives you can use for upgrade:\n");
		//print out array list of hard drive descriptions from recommendation class
		
		//print out memory selected information
		addText("\nYour memory is ");
		//addText(memory description);
		addText("\nYour memory has ");
		//addText(memory rating);
		addText("overall rating on 0 to 100 scale\n");
		addText("Here are the memory options you can use for upgrade:\n");
		
		
		//overall rating. this is currently printing from the CompSystem class.
		addText("your overall system rating is: ");
		//addText(system rating value);
		addText("on 0 to 100 scale.\n");
		
		//original printed report.
		/*

		Your processor
		Intel Celeron P4500 @ 1.87GHz

		Your processor has 0.00 overall rating on 0 to 100 scale

		Here are the processors you can use for upgrade:

		Intel Celeron P4600 @ 2.00GHz
		Intel Core i7 L 620 @ 2.00GHz
		Intel Core i3 M 370 @ 2.40GHz
		Intel Core i3 M 380 @ 2.53GHz
		Intel Core i5 M 450 @ 2.40GHz
		Intel Core i7 Q 720 @ 1.60GHz
		Intel Core i7 Q 820 @ 1.73GHz 
		Intel Core i7 Q 840 @ 1.87GHz 
		Intel Core i7 920XM @ 2.00 GHz

		Your hard drive is
		Seagate Laptop Thin SSHD (500 GB, 5400 rpm, Hybrid, 7 mm)

		Your hard drive has 100.00 overall rating on 0 to 100 scale

		Here are the hard drives you can use for upgrade:



		Here are the memory modules you can use for upgrade:

		Kingston 99U5428-046.A00LF
		Corsair CMSO4GX3M1A1333C9
		G Skill Intl F3-10666CL9-4GBSQ
		Micron Technology 16KTF51264HZ-1G4M1
		Micron Technology 8KTF51264HZ-1G6E1
		Corsair CMSX8GX3M1A1600C1
		Micron Technology 16JTF1G64HZ-1G6D1
		Corsair CMSX4GX3M1A1600C9
		Corsair CMSO8GX3M1A1600C11
		Kingston KFYHV1-HYC

		Your overall system rating is 50.00
		 on 0 to 100 scale


			 */
			

	}





}
