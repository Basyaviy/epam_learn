package by.epam.learn.advanced;

import by.epam.learn.entity.AbstractShape;

public interface ShapeAction extends LineGroupAction {
	double computeSquare(AbstractShape shape);
}