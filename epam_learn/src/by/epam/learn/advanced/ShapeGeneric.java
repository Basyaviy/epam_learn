package by.epam.learn.advanced;

import by.epam.learn.entity.AbstractShape;

public interface ShapeGeneric<T extends AbstractShape> {
	double computeSquare(T shape);

	double computePerimeter(T shape);
}