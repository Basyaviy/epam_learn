package by.epam.learn.annotation;

import java.lang.annotation.Target;
import java.lang.annotation.ElementType;

@Target(ElementType.TYPE)
public @interface BaseAction {
	int level();

	String sqlRequest();
}