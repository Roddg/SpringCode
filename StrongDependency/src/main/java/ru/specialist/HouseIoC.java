
public class HouseIoC {
	private Window window;
	
	public HouseIoC(Window window) {
		this.window = window;
	}
	
	public void view() {
		window.open();
		
	}
}
