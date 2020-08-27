
public class ProgramIoC {

	public static void main(String[] args) {
		// проблема - где взять окно
		// рещение dependency injection spring framework
		new HouseIoC(new WoodFrameWindow()).view();

	}

}
