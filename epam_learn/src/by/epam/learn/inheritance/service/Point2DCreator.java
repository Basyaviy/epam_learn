package by.epam.learn.inheritance.service;

import by.epam.learn.point.Point2D;
import java.util.Random;

public class Point2DCreator extends Point1DCreator {
	@Override
	public Point2D create() {
		System.out.println("log in Point2DCreator");
		Random random = new Random();
		return new Point2D(random.nextInt(10), random.nextInt(10));
	}
}