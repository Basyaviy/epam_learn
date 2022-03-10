package homework.gl4.a1;

import java.util.ArrayList;
import java.util.List;

public class Text {
	String title;
	List<Sentence> sentences= new ArrayList<>();
	
	public Text(String title) {
		this.title = title;
	}
	
	public void add(Sentence sentence) {
		sentences.add(sentence);
	}
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder("========="+title+"=========\n");
		for(Sentence sentence: sentences) {
			sb.append(sentence).append("\n");
		}
		return sb.toString();
	}
	
	public static void main(String[] args) {
		Text text = new Text("Заголовок");
		text.add( new Sentence("Создать приложение, "
				+ "удовлетворяющее требованиям, приведенным в задании."));
		text.add( new Sentence("Наследование применять "
				+ "только в тех заданиях, в которых это логически обосновано."));
		text.add( new Sentence("Аргументировать принадлежность "
				+ "классу каждого создаваемого метода и корректно "
				+ "переопределить для каждого класса методы equals(), "
				+ "hashCode(), toString()."));
		
		System.out.println(text);
	}

}
