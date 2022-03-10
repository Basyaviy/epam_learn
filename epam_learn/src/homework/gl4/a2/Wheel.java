package homework.gl4.a2;

enum Wheel {
	LEFT_FORWARD("Левое переднее"), RIGHT_FORWARD("Правое переднее"), 
	LEFT_BACK("Левое заднее"), RIGHT_BACK("Правое переднее");
	String ru;
	
	
	Wheel(String str){
		this.ru = str;
	}

	public void change() {
		System.out.println("Wheel change: "+this.ru);
	}
}

