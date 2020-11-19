package Question1;

/*Write a Java program by using BufferedReader class to prompt a user to input his/her name and then the output will be shown as an example below:
Hello HCL!*/

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class UseBufferedReader {

	public static void main(String[] args) throws IOException {
		
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("Enter ur name");
		String name = bufferedReader.readLine();
		
		System.out.println("Hello "+name+"!");
		bufferedReader.close();
		
	}

}
