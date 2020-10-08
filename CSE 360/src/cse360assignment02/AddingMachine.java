package cse360assignment02;
/*
 *  Author: Peter Bugala
 */
public class AddingMachine 
{
	private int total;
	private String history;


	/*
	 *  Adding machine
	 */
	public AddingMachine () 
	{
		total = 0; 			//not needed - include for clarity
		history = "0";
	}
	
	/*
	 *  Get total
	 */
	public int getTotal () 
	{			
		return total;
	}
	
	/*
	 *  Add value to the total
	 *  Update history
	 */
	public void add (int value) 
	{	
		total = total + value;
		history = history + " + " + value;
	}
	
	/*
	 *  Subtract value from total
	 *  Update history
	 */
	public void subtract (int value) 
	{ 	
		total = total - value;
		history = history + " - " + value;
	}
	
	/*
	 *  toString
	 */
	public String toString () 
	{			
		return history;
	}
	
	/*
	 *  Clear method
	 */
	public void clear() 
	{	
		total = 0;
		history = "0";
	}
}