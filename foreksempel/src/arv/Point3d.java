package arv;

public class Point3d extends Point2d {

	public final double z;

	public Point3d(final double x, final double y, final double z) {
		super(x, y);
		this.z = z;
	}

	@Override
	public boolean equals(final Object obj) {
		if (! super.equals(obj)) {
			return false;
		}
		return this.z == ((Point3d) obj).z;
	}
}
