package Question1;

/*Write a program to assign the current thread to t1.
Change the name of the thread to MyThread. Display the changed name of the thread.
Also it should display the current time. Put the thread to sleep for 10 seconds and display the time again.*/

import java.text.SimpleDateFormat;
import java.util.Date;

public class DisplayDateTime {

	public static void main(String[] args) {

		Date date = new Date();
		SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");

		System.out.println("Date and Time in the format:  " + dateFormat.format(date));
	}
}
