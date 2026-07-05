package BasicPrograms;

public class commonELementPractice {

 public static void main(String[] args) {
	 int array1[]= {1,2,3,4,5,7};
	 int array2[]= {1,2,3,4,7,8};
	 int array3;
	 
	 for(int i=0;i<=array1.length-1;i++) {
		 for(int j=0;j<=array2.length-1;j++) {
			 if(array1[i]==array2[j]) {
				 System.out.println(array1);
				 System.out.println(array2);
				 array3=array1[i];
//				 System.out.println(array3);
			 }
		 }
	 }
 }
}
