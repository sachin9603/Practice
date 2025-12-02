package shorts2;

class Payment {
	
String processPayment() {
    return "Processing generic payment...";
}

}



class UpiPayment extends Payment {
	
@Override
String processPayment() {
    return "Processing UPI payment via GooglePay...";
}


}





class CardPayment extends Payment {
    @Override
    String processPayment() {
        return "Processing Card payment with OTP verification...";
    }
}





public class Main01 {
    public static void main(String[] args) {
        Payment p1 = new UpiPayment();
        Payment p2 = new CardPayment();

        System.out.println(p1.processPayment());
        System.out.println(p2.processPayment());
    }
}



//Same method signature
//
//✔ Happens only in Inheritance
//
//✔ Enables runtime polymorphism
//
//✔ Access modifier can be equal or stronger
//
//✔ Return type can be covariant
//
//✔ Static, final, private → not overridable
//
//✔ @Override = compile-time safety































