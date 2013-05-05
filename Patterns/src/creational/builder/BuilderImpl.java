package creational.builder;

public class BuilderImpl implements Builder {

	private Product product;
	
	public BuilderImpl() {
		this.product = new Product();
	}
	
	@Override
	public void createPartA() {
		product.setPartA(new PartA());
	}

	@Override
	public void createPartB() {
		product.setPartB(new PartB());
	}

	@Override
	public void createPartC() {
		product.setPartC(new PartC());
	}
	
	public Product getProduct() {
		return this.product;
	}

}
