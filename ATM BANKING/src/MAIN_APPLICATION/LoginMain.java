package MAIN_APPLICATION;

import CONTROLLER.LoginVerifyController;

public class LoginMain {

	public static void main(String[] args)
	{
		LoginVerifyController refLoginVerifyController = new LoginVerifyController();  //Create an object of LoginVerifyController class
		refLoginVerifyController.verifyController();      //call verifyController method from LoginVerifyController class
		
		
	}
	
}
