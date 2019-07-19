package CONTROLLER;

import java.util.Scanner;

import POJO.SetGetLoginDetails;
import SERVICE.LoginVerifyService;
import SERVICE.LoginVerifyServiceImpl;

public class LoginVerifyController {

	SetGetLoginDetails refSetGetLoginDetails;  //SetGetLoginDetails is a POJO (Plain Old Java Object)
	LoginVerifyService refLoginVerifyService; //LoginVerifyService is an Interface
	
	public void verifyController()
	{
		userInput();
	}
	
	void userInput()
	{
		Scanner sc = new Scanner(System.in);
		
		//scan userName and userPassword Details
		System.out.println("Enter Username: ");
		String userName = sc.next();
		
		System.out.println("Enter Password: ");
		String userPassword = sc.next();	
		
		//Create object for SetGetLoginDetails class
		refSetGetLoginDetails = new SetGetLoginDetails();
		
		//set values to setter methods of GetSetLoginDetails class
		refSetGetLoginDetails.setUserName(userPassword);
		refSetGetLoginDetails.setUserPassword(userPassword);
		
		//Create an object of LoginVerifyServiceImpl and refer to it's interface
		refLoginVerifyService = new LoginVerifyServiceImpl();
		
		refLoginVerifyService.verifyStatus(refSetGetLoginDetails);
		
		
		
		
		
		
		
	}
}
