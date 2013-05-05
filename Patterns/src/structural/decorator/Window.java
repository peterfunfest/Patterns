package structural.decorator;

public interface Window {

	public void close();
	
	public void resize();
	
	public void move();

	public void minimise();
	
	public String getWindowId();

}
