package Question14;

/*Given a date string in the format dd/mm/yyyy, write a program to convert the given date to the format dd-mm-yy.
Include a class UserMainCode with a static method “convertDateFormat” that accepts a String and returns a String.
Create a class Main which would get a String as input and call the static method convertDateFormat present in the UserMainCode.*/

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter the date: ");
		String date = scanner.nextLine();

		System.out.println("DateConvertFormat : " + UserMainCode.convertDateFormat(date));

	}

}
