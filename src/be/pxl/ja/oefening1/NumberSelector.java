package be.pxl.ja.oefening1;

import java.util.function.Predicate;

public class NumberSelector {

	private NumberMachine member;
	private static int NUMBER_LIMIT_1 = 20;
	private static final int NUMBER_LIMIT_2 = 25;


	public NumberSelector(NumberMachine numberMachine) {
		this.member = numberMachine;
	}

	public String showEvenNumbers() {
		String result = member.processNumbers(new NumberFilter() {
			@Override
			public boolean check(int number) {
				return number % 2 == 0;
			}
		});
		return result;
	}

	public String printHexNumbers() {
		String result = member.convertNumbers(integer -> true);
		return result;
		//throw new UnsupportedOperationException("Implement this method");
	}

	public String showNumbersAbove(int number) {
		String result = member.processNumbers(number1 -> number1 > NUMBER_LIMIT_2);
		return result;
	}
}
