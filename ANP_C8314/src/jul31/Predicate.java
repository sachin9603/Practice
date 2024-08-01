package jul31;

public class Predicate implements CheckOddEven {

	@Override
	public boolean check(int a) {
		// TODO Auto-generated method stub
		if (a%2 == 0) {
			// it even
			return true ;
		}
		return false;
	}
	
	

}
