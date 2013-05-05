package creational.factorymethod;

public class ProductFactoryB extends ProductFactory {

	@Override
	public Product createProduct() {
		return new ProductB();
	}

}
