package Question8;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class UserMainCode {

	static List<Integer> sortMergedArrayList(List<Integer> list1,List<Integer> list2) {
		
		
		List<Integer> finalList = new ArrayList();
		list1.addAll(list2);
		Collections.sort(list1);
		finalList.add(list1.get(2));
		finalList.add(list1.get(6));
		finalList.add(list1.get(8));
		
		return finalList;
	}

}
