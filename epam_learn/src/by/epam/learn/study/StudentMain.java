package by.epam.learn.study;

import by.epam.learn.study.Student.Address;

public class StudentMain {
	public static void main(String[] args) {
		Student.Address address = new Student().new Address();
		Student student = new Student();
		Student.Address address2 = student.new Address();
		//за пределами класса сущности доступа 
		//к private полям нет - всё логично
		//student.studentId = "3";
		//address.city = "Moscow";
		//address2.city = "Moscow";
		//System.out.println(address.city);
		
	}
}
