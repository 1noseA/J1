package silver9_2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
	public static void main(String[] args) {
		// 設問2
		Sample[] samples = {
				new Sample(2, "B"),
				new Sample(3, "C"),
				new Sample(1, "A")
		};
		List<Sample> list = new ArrayList<Sample>(Arrays.asList(samples));
		list.sort(new SampleComparator());
		for (Sample s : list) {
			System.out.println(s.getName());
		}

		// 設問3
		List<Integer> list2 = Arrays.asList(new Integer[] {1, 2, 3});
		list2.sort((a, b) -> -a.compareTo(b));
		for (Integer num : list2) {
			System.out.println(num);
		}
	}
}
