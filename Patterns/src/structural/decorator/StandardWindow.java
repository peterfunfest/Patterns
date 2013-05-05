package structural.decorator;

public class StandardWindow implements Window {
	
    private String windowId;

    StandardWindow (String windowId) {
		this.windowId = windowId;
	}

	@Override
	public void close() {
		System.out.println("Window "+windowId+" has been closed");
	}

	@Override
	public void resize() {
		System.out.println("Window "+windowId+" has been resized");
	}

	@Override
	public void move() {
		System.out.println("Window "+windowId+" has been moved");
	}

	@Override
	public void minimise() {
		System.out.println("Window "+windowId+" has been minimised");
	}

	@Override
	public String getWindowId() {
		return windowId;
	}

   
}
