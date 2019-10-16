package com.javaLesson.home;

public class Kawasaki extends house {

	private String familymart;
	private String bar;
	
	
	public Kawasaki(boolean kitchen, boolean bathroom, String familymart, String bar) {

		super(kitchen, bathroom);
		this.familymart=familymart;
		this.bar=bar;
		
	}

	public Kawasaki clone() {
	try {
		return (Kawasaki) super.clone();
	}catch(Exception e) {
		return null;
		//System.out.print("Somethingiswrong");
	}
	
	}
	
	public String toString(){
		return (" " + super.toString()+" "+familymart+" "+bar) ; 
	
	}


}