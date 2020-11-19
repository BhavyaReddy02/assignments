package Question6;

/*Include a class UserMainCode with a static method “getNumberOfDays” that accepts 2 integers as arguments and returns an integer.
  The first argument corresponds to the year and the second argument corresponds to the month code. 
  The method returns an integer corresponding to the number of days in the month.
  Create a class Main which would get 2 integers as input and call the static method getNumberOfDays present in the UserMainCode.
 */

import java.time.Month;
import java.util.Scanner;

import Question5.NumberOfDays;

public class Main {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		int year = scanner.nextInt();
		int month = scanner.nextInt();

		Month month1 = Month.of(month + 1);
		int days = UserMainCode.getNumberOfDays(year, month);
		System.out.println(days);

	}

}
