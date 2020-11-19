package Question14;

public class UserMainCode {

	
	static String convertDateFormat(String input) {
		
		String dateFormatter = input.replaceAll("/", "-");
		return dateFormatter;
	}
}
