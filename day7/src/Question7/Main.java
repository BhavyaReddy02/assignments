package Question7;

/*Write a program to read a string and to test whether first and last character are same. 
The string is said to be be valid if the 1st and last character are the same. Else the string is said to be invalid.
Include a class UserMainCode with a static method checkCharacters which accepts a string as input .
The return type of this method is an int. Output should be 1 if the first character and last character are same . If they are different then return -1 as output.
Create a class Main which would get the input as a string and call the static method checkCharacters present in the UserMainCode.*/

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter a string");
		String string = scanner.nextLine();

		int result = UserMainCode.checkCharacters(string);
		if (result == 1) {
			System.out.println("Valid");
		} else {
			System.out.println("InValid");
		}
	}

}
