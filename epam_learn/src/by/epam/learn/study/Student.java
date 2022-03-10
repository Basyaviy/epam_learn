package by.epam.learn.study;

public class Student {
	private int studentId;
	private String name;
	private int group;
	private String faculty;
	private Address address;

// private, protected – may be
	public class Address { // inner class: begin
		private String city;
		private String street;
		private int houseId;
		private int flatId;
		private String email;
		private String skype;
		private long phoneNumber;
// more code
	}// inner class: end
	
	public static void main(String[] args) {
		Student.Address address = new Student().new Address();
		Student student = new Student();
		Student.Address address2 = student.new Address();

		//так как main внутри класса Student 
		//у меня есть доступ к private полям
		address.city = "Moscow";
		address2.city = "Moscow";
		System.out.println(address.city);
		
	}
}
