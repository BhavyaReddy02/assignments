package Question12;

public class UserMainCode {

	static int ipValidator(String string) {

		String[] strings = string.split("\\s.");
		System.out.println(strings);
		for (int i = 0; i < strings.length; i++) {
			System.out.println(strings[i]);
			if ((Integer.parseInt(strings[i]) > 0 && Integer.parseInt(strings[i]) < 255)) {
				System.out.println("hii");
				return 2;
			}
		}
		return 1;
	}
}
