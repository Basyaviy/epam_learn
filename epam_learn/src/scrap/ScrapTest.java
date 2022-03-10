package scrap;

public class ScrapTest {
	
	public static void main(String[] args) throws CloneNotSupportedException {
		StringWrapper str = new StringWrapper("Hello");
		StringWrapper str2 = (StringWrapper)str.clone();
		
		System.out.println(str.hashCode()+":"+ str+":"+str.getStr());
		System.out.println(str2.hashCode()+":"+ str2+":"+str2.getStr());
	}

}


class StringWrapper implements Cloneable{
	String str;
	
	StringWrapper(String str){
		this.str = str;
	}
	
	public String getStr() {
		return str;
	}
	
	@Override
	protected Object clone() throws CloneNotSupportedException {
		return super.clone();
	}
}
