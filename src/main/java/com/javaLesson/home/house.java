package com.javaLesson.home;

public class house {
	private boolean kitchen;
	private boolean bathroom;
	
	
	public house(boolean kitchen, boolean bathroom) {
		this.kitchen = kitchen;
		this.bathroom = bathroom;
	}
	

	public String toString()
	{
	 return ("Do you have a kitchen: "+kitchen+"!"+"Do you have a bathroom: "+ bathroom+"!");
	}

}
