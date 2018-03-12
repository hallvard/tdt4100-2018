package iterators;

import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;

public class SummingIterator implements Iterator<Double> {

	private Iterator<Double> it1;
	private Iterator<Double> it2;

	public SummingIterator(Iterator<Double> it1, Iterator<Double> it2) {
		this.it1 = it1;
		this.it2 = it2;
	}
	
	@Override
	public boolean hasNext() {
		return it1.hasNext() && it2.hasNext();
	}

	// hvordan generalisere denne til å ta inn den matematiske operasjonen?
	@Override
	public Double next() {
		Double num1 = it1.next(), num2 = it2.next();
		return num1 + num2;
	}
	
	public static void main(String[] args) {
		Collection<Double> nums1 = Arrays.asList(1.0, 2.1, 3.2); 
		Collection<Double> nums2 = Arrays.asList(2.0, 3.1, 4.2);
		Iterator<Double> it = new SummingIterator(nums1.iterator(), nums2.iterator());
		Iterator<Double> it2 = new SummingIterator(it, nums2.iterator());
		while (it2.hasNext()) {
			System.out.println(it2.next());
		}
	}
}
