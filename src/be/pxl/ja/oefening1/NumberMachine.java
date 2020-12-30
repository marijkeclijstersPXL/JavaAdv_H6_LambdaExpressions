package be.pxl.ja.oefening1;

import java.util.ArrayList;
import java.util.function.Predicate;

public class NumberMachine {

	private ArrayList<Integer> numbers = new ArrayList<>();

	public NumberMachine(int[] numbers) {
		for (int i = 0; i < numbers.length; i++) {
			this.numbers.add(numbers[i]);
		}
	}

	public String processNumbers(NumberFilter filter) {
		String result = "";
		for(int i=0;i<numbers.size();i++) {
			if(filter.check(numbers.get(i))) {
				if(!result.equals("")) {
					result += "-";
				}
				result += numbers.get(i);
			}
		}
		return result;
	}

	public String convertNumbers(Predicate<Integer> filter) {
		String resultaat = "";
		for(int i=0;i<numbers.size();i++) {
			if(filter.test(numbers.get(i))) {
				if(!resultaat.equals("")) {
					resultaat += "-";
				}
				resultaat += (Integer.toHexString(numbers.get(i)));
			}
		}
		return resultaat;

	}

}


/*public ArrayList<VideoGame> selectGames(Predicate<VideoGame> filter) {
		ArrayList<VideoGame> gameList = new ArrayList<>();
		for (int i = 0; i < videoGames.size(); i++) {
			if (filter.test(videoGames.get(i))) {
				gameList.add(videoGames.get(i));
			}
		}
		return gameList;
	}
	*/