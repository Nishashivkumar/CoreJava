package Practice;

import java.util.Scanner;

public class Numbers {

	public static void main(String[] args) {
		Numbers num = new Numbers();
		num.swapNum2();
	}
	
	public void evenOdd() {
		Scanner sc =new Scanner(System.in);
		int num= sc.nextInt();
		if(num%2==0) {
			System.out.println(num + "is even");
		}
		else {
			System.out.println(num + "is odd");
		}
	}
	
	//Swapping using third variable
	public void swapNum() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter two numbers");
		int firstNum=sc.nextInt();
		int secNum=sc.nextInt();
		System.out.println("Before swapping " + firstNum + secNum);
		int temp;
		temp=firstNum;
		firstNum=secNum;
		secNum=temp;
		System.out.println("After swapping " + firstNum + secNum);
	}
	
	//Swapping without using third variable
	public void swapNum2() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter two numbers");
		int firstNum=sc.nextInt();//2
		int secNum = sc.nextInt();//3
		System.out.println("Before swapping " + firstNum + secNum);
		firstNum=firstNum+secNum;//2+3=5, firstNum=5
		secNum=firstNum-secNum;//5-3=2, secNum=2
		firstNum=firstNum-secNum;//5-2=3, firstNum=3
		System.out.println("After swapping " + firstNum + secNum);
	}

}
