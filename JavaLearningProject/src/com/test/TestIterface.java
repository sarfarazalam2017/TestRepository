package com.test;

public class TestIterface {

	public static void main(String[] args) {
		Room r;
		r=new Room1();
		r.sofa();
		r.Kitchen();
		r.fan();
		r.ac();
		
		r=new Room2();
		r.ac();
	}

}
