package structural.adapter;

public class Client {

	private Target target;

	public Client(Target target) {
       	this.target = target;
    }

	public void doStuff() {
        target.makeNoise();
	}

    public static void main(String[] args) {

    	// The Client needs a Target type.
        // Need an adapter for the client to be able to use the Adaptee.

//    	Target adapter = new AdapterAdapteeSubclass();
		Target adapter = new AdapterAdapteeWrapper(new Adaptee());

		Client client = new Client(adapter);

		client.doStuff();

    }

}
