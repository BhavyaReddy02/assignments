package Question8;

/*Write a code to read two int array lists of size 5 each as input and to merge the two arrayLists, sort the merged arraylist in ascending order and fetch the elements at 2nd, 6th and 8th index into a new arrayList and return the final ArrayList.
Include a class UserMainCode with a static method sortMergedArrayList which accepts 2 ArrayLists.
The return type is an ArrayList with elements from 2,6 and 8th index position .Array index starts from position 0.
Create a Main class which gets two array list of size 5 as input and call the static method sortMergedArrayList present in the UserMainCode.*/

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		List<Integer> list1 = new ArrayList<Integer>();
		for (int i = 0; i < 5; i++) {

			int value = scanner.nextInt();
			list1.add(value);
		}

		List<Integer> list2 = new ArrayList<Integer>();
		for (int i = 0; i < 5; i++) {

			int value = scanner.nextInt();
			list2.add(value);
		}

		List<Integer> result = UserMainCode.sortMergedArrayList(list1, list2);
		for (int i = 0; i < result.size(); i++) {
			System.out.println(result.get(i));
		}
	}

}
