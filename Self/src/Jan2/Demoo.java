package Jan2;

import java.io.File;
import java.io.FileNotFoundException;

import java.util.*;

public class Demoo {

	public static void main(String[] args) {
		   HashMap<String, Integer> mp = new HashMap<>();

	        try {
	            File file = new File("example.txt");
	            Scanner reader = new Scanner(file);

	            while (reader.hasNextLine()) {
	                String data = reader.nextLine();
	                String[] dataArray = data.split(" ");

	                // Handle cases where dataArray might have less than 3 elements
	                if (dataArray.length < 3) {
	                    System.out.println("Warning: Line skipped due to invalid format: " + data);
	                    continue;
	                }

	                String key = dataArray[0];
	                int value;

	                // Handle potential parsing errors for non-integer values
	                try {
	                    value = Integer.parseInt(dataArray[2]);
	                } catch (NumberFormatException e) {
	                    System.out.println("Warning: Line skipped due to non-integer value at index 2: " + data);
	                    continue;
	                }

	                // Update value based on key
	                mp.put(key, mp.getOrDefault(key, 0) + value);  // Efficiently handle duplicates
	            }

	            reader.close();

	            // Print the contents of the HashMap
	            System.out.println("HashMap contents:");
	            for (Map.Entry<String, Integer> entry : mp.entrySet()) {
	                System.out.println(entry.getKey() + " = " + entry.getValue());
	            }

	        } catch (FileNotFoundException e) {
	            System.out.println("Error: File not found: " + e.getMessage());
	        }
	    }

}
