package Question13;

/*.Get two date strings as input and write code to find difference between two dates in days.
Include a class UserMainCode with a static method getDateDifference which accepts two date strings as input.
The return type of the output is an integer which returns the diffenece between two dates in days.
Create a class Main which would get the input and call the static method getDateDifference present in the UserMainCode.*/

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the dates to find months ");

		String date1 = scanner.nextLine();
		String date2 = scanner.nextLine();

		int difference = UserMainCode.getDateDifference(date1, date2);
		System.out.println("Difference between dates " + difference);
	}

}
