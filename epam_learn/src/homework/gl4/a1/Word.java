package homework.gl4.a1;

import java.util.Objects;

public class Word {
	String word;
	
	Word(String word){
		this.word = word;
	}
	
	@Override
	public String toString() {
		return word;
	}
	
	public static void main(String[] args) {
		Word word = new Word("Hello");
		System.out.println(word);
	}

	@Override
	public int hashCode() {
		return Objects.hash(word);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Word other = (Word) obj;
		return Objects.equals(word, other.word);
	}
	
	

}
