package com.test;

public class TestConstructor1 {

	TestConstructor1()
	{
		//this(5);// If no parameters passed,will call self and it w
		System.out.println("Default Constructor");
		
		//Refer https://www.geeksforgeeks.org/this-reference-in-java/
	}
	
	TestConstructor1(int a)
	{
		super();
		System.out.println("Parametrize Constructor");
	}
	public static void main(String[] args) {
		//TestConstructor1 obj1=new TestConstructor1();
		//new TestConstructor1();
		TestConstructor1 obj2=new TestConstructor1(10);
		
		// For Super keyword refer
		// https://beginnersbook.com/2013/03/constructors-in-java/
	}

}
