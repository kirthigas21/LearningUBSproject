package week3;

public class APIclient {


		// TODO Auto-generated method stub
		
		public void sendrequestmethod(String status)
		{
				System.out.println(status);	
		}
		
		public void sendrequestmethod(String endpoint, String requestBody,Boolean requestStatus)
		{
			System.out.println(endpoint + "," + requestBody + "," + requestStatus);
					
		}

	

public static void main(String[] args) 

{
	
	APIclient cc = new APIclient();
	
	cc.sendrequestmethod("method successfuly added");
	cc.sendrequestmethod("Endpoint successfuly added","request body added" , true);
	

}
}
