
public class House {
	private Window window;
	
	public House() {
		// ������� ����������
		//window = new Window();
		
		// ������ ����������
		window  = new PlasticWindow();
		// ���
		// window = new WoodFrameWindow();

		// ������������ IoC
	}
	
	public void view() {
		window.open();
		
	}
	
	public static void main(String[] args) {
		new House().view();
	}
	
}
