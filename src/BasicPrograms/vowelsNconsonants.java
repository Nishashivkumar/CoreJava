package BasicPrograms;

public class vowelsNconsonants {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		vowelsNconsonants vw = new vowelsNconsonants();
		vw.vowelsNconsonant();

	}
	
	public void vowelsNconsonant() {
		String str="aeiou";
		int vowels=0; int consonants=0;
		str=str.toLowerCase();

        for (char ch : str.toCharArray()) {
        	if(ch >= 'a' && ch<='z') {
        		if (ch == 'a' || ch =='e' || ch=='i' || ch=='o' || ch=='u') {
        			vowels ++;
        			
        		}
        		else {
        			consonants ++;
        		}
        	}
        }
        System.out.println("Number of vowels " + vowels );
        System.out.println("Number of consonants " + consonants);
	}

}
