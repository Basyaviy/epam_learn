package by.epam.learn.advanced;

import by.epam.learn.advanced.impl.RectangleGeneric;
import by.epam.learn.advanced.impl.TriangleGeneric;
import by.epam.learn.entity.Rectangle;
import by.epam.learn.entity.RightTriangle;

public class GenericMain {
	public static void main(String[] args) {
		Rectangle rectangle = new Rectangle(2, 5);
		ShapeGeneric<Rectangle> rectangleGeneric = new RectangleGeneric();
		RightTriangle triangle = new RightTriangle(3, 4);
		ShapeGeneric<RightTriangle> triangleGeneric = new TriangleGeneric();
		System.out.println("Square rectangle: " + rectangleGeneric.computeSquare(rectangle));
		System.out.println("Perimeter rectangle: " + rectangleGeneric.computePerimeter(rectangle));
		System.out.println("Square triangle: " + triangleGeneric.computeSquare(triangle));
		System.out.println("Perimeter triangle: " + triangleGeneric.computePerimeter(triangle));
// triangleGeneric.computePerimeter(rectangle); // compile error
	}
}
