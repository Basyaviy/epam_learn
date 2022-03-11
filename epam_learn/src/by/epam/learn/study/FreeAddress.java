package by.epam.learn.study;

public class FreeAddress extends Student.Address {
	public FreeAddress() {
		new Student().super();
	}

	public FreeAddress(Student student) {
		student.super();
	}
}
