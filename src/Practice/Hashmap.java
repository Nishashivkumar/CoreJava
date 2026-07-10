package Practice;

import java.util.HashMap;

public class Hashmap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Hashmap hm=new Hashmap();
		hm.countWords();
		hm.countLetters();
	}
	
	public void countWords() {
		String str = "This this is is done by Saket Saket";
		String[] split=str.split(" ");
//		System.out.println(split.length);
		HashMap<String,Integer> map = new HashMap<String,Integer>();
		for (int i=0;i<split.length;i++) {
//			System.out.println(split[i]);
			if(map.containsKey(split[i])) {
				int count = map.get(split[i]);
//				System.out.println(count);
				map.put(split[i], count+1);
				
			}
			else {
				map.put(split[i], 1);
			}
		}
		
		System.out.println(map);
	}
	
	public void countLetters() {
		String str = "This this is is done by Saket Saket";
		String[] split=str.split("");
//		System.out.println(split.length);
		HashMap<String,Integer> map = new HashMap<String,Integer>();
		for (int i=0;i<split.length;i++) {
//			System.out.println(split[i]);
			if(map.containsKey(split[i])) {
				int count = map.get(split[i]);
//				System.out.println(count);
				map.put(split[i], count+1);
				
			}
			else {
				map.put(split[i], 1);
			}
		}
		
		System.out.println(map);
		
	}

}
