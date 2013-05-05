package creational.prototype;

public class Dog implements Animal {

	public String name = "John Doe";

	public Dog(String name) {
		System.out.println("a dog called " + name + " has been created");
		this.name = name;
	}

	public void sayHello() {
		System.out.println(this.name + " says woof!");
	}

	public Dog createCopy() {
		Dog newDog = null;
		try {
			newDog = (Dog) this.clone();
		} catch (CloneNotSupportedException e) {
			throw new RuntimeException("Cannot clone a new dog.",e);
		}
		System.out.println("Just copied " + newDog.name);
		return newDog;
	}

}
