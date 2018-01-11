package counter;

public class DownCounter {
	
	int counter = 0;
	
	public DownCounter(int initCounter) {
		counter = initCounter;
	}
	
	public boolean isFinished() {
		return counter == 0;
	}
	
	public void countDown() {
		if (! isFinished()) {
			counter = counter - 1;
		}
	}

	public static void main(String[] args) {
		DownCounter dc1 = new DownCounter(2);
		System.out.println(dc1.isFinished());
		dc1.countDown();
		System.out.println(dc1.isFinished());
		dc1.countDown();
		System.out.println(dc1.isFinished());
		dc1.countDown();
		System.out.println(dc1.isFinished());
		dc1.countDown();
		System.out.println(dc1.isFinished());
		dc1.countDown();
	}
}
