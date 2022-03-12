package by.epam.learn.advanced.impl;

import by.epam.learn.advanced.ShapeGeneric;
import by.epam.learn.entity.RightTriangle;

public class TriangleGeneric implements ShapeGeneric<RightTriangle> {
	@Override
	public double computeSquare(RightTriangle shape) {
		return 0.5 * shape.getSideA() * shape.getSideB();
	}

	@Override
	public double computePerimeter(RightTriangle shape) {
		double a = shape.getSideA();
		double b = shape.getSideB();
		double perimeter = a + b + Math.hypot(a, b);
		return perimeter;
	}
}