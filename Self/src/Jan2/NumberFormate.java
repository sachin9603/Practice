package Jan2;

import java.text.NumberFormat;

public class NumberFormate {

	public static void main(String[] args) {
		
		double money  = 100.96;
		
		NumberFormat nf  = NumberFormat.getCurrencyInstance();
		
		String moneystr = nf.format(money);
		
	System.out.println(moneystr);
	}
}
