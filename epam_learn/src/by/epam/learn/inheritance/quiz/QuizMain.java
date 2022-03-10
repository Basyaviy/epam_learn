package by.epam.learn.inheritance.quiz;

public class QuizMain {
	public static void main(String[] args) {
		TestGenerator generator = new TestGenerator();
		AbstractQuest[] test = generator.generateTest(60, 2); // 60 questions of 2 types
// here should be the code of the test process …
		TestAction action = new TestAction();
		int result = action.checkTest(test);
		System.out.println(result + " correct answers, " + (60 - result) + " incorrect");
	}
}