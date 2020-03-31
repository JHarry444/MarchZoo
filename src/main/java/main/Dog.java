package main;

public class Dog extends Mammal {

	public Dog() {
		super(4, 2, "Doggo");
	}

	public void fetch() {
		System.out.println("Good boy!");
	}

	@Override
	public void move() {
		System.out.println("Walkies");
	}

}
