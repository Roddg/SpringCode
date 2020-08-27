
public class House {
	private Window window;
	
	public House() {
		// сильная свзанность
		//window = new Window();
		
		// слабая свзанность
		window  = new PlasticWindow();
		// или
		// window = new WoodFrameWindow();

		// противоречит IoC
	}
	
	public void view() {
		window.open();
		
	}
	
	public static void main(String[] args) {
		new House().view();
	}
	
}
