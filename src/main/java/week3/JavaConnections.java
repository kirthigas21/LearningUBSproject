package week3;

public class JavaConnections extends abstractconnections{
	
	 public static void main(String[] args) {
		 
		 JavaConnections jc = new JavaConnections();
		// jc.databasename = "SQl";
		// jc.connect();
		 jc.disconnect();
		 jc.executeUpdate();
	        jc.connect("Sqqq");

}
	 
	 
}
