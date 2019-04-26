package optional;

import java.math.BigDecimal;

import junit.framework.TestCase;

public class CountQuartersUnrealistic extends TestCase {

	public void test() throws Exception {
		assertEquals(0, countQuarters(0.25));
		assertEquals(0, countQuarters(1));
		assertEquals(14, countQuarters(0.64));
		assertEquals(3, countQuarters(12.78));

		// Not possible scenarios, just for practice
		// because there is no lower unit than a cent
		assertEquals(14.5, countQuarters(0.645));
		assertEquals(12.234, countQuarters(5.87234));
	}

	private Object countQuarters(double money) {

		// return (int) (money * 100) % 25;

		String text = Double.toString(money);
		int decimalPlaces = text.length() - text.indexOf(".") - 1;
		
		// indexOf(str) - returns -1 if there is no str in given String
		// therefore, decimalPlaces == 1 if there is integer number of dollars
		
		if (decimalPlaces == 2 || decimalPlaces == 1)
			return (int) (money * 100) % 25;
		else {
			text = Double.toString(money * 100);
			BigDecimal x = new BigDecimal(text);
			BigDecimal y = new BigDecimal("25");
			BigDecimal moduo = x.remainder(y);
			money = moduo.doubleValue();
			return money;
		}
	}
}
