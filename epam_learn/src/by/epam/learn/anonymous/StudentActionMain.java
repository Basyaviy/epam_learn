package by.epam.learn.anonymous;


/**
 * Анонимным может быть не только интерфес но и обычный класс
 * Можно использовать локальные переменные метода в котором он создан
 * @author bas
 *
 */
public class StudentActionMain {
	public static void main(String[] args) {
		StudentAction action = new StudentAction();// usually object
		int base2 = 50;
		StudentAction actionAnon = new StudentAction() {// anonymous class object
			int base = 9; // invisible

			@Override
			public double defineScholarship(float averageMark) {
				double value = 100;
				if (averageMark > base) {
					value *= 1 + (base2 / 10.0);
				}
				return value;
			}
		};
		System.out.println(action.defineScholarship(9.05f));
		System.out.println(actionAnon.defineScholarship(9.05f));
	}
}