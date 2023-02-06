package day;

public class Be {

	public void s1(int a, String b) {
		System.out.println("overloading method");
	}

	public void s1( String e,int g) { 
		System.out.println("method overloading");
	}

	public static void main(String[] args) { 
	Be h=new Be(); 
	h.s1(12, "swa");
	h.s1("swa", 12);
	}
}

 
