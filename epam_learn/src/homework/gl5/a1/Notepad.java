package homework.gl5.a1;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Notepad {
	private String title;
	List<Record> records = new ArrayList<>();
	
	Notepad(){}
	
	Notepad(String title){
		this.title = title;
	}
	
	public void addRecord(Record record) {
		//здесь можно реализовать поиск по записям
		//если Объект Record с такой датой уже существует, добавить новую запись к ней
		//если нет, создать новый объект
		
		for(Record currentRecord : records) {
			if(currentRecord.date.equals(record.date)){
				System.out.println("Эта дата уже есть в записях, добавляем запись к ним");
				currentRecord.records.addAll(record.);
				break;
			}
			//запись с такой датой не найдена, создаём новую
			records.add(record);
			
		}
		
	}
	
	
	class Record{
		//Дата записи(ей) нельзя изменить
		private LocalDate date;
		//записи пренадлежат конкретной дате
		private List<String> records = new ArrayList<>();
		
		//создание конкретной записи можно сделать в конструкторе
		//минимум должно содержать дату
		Record(LocalDate date){
			this.date = date;
		}
		
		//бессмысленно создавать метод с датой, для внутренней 
		//кухни одной записи Record дата остаётся неизменной
		void addRecord(String record){
			records.add(record);
		}
		
		@Override
		public String toString() {
			return date+" - "+ records;
		}
		
	}
	
	@Override
	public String toString() {
		return title + "["+records+"]";
	}

}
