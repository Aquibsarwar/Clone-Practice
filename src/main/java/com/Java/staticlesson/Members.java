package com.Java.staticlesson;

public class Members {
	private String first;
	private String last;
	private static int members = 0;
	
	public Members(String first, String last) {
		this.first = first;
		this.last = last;
		members++;
		System.out.println("members in the club: " +first +last +"  "+members);
	}
	
	public static void main(String[] args) {
		Members merber1 = new Members("Megan", "Fox");
		Members member2 = new Members("Linsey","Lohan");
	}
}
