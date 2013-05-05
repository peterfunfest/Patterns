package creational.factorymethod;

public class ProductFactoryA extends ProductFactory {

	@Override
	public Product createProduct() {
		return new ProductA();
	}

}
