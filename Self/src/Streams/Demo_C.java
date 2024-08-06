package Streams;

import java.util.*;
import java.util.stream.Collectors;

public class Demo_C {
	
	public static void main(String[] args)
    {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8,9);

        // get List from Stream Operation
        List<String> result = numbers.stream()
                .filter(i -> (i % 2) == 0).map(i -> "[" + i + "]")
                .collect(Collectors.toList());

        System.out.println(result);

    }

}
