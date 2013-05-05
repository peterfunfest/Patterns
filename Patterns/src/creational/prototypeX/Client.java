package creational.prototypeX;

public class Client {
	
	public static void main(String[] args) {
		
		Sheep sheep = new Sheep("flossy");
		
		sheep.sayHello();
		
		Sheep sheep2 = sheep.createCopy();
		
		sheep2.sayHello();
		
	}

}
