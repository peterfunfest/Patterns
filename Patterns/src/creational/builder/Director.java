package creational.builder;

public class Director {

	private Builder builder;
	
	public Director(Builder builder) {
		this.builder = builder;
	}
	
	public void makeProduct() {
		this.builder.createPartA();
		this.builder.createPartB();
		this.builder.createPartC();
	}

}
