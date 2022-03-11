package by.epam.learn.study;

public class StudyMain {
	public static void main(String[] args) {
		TeacherLogic logic = new TeacherLogic();
		Student student = new Student();
		logic.expelledProcess(42, student);
		logic.expelledProcess(6, student);
	}
}
