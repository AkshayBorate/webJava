package example.bean;

public class UserValidator {
	
	public static boolean isValid(User userObject) {
		boolean result = false;
		String currentUserId = userObject.getUsername();
		String currentPass = userObject.getPass();
		
		if(currentUserId.equals("admin") && currentPass.equals("phoenix123"))
		return true;
		return result;
		
	}

}
