package KeywordDemo;

public class thisKeyword {
	
	int a =2;
	
	public void getData() {
		int a=3;
		System.out.println(a + " Local Variable");
		System.out.println(this.a + " Global Variable");
		
		//To get the data from Class level use THIS keyword
		//THIS keyword scope lies in Class level not in method level
		System.out.println(this.a);
		int b = a + this.a;
		System.out.println(b);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		thisKeyword k = new thisKeyword();
		k.getData();
	}

}
