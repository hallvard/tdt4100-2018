package iterators;

import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.function.BinaryOperator;

public class BinaryOperatorIterator implements Iterator<Double> {

	private final Iterator<Double> it1;
	private final Iterator<Double> it2;

	public BinaryOperatorIterator(final BinaryOperator<Double> op, final Iterator<Double> it1, final Iterator<Double> it2) {
		this.op = op;
		this.it1 = it1;
		this.it2 = it2;
	}

	@Override
	public boolean hasNext() {
		return it1.hasNext() && it2.hasNext();
	}

	private final BinaryOperator<Double> op;

	// hvordan generalisere denne til å ta inn den matematiske operasjonen?
	@Override
	public Double next() {
		final Double num1 = it1.next(), num2 = it2.next();
		return op.apply(num1, num2);
	}

	public static double sum(final double n1, final double n2) {
		final double result = n1 + n2;
		return result;
	}

	public static void main(final String[] args) {
		final Collection<Double> nums1 = Arrays.asList(1.0, 2.1, 3.2);
		final Collection<Double> nums2 = Arrays.asList(2.0, 3.1, 4.2);
		final Iterator<Double> it = new BinaryOperatorIterator(BinaryOperatorIterator::sum, nums1.iterator(), nums2.iterator());
		final Iterator<Double> it1 = new BinaryOperatorIterator((n1, n2) -> BinaryOperatorIterator.sum(n1, n2), nums1.iterator(), nums2.iterator());
		final Iterator<Double> it2 = new BinaryOperatorIterator((num1, num2) -> num1 * num2, it, nums2.iterator());
		while (it2.hasNext()) {
			System.out.println(it2.next());
		}
	}
}
