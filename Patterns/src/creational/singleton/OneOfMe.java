package creational.singleton;

public class OneOfMe {
	
	private static OneOfMe INSTANCE=null;

	private OneOfMe() {
	}

    public static OneOfMe getInstance() {
    	if (INSTANCE == null) {
    		INSTANCE=new OneOfMe();
    		System.out.println("Created OneOfMe");
    	} else {
    		System.out.println("Reused OneOfMe");
        }
    	return INSTANCE;
    }

}
