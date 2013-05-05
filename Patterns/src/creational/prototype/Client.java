package creational.prototype;

public class Client {
	
	public Client(Animal animal) {
		
		Animal newAnimal = animal.createCopy();
		
		System.out.println(animal);
		System.out.println(newAnimal);
		
	}
	
	public static void main(String[] args) {
		
		Sheep sheep = new Sheep("Flossy");
		
		Client client = new Client(sheep);

		Dog dog = new Dog("Bonzo");
		
		Client client2 = new Client(dog);

	}

}
