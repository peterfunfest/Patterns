package creational.prototypeX;

public class Sheep implements Cloneable {

	public String name = "John Doe";

	public Sheep(String name) {
		System.out.println("a sheep called " + name + " has been created");
		this.name = name;
	}

	public void sayHello() {
		System.out.println(this.name + " says bah!");
	}

	public Sheep createCopy() {
		Sheep newSheep = null;
		try {
			newSheep = (Sheep) this.clone();
		} catch (CloneNotSupportedException e) {
			throw new RuntimeException("Cannot clone a new sheep.",e);
		}
		return newSheep;
	}

}
