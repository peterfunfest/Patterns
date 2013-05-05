package creational.abstractfactory;

public class Client {

    private ProductA productA;
    private ProductB productB;
    private ProductC productC;

    public Client(ProductFactory pf) {

	       this.productA = pf.createProductA();
	       this.productB = pf.createProductB();
	       this.productC = pf.createProductC();
	       
	}
	
	public void showProducts() {
		
	       System.out.println(productA.getProductADescription());
	       System.out.println(productB.getProductBDescription());
	       System.out.println(productC.getProductCDescription());

	}

	public static void main(String[] args) {

		Client client = new Client(new ProductFactoryConfig1());
		
		client.showProducts();

		Client client2 = new Client(new ProductFactoryConfig2());

		client2.showProducts();

	}

}
