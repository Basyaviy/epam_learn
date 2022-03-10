package by.epam.learn.inheritance.quiz;

import java.util.Random;

public class TestGenerator {
	public AbstractQuest[] generateTest(final int NUMBER_QUESTS, int maxMode) {
		AbstractQuest[] test = new AbstractQuest[NUMBER_QUESTS];
		for (int i = 0; i < test.length; i++) {
			int mode = new Random().nextInt(maxMode); // stub
			System.out.println("===>mode: "+mode);
			test[i] = QuestFactory.getQuestFromFactory(mode);
		}
		return test;
	}
}