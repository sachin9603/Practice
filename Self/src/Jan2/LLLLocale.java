package Jan2;

import java.util.*;
public class LLLLocale {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("sachin ");
		
		// sanskrit and india 
		
		//Locale l  = Locale.getDefault() ;
		
	//	Locale l   =  Locale.CHINA;
		
		
		
		
	 Locale l  = new Locale("sa" , "IN");
		
		System.out.println("Locale --- >" + l);
		System.out.println("Locale laguage --- >" + l.getLanguage() );
		
		System.out.println("Locale country --- >" + l.getCountry());
		
		System.out.println("Locale display name  --- >" + l.getDisplayName());
		
		System.out.println("Locale  to language tag   --- >" + l.toLanguageTag());




		
		
		
		
		
		
	}

}
