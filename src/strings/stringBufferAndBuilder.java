package strings;

public class stringBufferAndBuilder {

	public static void main(String[] args) {
		//String Literals - Mutable
		String a = "hello";
		String b ="hello";
		System.out.println(a);
		String b1 = a.concat("world");
		System.out.println(b1);
		String s = new String("hello");// String class creates new object every time in memory
		String s1 = new String("hello");
		
		//String Buffer and STring Builder - Mutable
		StringBuffer sb = new StringBuffer("hello");
		sb.append("world");//helloworld
		System.out.println(sb);
		sb.insert(5, "new");//hellonewworld
		System.out.println(sb);
		sb.replace(5, 8, "old");//
		System.out.println(sb);
		sb.reverse();
		System.out.println(sb);
		
		//String Builder - Same methods can be used in String builder but its not thread safe(it allows multiple programs to access the object at a time). 
		//It is non synchronized. but its faster than string buffer
		
		//Difference between equals and == operator
		System.out.println(a.equals(b));//returns true
		System.out.println(a==b);//returns true
		System.out.println(a.equals(s));//returns true - equals operator checks for content 
		System.out.println(a==s);//returns false 
		System.out.println(s==s1);//returns false as references are different and defined with string class
		
		
		

	}

}
