package shorts2;
class Logger {

void log(String message) {
    System.out.println("INFO: " + message);
}

void log(String message, int code) {
    System.out.println("INFO: [" + code + "] " + message);
}
//1️⃣ Parameter type बदलते हो, या
//2️⃣ Parameter order बदलते हो, या
//3️⃣ Parameter की संख्या बदलते हो,


}

public class Main {
    public static void main(String[] args) {
        Logger logger = new Logger();

        logger.log("System started");
        logger.log("User logged in", 200);
      
        
        
        
        
    }
    
//✔ Same method name
//
//✔ Different parameters(type/number/order)
//
//✔ Return type alone can’t overload
//
//✔ Static, private, final 
//— all can be overloaded
//
//✔ Compile-time polymorphism
//
//✔ Constructor overloading possible
//
//✔ Ambiguity → compilation error
//
//✔ Varargs + overloading = tricky cases
////    
//    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}
