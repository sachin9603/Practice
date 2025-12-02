package OOPSS.polymorphism;
class Student {

static int count = 0;   // static variable
String name;
static String college ="IOT";

Student(String name) {
    this.name = name;
    count++;            // increment object count
}

static void showCount() {
    System.out.println("Total Students: " + count);
}

public static void main(String[] args) {
  Student s =   new Student("A");
  Student s1 = new Student("B");
  Student s2 =   new Student("C");

    Student.showCount();   // calling static method without object
   String name =  Student.college;
    
    
    
    
    
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
    }
}





























}
