package multithreading;

public class TT {
	
	 public static void main(String[] args) {
	        final String resource1 = "Resource-1";
	        final String resource2 = "Resource-2";

	        // Thread 1: locks resource1 then waits for resource2
	        Thread t1 = new Thread(() -> {
	            synchronized (resource1) {
	                System.out.println("Thread 1: locked Resource-1");

	                try { Thread.sleep(100); } catch (Exception e) {}

	                System.out.println("Thread 1: trying to lock Resource-2...");
	                synchronized (resource2) {   // waiting because Thread 2 holds it
	                    System.out.println("Thread 1: locked Resource-2");
	                }
	            }
	        });

	        // Thread 2: locks resource2 then waits for resource1
	        Thread t2 = new Thread(() -> {
	            synchronized (resource2) {
	                System.out.println("Thread 2: locked Resource-2");

	                try { Thread.sleep(100); } catch (Exception e) {}

	                System.out.println("Thread 2: trying to lock Resource-1...");
	                synchronized (resource1) {   // waiting because Thread 1 holds it
	                    System.out.println("Thread 2: locked Resource-1");
	                }
	            }
	        });

	        t1.start();
	        t2.start();
	    }

}
