package com.javaLesson.home;

public class Main {

	public static void main(String[] args) {

		Kawasaki aquib = new Kawasaki(false,true,"yes!near home.","Yes!Sports bar.");
		
		Kawasaki safkat = aquib.clone();

		
		System.out.print(aquib.toString());
		System.out.print(safkat.equals(aquib));
		
		
	}


}
