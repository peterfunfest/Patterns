package creational.abstractfactory;


public class ProductFactoryConfig2 extends ProductFactory {

	@Override
	public ProductA createProductA() {
		return new ProductAVersion2();
	}

	@Override
	public ProductB createProductB() {
		return new ProductBVersion3();
	}

	@Override
	public ProductC createProductC() {
		return new ProductCVersion2();
	}

}
