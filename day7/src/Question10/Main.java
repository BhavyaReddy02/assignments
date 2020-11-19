package Question10;

/*.Write a program to read two String variables in DD-MM-YYYY.Compare the two dates and return the older date in 'MM/DD/YYYY' format.
Include a class UserMainCode with a static method findOldDate which accepts the string values. The return type is the string.
Create a Class Main which would be used to accept the two string values and call the static method present in UserMainCode.*/

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter the dates ");
		String date1 = scanner.nextLine();
		String date2 = scanner.nextLine();

		String oldDate = UserMainCode.findOldDate(date1, date2);
		String[] result = oldDate.split("-");

		String dateFormat = "";
		dateFormat += result[1] + "/";
		dateFormat += result[0] + "/";
		dateFormat += result[2];

		System.out.println(dateFormat);

	}

}
