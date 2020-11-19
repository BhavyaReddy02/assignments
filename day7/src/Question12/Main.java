package Question12;

/*.Write a program to read a string and validate the IP address. Print “Valid” if the IP address is valid, else print “Invalid”.
Include a class UserMainCode with a static method ipValidator which accepts a string. The return type (integer) should return 1 if it is a valid IP address else return 2.
Create a Class Main which would be used to accept Input String and call the static method present in UserMainCode.
Note: An IP address has the format a.b.c.d where a,b,c,d are numbers between 0-255.*/

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter Ip Address");
		String string = scanner.nextLine();

		int result = UserMainCode.ipValidator(string);
		if (result == 1) {
			System.out.println("Valid");
		} else {
			System.out.println("InValid");
		}
	}

}
