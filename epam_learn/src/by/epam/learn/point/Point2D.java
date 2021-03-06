package by.epam.learn.point;

public class Point2D extends Point1D {
	private int y;

	public Point2D(int x, int y) {
		super(x);
		this.y = y;
	}

	@Override
	public double length() {
		return Math.hypot(super.length(), y);
		/* just length() is impossible, because the method will call itself, which will
		lead to infinite recursion and an error at runtime */
	}

	@Override
	public String toString() {
		return super.toString() + " y=" + y;
	}
}