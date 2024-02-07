package Jan2;

import java.util.Currency;
import java.util.Locale;

public class CCurrency {

	
	public static void main(String[] args) {
		 
		Locale  ll  = new Locale("hi" ,"IN")  ;
		
		Currency  cc  = Currency.getInstance(ll) ;
		
		String currenyCode  = cc.getCurrencyCode();
		System.out.println( "currenyCode   " +currenyCode);
		
		
		String currencyDisplay  = cc.getDisplayName() ;
		
		System.out.println("currencyDisplay    " +currencyDisplay);
		
		String currenySymbole  = cc.getSymbol() ;
		System.out.println("currenySymbole   "+currenySymbole);
		
		String getNumricdoe = cc.getNumericCodeAsString() ; 
		
		System.out.println( "getNumricdoe   " +getNumricdoe);
		
		
	}
}
