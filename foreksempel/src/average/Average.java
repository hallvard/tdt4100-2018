package average;

public class Average {

	int valueCount = 0;
	double sum = 0;

	void acceptValue(double value) {
		valueCount = valueCount + 1;
		sum = sum + value;
	}
	
	double getAverage() {
		return sum / valueCount;
	}
	
	public static void main(String[] args) {
		Average av = new Average();
		av.acceptValue(2);
		av.acceptValue(5.5);
		System.out.println(av.getAverage());
	}
}
