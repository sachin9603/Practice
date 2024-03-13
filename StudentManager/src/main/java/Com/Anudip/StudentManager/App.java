package Com.Anudip.StudentManager;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.persistence.EntityManager;

import Com.Anudip.StudentManager.Model.Adress;
import Com.Anudip.StudentManager.Model.Book;
import Com.Anudip.StudentManager.Model.Sectionn;
import Com.Anudip.StudentManager.Model.Student;
import Com.Anudip.StudentManager.StudentDaoImpl.StudentDaoImpl;
import Com.Anudip.StudentManager.util.Dao;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        Student s  = new Student("92","pratvi" , "chouhan" ,"male" , "pratvi@gmail.com") ;
        Student s2  = new Student("992","prat" , "chouhan" ,"male" , "prat@gmail.com") ;

        
     Adress  a  = new Adress("12"  , "indore" ,"1234") ;
        
     Sectionn sec  = new Sectionn(1212 , "Biology") ;
     s.setSectionn(sec);
     s2.setSectionn(sec);
     
        
        Book b =  new Book(49 , "kooko" ,"92") ;
        
        Book b1 = new Book(40 ,"java" ,"92") ;
        
        Book b3  = new Book(234 , "chemstiy" ,"92") ;
 Book bb =  new Book(419 , "kko" ,"992") ;
        
        Book bb1 = new Book(420 ,"jva" ,"992") ;
        
        Book bb3  = new Book(2314 , "chy" ,"992") ;
        
       Set<Student> sets = new HashSet<>() ;
       
        
        List<Book> listofBooks = new ArrayList<>() ;
        listofBooks.add(b3);
        listofBooks.add(b1);
        listofBooks.add(b);
        

        List<Book> listofBookss = new ArrayList<>() ;
        listofBookss.add(bb3);
        listofBookss.add(bb1);
        listofBookss.add(bb);
        
//        Student s2  = new Student("1","raj" , "parmar" ,"female" , "piyush@gmail.com") ;
//        Student s3  = new Student("12","riya" , "parmar" ,"female" , "piyush@gmail.com") ;
//        Student s4  = new Student("234","rita" , "parmar" ,"female" , "piyush@gmail.com") ;
        s.setAddress(a);
       s2.setAddress(a);
//        s3.setAddress(a);
//        s4.setAddress(a);
        
        s.setBookList(listofBooks);
        s2.setBookList(listofBookss);
        sets.add(s2) ;
        sets.add(s) ;
        sec.setStudentsset(sets);
      
        StudentDaoImpl  ii  = new StudentDaoImpl() ;
        
//        
//        Student s2  = new Student("51","Raghav" , "parmar" ,"male" , "Raghav@gmail.com") ;
//        s2.setAddress(a);
//        
//        
//        Student s3  = new Student("67","rita" , "parmar" ,"femail" , "rita@gmail.com") ;
//        s3.setAddress(a);
        
        EntityManager em  = Dao.provideEntityManager();
		
		   em.getTransaction().begin();
	    em.persist(sec);
	    
				em.getTransaction().commit();;
				em.close();
//
//        ii.createStudent(s);
//      ii.createStudent(s2);
//        ii.createStudent(s3);
//        ii.createStudent(s4);
    } 
}
