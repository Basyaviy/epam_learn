package by.epam.learn.inheritance.quiz;

public class TestAction {
	public int checkTest(AbstractQuest[] test) {
		int counter = 0;
		for (AbstractQuest s : test) {
// вызов полиморфного метода
			counter = s.check(new Answer()) ? ++counter : counter;
		}
		return counter;
	}
}