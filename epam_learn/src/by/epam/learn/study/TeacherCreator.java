package by.epam.learn.study;

public class TeacherCreator {
	public static AbstractTeacher createTeacher(int id) {
		int value = 0;
// class declaration inside a method
		class Rector extends AbstractTeacher {
			Rector(int id) {
				super(id);
			}

			@Override
			public boolean remandStudent(Student student) {
// value++; compile error
				boolean result = false;
				if (student != null) {
// student status change code in the database
					result = true;
				}
				return result;
			}
		} // inner class: end
		if (isRectorId(id)) {
			return new Rector(id);
		} else {
			return new Teacher(id);
		}
	}

	private static boolean isRectorId(int id) {
// checking id in the databasereturn (id == 6); // stub
		//TODO
		return false;
	}
}
