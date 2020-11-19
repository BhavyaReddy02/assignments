package Question11;

/*.Given a method with two date strings in yyyy-mm-dd format as input. Write code to find the difference between two dates in months.
Include a class UserMainCode with a static method getMonthDifference which accepts two date strings as input.
The return type of the output is an integer which returns the diffenece between two dates in months.
Create a class Main which would get the input and call the static method getMonthDifference present in the UserMainCode.*/

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the dates to find months ");

		String date1 = scanner.nextLine();
		String date2 = scanner.nextLine();

		int difference = UserMainCode.getMonthDifference(date1, date2);
		System.out.println("Difference between months " + difference);
	}

}
