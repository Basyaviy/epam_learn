package by.epam.learn.inheritance.quiz;

public abstract class AbstractQuest {
	private long questId;
	private String content;

// constructors, methods
	public abstract boolean check(Answer answer);
}
