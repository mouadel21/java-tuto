package Tuto;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		this 
		is
		a
		multi-line
		comment
	
		 
		//This is my first java program
		System.out.println("i like pizza! ");
		System.out.println("it's really good! ");
		System.out.println("Buy me pizza! ");
		
		
		
		int age = 24;
		System.out.println(age);
		int year = 2025; 
		System.out.println(year);
		System.out.println("the year is " + year);
		int quantity =1;
		System.out.println(quantity);
		
		
		double price = 19.99;
		double gpa = 3.5;
		double temperature =-12.5;
		System.out.println("$ "+price);
		char garde = 'A';
		char Symbol= '!';
		char currency = '$';
		System.out.println(garde);
		System.out.println(Symbol);
		System.out.println(currency);
		
		boolean isStudent = false;
		boolean forSale = false;
		boolean isOnline = true;
		
		if(isStudent) {
		
			System.out.println("you are student");
		}else {
			System.out.println("you  are not a student");
		}
		
			
		
	Scanner scanner = new Scanner(System.in);
	
	System.out.print("Enter your name : ");
	String name =scanner.nextLine();	
	System.out.print("Enter your age: ");
	int age =scanner.nextInt();
	System.out.print("Enter your gpa: ");
	double gpa =scanner.nextDouble();
	System.out.print("Are you a student (true /false): ");
	boolean isStudent = scanner.nextBoolean();
	
	System.out.println("HELLO " +name+ " your age is  " + age);
	System.out.print(" your gpa is " +gpa);
	System.out.print(" student " +isStudent);
	
	
	scanner.close();
	
		
		 */
		
		double width = 0;
		double height = 0;
		double area = 0;
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter your width ");
		width=scanner.nextDouble();
		System.out.print("Enter your height ");
		height=scanner.nextDouble();
		area=width*height;
		System.out.println("The area is: "+ area + "cm^2");
		
		
		
		
		
		
		
	}

}
