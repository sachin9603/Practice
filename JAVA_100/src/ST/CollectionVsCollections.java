package ST;

import java.util.*;

public class CollectionVsCollections {
   
	public static void main(String[] args) {

        // Collection = Interface
		ArrayList<Integer> numbers = new ArrayList<>();

        // Collections = Utility class
        // Adding data (ErrorList)
        numbers.add(50);
        numbers.add(10);
        numbers.add(40);
        numbers.add(20);
        numbers.add(30);

        System.out.println("Original List: " + numbers);

        // Convert to List for list operations
        List<Integer> list = new ArrayList<>(numbers);
     

        // 1. sort
        Collections.sort(list);
        System.out.println("After sort: " + list);

        // 2. reverse
        Collections.reverse(list);
        System.out.println("After reverse: " + list);

        // 3. shuffle
        Collections.shuffle(list);
        System.out.println("After shuffle: " + list);

        // 4. max
        System.out.println("Max value: " + Collections.max(list));

        // 5. min
        System.out.println("Min value: " + Collections.min(list));

        // 6. swap
        Collections.swap(list, 0, 2);
        System.out.println("After swap(0,2): " + list);
    }

	
}
