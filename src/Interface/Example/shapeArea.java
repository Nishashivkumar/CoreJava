package Interface.Example;

import java.util.Scanner;

public class shapeArea implements Area{
	Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		shapeArea circleArea = new shapeArea();
		circleArea.Circle();
		
		shapeArea squareArea = new shapeArea();
		squareArea.Square();
		
	}

	@Override
	public void Square() {
		// TODO Auto-generated method stub
		System.out.println("Enter the length of the side for Square");
		int length = sc.nextInt();
		int area = length*4;
		System.out.println("The area of Square is " + area);
		
	}

	@Override
	public void Triangle() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void Circle() {
		// TODO Auto-generated method stub
		System.out.println("Enter the radius of the circle");
		
		double radius =(float) sc.nextInt();
		System.out.println(radius);
		double Area=(Double) (3.14*radius*radius);
		System.out.println("Area of the circle is " +Area );
	}

	@Override
	public void Rectangle() {
		// TODO Auto-generated method stub
		
	}

}
