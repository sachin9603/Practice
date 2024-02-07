package jan5;
import java.util.Currency ;
import java.util.Locale ;
import java.util.Set ;

public class Localll {
	
	public static void main(String[] args) {
	
	//	Locale  l1 = Locale.getDefault() ;
		
		//Locale  l1 = new Locale("kn" ,"IN") ;
		
	//	Locale l1  = Locale.CANADA;
		

//		
//		System.out.println(l1);
//		
//		System.out.println("language by local " +l1.getLanguage() );
//		
//		System.out.println("country  by local " +l1.getCountry() );
//		//System.out.println("country  by DisplayName() " +l1.getDisplayVariant());
//
//		
//		System.out.println("country  by DisplayName() " +l1.getDisplayName());
//		
//		System.out.println("country  by DisplayName() " +l1.toLanguageTag());
//		
		
	Locale l1    = new Locale( "hi" ,"IN") ;
//	
//	Currency bhatiyacurrency  = Currency.getInstance(l1) ;
//	
//	System.out.println("Currency Code " + bhatiyacurrency.getCurrencyCode());
//	
//	System.out.println("Currency symbole " + bhatiyacurrency.getSymbol());
//	
//	System.out.println("currency code " +bhatiyacurrency.getNumericCode());
//	
//	System.out.println("currency code " +bhatiyacurrency.getDisplayName());
//	
	Set<Currency>  currencies  = Currency.getAvailableCurrencies() ;
	
	
	
	for(Currency  bhatiyacurrency : currencies) {
		String s  = "" ;
      s = s+bhatiyacurrency.getCurrencyCode() +"| "  
    		  +bhatiyacurrency.getSymbol() +"| " +bhatiyacurrency.getNumericCode() + "| " 
    		  +bhatiyacurrency.getDisplayName() ;
      System.out.println(s);
     
//		System.out.println("Currency Code " + bhatiyacurrency.getCurrencyCode());
//		
//		System.out.println("Currency symbole " + bhatiyacurrency.getSymbol());
//		
//		System.out.println("currency code " +bhatiyacurrency.getNumericCode());
//		
//		System.out.println("currency code " +bhatiyacurrency.getDisplayName());
//		
      
      
      
	}

	
	
	

	
	
	
	
	
	Currency bh  = Currency.getInstance("USD") ;
	
System.out.println("Currency Code " + bh.getCurrencyCode());


System.out.println("currency code " +bh.getNumericCode());
		
		
	}

}
