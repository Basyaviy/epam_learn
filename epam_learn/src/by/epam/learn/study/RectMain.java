package by.epam.learn.study;

public class RectMain {
	public static void main(String[] args) {
		Shape shape = new Shape();
		Rect rect = new Rect();
		rect.new InnerRect();
		shape.new InnerShape();
		
		//могу получить доступ к внутреннему классу 
		//своего суперкласса
		rect.new InnerShape();
		
		//логично не могу получить доступ к внутреннему классу потомка
		//shape.new InnerRect();
	}
}
