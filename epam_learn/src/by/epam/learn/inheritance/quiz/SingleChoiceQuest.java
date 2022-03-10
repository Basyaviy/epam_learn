package by.epam.learn.inheritance.quiz;

import java.util.Random;

public class SingleChoiceQuest extends AbstractQuest {
// constructors, methods
	@Override
	public boolean check(Answer answer) {
		boolean bool = new Random().nextBoolean();
		System.out.println("SingleChoiceQuest: "+ bool);
		return bool;
	}
}