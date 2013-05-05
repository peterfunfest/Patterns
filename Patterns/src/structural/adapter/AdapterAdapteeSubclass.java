package structural.adapter;

public class AdapterAdapteeSubclass extends Adaptee implements Target {

	@Override
	public void makeNoise() {
        saySomething();
	}
	
}
