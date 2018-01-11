package average;

import java.util.Random;

import counter.DownCounter;

public class RandomAverage {
	
	DownCounter downCounter;
	Random random;
	Average average;

	double computeRandomAverage(int count) {
		downCounter = new DownCounter(count);
		random = new Random();
		average = new Average();
		while (! downCounter.isFinished()) {
			double value = random.nextDouble();
			System.out.println(value);
			average.acceptValue(value);
			downCounter.countDown();
		}
		return average.getAverage();
	}
	
	public static void main(String[] args) {
		RandomAverage randomAverage = new RandomAverage();
		System.out.println(randomAverage.computeRandomAverage(10));
	}
}
