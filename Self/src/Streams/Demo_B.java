package Streams;

import java.util.*;
import java.util.stream.Collectors;

public class Demo_B {


    public static void main(String[] args)
    {

        // Creating an integer Arraylist to store marks
        ArrayList<Integer> marks = new ArrayList<Integer>();

        // These are marks of the students
        // Considering 5 students so input entries
        marks.add(30);
        marks.add(78);
        marks.add(26);
        marks.add(96);
        marks.add(79);

        // Printing the marks of the students before grace
        System.out.println(
            "Marks of students before grace : " + marks);

        // Now we want to grace marks by 6
        // using the streams to process over processing
        // collection

        // Using stream, we map every object and later
        // collect to List
        // and store them
        List<Integer> updatedMarks
            = marks.stream()
                  .map(i -> i + 6)
                  .collect(Collectors.toList());

        // Printing the marks of the students after grace
        System.out.println(
            "Marks of students  after grace : "
            + updatedMarks);
    }


}
