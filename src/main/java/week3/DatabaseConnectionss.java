package week3;

public interface DatabaseConnectionss {
	
	
	 default void connect(String s) {
		 
		 System.out.println("This is Interface"  +s);
	 }
	 public void  disconnect();
	 public void  executeUpdate();
	 
	 

}
