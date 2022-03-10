package by.epam.learn.inheritance;

import by.epam.learn.inheritance.service.Point1DCreator;
import by.epam.learn.inheritance.service.Point2DCreator;
import by.epam.learn.point.Point1D;
import by.epam.learn.point.Point2D;

public class PointMain {
	public static void main(String[] args) {
		Point1DCreator creator1 = new Point2DCreator();
 //Point2D point = creator1.create(); // compile error
		creator1.create();
		Point1D pointA = creator1.create(); /* when compiling - overload,
											when running – overriding */
		System.out.println(pointA);
		Point2DCreator creator2 = new Point2DCreator();
		Point2D pointB = creator2.create();
		System.out.println(pointB);
	}
}