package by.epam.learn.advanced;

import by.epam.learn.advanced.impl.RectangleAction;
import by.epam.learn.advanced.impl.TriangleAction;
import by.epam.learn.entity.Rectangle;
import by.epam.learn.entity.RightTriangle;

public class ActionMain {
	public static void main(String[] args) {
		ShapeAction action;
		try {
			Rectangle rectShape = new Rectangle(2, 5);
			action = new RectangleAction();
			System.out.println("Square rectangle: " + action.computeSquare(rectShape));
			System.out.println("Perimeter rectangle: " + action.computePerimeter(rectShape));
			RightTriangle trShape = new RightTriangle(3, 4);
			action = new TriangleAction();
			System.out.println("Square triangle: " + action.computeSquare(trShape));
			System.out.println("Perimeter triangle: " + action.computePerimeter(trShape));
			action.computePerimeter(rectShape); // runtime exception
		} catch (IllegalArgumentException e) {
			System.err.println(e.getMessage());
		}

		System.out.println("end.");
		System.out.println("end.");

	}
}