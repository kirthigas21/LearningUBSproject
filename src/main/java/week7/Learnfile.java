package week7;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

public class Learnfile {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		//Step1:  Create object for FileInputStream and pass the proprties file location in constructor
				FileInputStream fis = new FileInputStream("./src/main/resources/newfile.properties");
				
				//Step2: Create object for Properties class from java
				Properties prop = new Properties();
				
				//Step3: Load the properties file
				prop.load(fis);
				
				// Step4: Get the value from properties file based on the key
				String uname1 = prop.getProperty("username");
				System.out.println(uname1);
				String pwd1 = prop.getProperty("password");
				System.out.println(pwd1);
				String user1 = prop.getProperty("UserName");
				System.out.println(user1);
				String uname = prop.getProperty("username");
				System.out.println(uname);
				String pwd = prop.getProperty("password");
				System.out.println(pwd);
				String user = prop.getProperty("UserName");
				System.out.println(user);
				
			}
			
		
	}


