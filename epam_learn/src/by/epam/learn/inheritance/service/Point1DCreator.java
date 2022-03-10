package by.epam.learn.inheritance.service;

import by.epam.learn.point.Point1D;
import java.util.Random;

public class Point1DCreator {
	public Point1D create() {
		System.out.println("log in Point1DCreator");
		return new Point1D(new Random().nextInt(100));
	}
}