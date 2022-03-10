package by.epam.learn.inheritance.quiz;

import java.util.Random;

public class DragnDropQuest extends AbstractQuest {
// constructors, methods
	@Override
	public boolean check(Answer answer) {
		boolean bool = new Random().nextBoolean();
		System.out.println("DragnDropQuest: "+ bool);
		return bool;
	}
}