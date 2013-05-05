package structural.decorator;

public class Client {
	
	public static void main(String[] argrs) {
		
		Window theWindow = new StandardWindow("W1");
		
		//theWindow --> StandardWindow
		
		theWindow.move();
		
		System.out.println(theWindow.getClass().getName());

		theWindow = new ScrollBarWindow(theWindow);

		//theWindow --> ScrollBarWindow --> StandardWindow

		theWindow.move();

		((ScrollBarWindow)theWindow).moveScrollBar();
		
		System.out.println(theWindow.getClass().getName());

	}

}
