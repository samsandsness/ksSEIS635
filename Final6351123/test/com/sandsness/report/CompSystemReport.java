package com.sandsness.report;

import java.util.List;

public class CompSystemReport
{
	private String processorDescription;
	private String processorRating;
	private List<String> processorList;
	
	private String hardDriveDescription;
	private String hardDriveRating;
	private List<String> hardDriveList;
	
	private String memoryDescription;
	private String memoryRating;
	private List<String> memoryList;
	
	
	
	//Getters and Setters
	public String getProcessorDescription()
	{
		return processorDescription;
	}
	public void setProcessorDescription(String processorDescription)
	{
		this.processorDescription = processorDescription;
	}
	public String getProcessorRating()
	{
		return processorRating;
	}
	public void setProcessorRating(String processorRating)
	{
		this.processorRating = processorRating;
	}
	public List<String> getProcessorList()
	{
		return processorList;
	}
	public void setProcessorList(List<String> processorList)
	{
		this.processorList = processorList;
	}
	public String getHardDriveDescription()
	{
		return hardDriveDescription;
	}
	public void setHardDriveDescription(String hardDriveDescription)
	{
		this.hardDriveDescription = hardDriveDescription;
	}
	public String getHardDriveRating()
	{
		return hardDriveRating;
	}
	public void setHardDriveRating(String hardDriveRating)
	{
		this.hardDriveRating = hardDriveRating;
	}
	public List<String> getHardDriveList()
	{
		return hardDriveList;
	}
	public void setHardDriveList(List<String> hardDriveList)
	{
		this.hardDriveList = hardDriveList;
	}
	public String getMemoryDescription()
	{
		return memoryDescription;
	}
	public void setMemoryDescription(String memoryDescription)
	{
		this.memoryDescription = memoryDescription;
	}
	public String getMemoryRating()
	{
		return memoryRating;
	}
	public void setMemoryRating(String memoryRating)
	{
		this.memoryRating = memoryRating;
	}
	public List<String> getMemoryList()
	{
		return memoryList;
	}
	public void setMemoryList(List<String> memoryList)
	{
		this.memoryList = memoryList;
	}
	
	public void createReport()
	{
		System.out.print("Your processor is/n" +
	"more stuff/n");
	}
	/*

Your processor is
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
