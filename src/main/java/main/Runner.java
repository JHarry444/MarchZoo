package main;

import java.util.ArrayList;
import java.util.List;

public class Runner {

	public static void main(String[] args) {
		Dog dog = new Dog();
		Mammal mam = dog;
		Animal an = mam;
		Object o = an;

		List<Animal> zoo = new ArrayList<Animal>();

		zoo.add(an);
		zoo.add(mam);
		zoo.add(dog);
		zoo.add(new Cat());

		for (Animal a : zoo) {
			a.move();
			((Mammal) a).die();
			if (a instanceof Dog) {
				((Dog) a).fetch();
			}
		}

	}

}
