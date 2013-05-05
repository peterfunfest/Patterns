package structural.decorator;

public class ScrollBarWindow extends WindowDecorator {

	public ScrollBarWindow(Window decoratedWindow) {
		super(decoratedWindow);
	}
	
	@Override
	public void close() {
		decoratedWindow.close();
	}

	@Override
	public void resize() {
		decoratedWindow.resize();
	}

	@Override
	public void move() {
		decoratedWindow.move();
	}

	@Override
	public void minimise() {
		decoratedWindow.minimise();
	}
	
	@Override
	public String getWindowId() {
		return decoratedWindow.getWindowId();
	}

	public void moveScrollBar() {
		System.out.println("Window " + getWindowId() + " has had its scrollbar moved");
	}

}
