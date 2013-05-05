package creational.abstractfactory;


public class ProductFactoryConfig1 extends ProductFactory {

	@Override
	public ProductA createProductA() {
		return new ProductAVersion1();
	}

	@Override
	public ProductB createProductB() {
		return new ProductBVersion1();
	}

	@Override
	public ProductC createProductC() {
		return new ProductCVersion1();
	}

}
