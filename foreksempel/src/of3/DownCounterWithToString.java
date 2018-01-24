package of3;

public class DownCounterWithToString {
	int counter = 0;
	public DownCounterWithToString(int initCounter) {
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
	
	@Override
	public String toString() {
		return "[DownCounter counter=" + counter + "]";
	}
	
	public static void main(String... args) {
		DownCounterWithToString dc = new DownCounterWithToString(10);
		System.out.println(dc);
	}
}