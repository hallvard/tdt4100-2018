package arv;

import java.util.Arrays;
import java.util.Collection;

public class Point2d {

	public final double x, y;

	public Point2d(final double x, final double y) {
		this.x = x;
		this.y = y;
	}

	@Override
	public boolean equals(final Object obj) {
		if (this.getClass() != obj.getClass()) {
			return false;
		}
		final Point2d other = (Point2d) obj;
		return this.x == other.x && this.y == other.y;
	}

	public static void main(final String[] args) {
		final Collection<Point2d> points = Arrays.asList(new Point2d(1, 2), new Point2d(3, 4));
		System.out.println(points.contains(new Point3d(1, 2, 3)));
	}
}
