import java.util.*;

public class Main {
	public static void main(String[] args) {
		List<Integer> nums = new ArrayList<>(List.of(1, 1, 2, 3, 97, 51, 4, 4, 5, 5, 6, 7));
		List<String> words = new ArrayList<>(List.of("abbc", "fgda", "uiuj", "wrad", "abbc", "jhug", "uiuj"));
		List<String> strings = new ArrayList<>(List.of("один", "один", "два","два", "два", "три", "три", "три", "четыре"));
		taskOne(nums);
		System.out.println("////////////////");
		taskTwo(nums);
		System.out.println("////////////////");
		taskThree(words);
		System.out.println("////////////////");
		taskFour(strings);

	}


	static void taskOne(List<Integer> list) {
		for (int num : list) {
			if (num % 2 != 0) {
				System.out.println(num);
			}
		}
	}

	static void taskTwo(List<Integer> nums) {
		nums = new ArrayList<>(new HashSet<>(nums));
		Collections.sort(nums);
		for (Integer num : nums) {
			if (num % 2 != 0) {
				System.out.println(num);
			}
		}
	}

	static void taskThree(List<String> words) {
		words = new ArrayList<>(new HashSet<>(words));
		System.out.println(words);
	}

	static void taskFour(List<String> strings){
		Map<String, Integer> listMap = new HashMap<>();
		for (String word: strings){
			if (listMap.containsKey(word)){
				listMap.put(word, listMap.get(word) + 1);
			} else {
				listMap.put(word, 0);
			}
		}
		System.out.println(listMap.values());
	}

}