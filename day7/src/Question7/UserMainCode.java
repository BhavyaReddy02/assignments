package Question7;

public class UserMainCode {

	static int checkCharacters(String input) {
		
		if(input.charAt(0)==input.charAt(input.length()-1))
			return 1;
		return -1;
	}

}
