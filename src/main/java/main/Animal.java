package main;

public abstract class Animal {

	private int noOfLegs;
	private int noOfEyes;
	private String sciName;

	public abstract void move();

	public void die() {
		System.out.println("bleh");
	}

	public int getNoOfLegs() {
		return noOfLegs;
	}

	public void setNoOfLegs(int noOfLegs) {
		this.noOfLegs = noOfLegs;
	}

	public int getNoOfEyes() {
		return noOfEyes;
	}

	public void setNoOfEyes(int noOfEyes) {
		this.noOfEyes = noOfEyes;
	}

	public String getSciName() {
		return sciName;
	}

	public void setSciName(String sciName) {
		this.sciName = sciName;
	}
}
