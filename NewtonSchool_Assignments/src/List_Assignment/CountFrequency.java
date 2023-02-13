package List_Assignment;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class CountFrequency {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		List<Integer> list = new ArrayList<>();

		for (int i = 0; i < n; i++) {
			list.add(sc.nextInt());
		}
		countfreq(list);
	}

	private static void countfreq(List<Integer> list) {

		Collections.sort(list);
//		System.out.println(list);
		List<Integer> freq = new ArrayList<>();

		freq.add(Collections.frequency(list, list.get(0)));

		for (int i = 1; i < list.size(); i++) {
			if (list.get(i) == list.get(i - 1)) {
				continue;
			} else {
				freq.add(Collections.frequency(list, list.get(i)));

			}

		}
//		System.out.println(freq);

		for (int i = 1; i < list.size(); i++) {
			if (list.get(i) == list.get(i - 1)) {
				list.remove(i);
			}
		}
//		System.out.println(list);
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i) + " " + freq.get(i));
		}

	}

}
