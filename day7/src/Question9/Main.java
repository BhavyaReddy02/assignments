package Question9;

/*A Company wants to obtain employees of a particular designation. You have been assigned as the programmer to build this package. You would like to showcase your skills by creating a quick prototype. The prototype consists of the following steps:
Read Employee details from the User. The details would include name and designaton in the given order. The datatype for name and designation is string.
Build a hashmap which contains the name as key and designation as value.
You decide to write a function obtainDesignation which takes the hashmap and designation as input and returns a string array of employee names who belong to that designation as output. Include this function in class UserMainCode.
Create a Class Main which would be used to read employee details in step 1 and build the hashmap. Call the static method present in UserMainCode.*/

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter number of users:  ");
		int users = scanner.nextInt();
		
		scanner.nextLine();
		Map<String, String> employeeDetail = new HashMap();
		for(int i=0;i<users;i++) {
			
			System.out.println("Enter employee name ");
			String name = scanner.nextLine();
			
			System.out.println("Enter employee designation ");
			String designation = scanner.nextLine();
			
			employeeDetail.put(name, designation);
		}
		
		System.out.println("Enter designation to fetch");
		String designationInput = scanner.nextLine();
		List<String> details = UserMainCode.obtainDesignation(employeeDetail, designationInput);
		
		for (String string : details) {
			System.out.println(string);
		}
		
	}

}
