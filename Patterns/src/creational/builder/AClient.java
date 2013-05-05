package creational.builder;

public class AClient {
	

	public static void main(String[] args) {

		// This is the client!

        BuilderImpl builder = new BuilderImpl();
		Director director = new Director(builder);
		director.makeProduct();
		builder.getProduct();

    }

}
