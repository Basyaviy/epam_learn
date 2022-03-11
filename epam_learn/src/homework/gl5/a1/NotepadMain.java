package homework.gl5.a1;

import java.time.LocalDate;
import java.util.List;

public class NotepadMain {
	public static void main(String[] args) {
		Notepad notepad = new Notepad("Мой дневник");
		
		Notepad.Record record = notepad.new Record(LocalDate.of(2022, 3, 11));
		
		
		record.addRecord("Первая запись");
		record.addRecord("Вторая запись");
		record.addRecord("Третья запись");
		
		notepad.addRecord(record);
		
		record = notepad.new Record(LocalDate.of(2022, 3, 12));
		
		
		record.addRecord("1Первая запись");
		record.addRecord("2Вторая запись");
		record.addRecord("3Третья запись");
		notepad.addRecord(record);
		
		
		
		record = notepad.new Record(LocalDate.of(2022, 3, 11));
		
		record.addRecord("Ещё одна запись на 11 марта");
		notepad.addRecord(record);
		
		
		System.out.println(notepad.toString());
		
		
	}

}
