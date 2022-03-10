package homework.gl4.a1;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Sentence {
	List<Word> words = new ArrayList<>();
	
	public Sentence(){}
	
	public Sentence(String source){
		
		String[] words = source.split(" ");
		for(String currentWord:words) {
			add(new Word(currentWord));
		}
			
		
		
	}
	
	
	
	public void add(Word word){
		words.add(word);
	}
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		for(Word word: words) {
			sb.append(word).append(" ");
		}
		return sb.toString();
	}
	
	public static void main(String[] args) {
		Sentence sentence = new Sentence();
		sentence.add(new Word("Hello"));
		sentence.add(new Word("new"));
		sentence.add(new Word("World"));
		System.out.println(sentence);
		
		sentence = new Sentence("Используем целое предложение");
		System.out.println(sentence);
	}

	@Override
	public int hashCode() {
		return Objects.hash(words);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Sentence other = (Sentence) obj;
		return Objects.equals(words, other.words);
	}
	
//	@Override
//	public int hashCode() {
//		return Objects.hash(words);
//	}
//	
//	@Override
//	public boolean equals(Object other) {
//		if(other == null) {
//			return false;
//		}
//		if(this == other) {
//			return true;
//		}
//		if(getClass() != other.getClass()) {
//			return false;
//		}
//		Sentence otherSentence = (Sentence)other;
//		return Objects.equals(words, otherSentence.words);
//	}
	
	

}
