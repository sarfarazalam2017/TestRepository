package com.test;

public interface Home {
	void Kitchen();// compiler by default adds public abstract
	void fan();
	void ac();
	void sofa();
	void window();

}
abstract class Room implements Home
{
	public void sofa()
	{
		System.out.println("Sofa");
	}
	
	public void window()
	{
		System.out.println("Window");
	}
}

class Room1 extends Room{

	@Override
	public void Kitchen() {
		System.out.println("One Kitched");		
	}

	@Override
	public void fan() {
		System.out.println("One fan");		
	}

	@Override
	public void ac() {
		System.out.println("One AC");		
	}	
}

class Room2 extends Room
{
	@Override
	public void Kitchen() {
		System.out.println("Two Kitchen");		
	}

	@Override
	public void fan() {
		System.out.println("Two fan");		
	}

	@Override
	public void ac() {
		System.out.println("Two AC");		
	}	
}

