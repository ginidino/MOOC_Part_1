package WEEK1;

import java.util.Scanner;

//Sum of the ages
public class Exercise12 {
	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		System.out.print("Type your name: ");
		String name1 = reader.nextLine();
		System.out.print("Type your age: ");
		int age1 = Integer.parseInt(reader.nextLine());
		
		System.out.println();
		
		System.out.print("Type your name: ");
		String name2 = reader.nextLine();
		System.out.print("Type your age: ");
		int age2 = Integer.parseInt(reader.nextLine());
		
		int sumAge = age1 + age2;
		System.out.println(name1 + " and " + name2 + " are " + sumAge + " years old in total.");
	}
}
