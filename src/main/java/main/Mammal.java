package main;

public abstract class Mammal extends Animal {

	private int amountOfFur;

	public Mammal() {
	}
	
	public Mammal(int noLegs, int noEyes, String sciName) {
		this.setNoOfLegs(noLegs);
		this.setNoOfEyes(noEyes);
		this.setSciName(sciName);
	}

	public void lactate() {
		System.out.println("Got milk?");
	}

	public int getAmountOfFur() {
		return amountOfFur;
	}

	public void setAmountOfFur(int amountOfFur) {
		this.amountOfFur = amountOfFur;
	}
}
