package structural.adapter;

public class AdapterAdapteeWrapper implements Target {

	private Adaptee adaptee;
	
    public AdapterAdapteeWrapper (Adaptee adaptee) {
    	this.adaptee = adaptee;
    }

    @Override
	public void makeNoise() {
        adaptee.saySomething();
	}
	
}
