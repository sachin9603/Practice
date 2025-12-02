
public class DinnerDecision {
	
public static void main(String[] args) {

	

	
	
//👉 If-else is stronger when you need logic or ranges.	
//	if-else → Flexible, can handle complex conditions
int marks = 85;

if (marks >= 90) {
    System.out.println("Excellent");
} else if (marks >= 75) {
    System.out.println("Very Good");
} else {
    System.out.println("Good");
}
//switch → Clean, fast, best for using many fixed options

String day = "MONDAY";
//	👉 Switch is more optimized when you
//have several fixed choices.

switch (day) {
    case "MONDAY":
        System.out.println("Start of week");
        break;
    case "FRIDAY":
        System.out.println("Weekend is near");
        break;
    default:
        System.out.println("Normal day");
}



































































    }
}
