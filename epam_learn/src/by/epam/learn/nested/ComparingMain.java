package by.epam.learn.nested;

public class ComparingMain {
	public static void main(String[] args) {
		Student st1 = new Student(2341757, "Mazaliyk", 3, 5.42f);
		Student st2 = new Student(2341742, "Polovinkin", 1, 5.42f);
		// creating a static class object
		Student.NameComparator nameComparator = new Student.NameComparator();
		int result1 = nameComparator.compare(st2, st1);
		System.out.println(st1.getName() + " [" + result1 + "] " + st2.getName());
		
		Student.MarkComparator markComparator = new Student.MarkComparator();
		int result2 = markComparator.compare(st1, st2);
		System.out.println(st1.getAverageMark() + " [" + result2 + "] " + st2.getAverageMark());
		
		Student.GroupComparator groupComparator = new Student.GroupComparator();
		int result3 = groupComparator.compare(st1, st2);
		System.out.println(st1.getGroup() + " [" + result3 + "] " + st2.getGroup());
	}
}
