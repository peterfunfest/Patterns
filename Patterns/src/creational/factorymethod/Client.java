package creational.factorymethod;

public class Client {

	public Client(ProductFactory pf) {
		Product p = pf.createProduct();
		System.out.println(p.getTypeDescription());
	}

	public static void main(String[] args) {

		ProductFactory pf = new ProductFactoryA();
		Client client = new Client(pf);

	}

}
