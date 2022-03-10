package by.epam.learn.main;

import by.epam.learn.entity.Abiturient;
import java.util.ArrayList;

/**
 * глубокое клонирование
 * @author bas
 *
 */
public class CloneMain {
	public static void main(String[] args) {
		Abiturient abiturient = new Abiturient();
		ArrayList<Byte> list = new ArrayList<>();
		list.add((byte) 1);
		list.add((byte) 2);
		abiturient.setList(list);
		Abiturient abiturient1 = abiturient.clone();
		list = abiturient1.getList();
		list.remove(0);
		list.add((byte) 9);
		System.out.println(abiturient);
		System.out.println(abiturient1);
	}
}