package regularExpressions;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidPassword {

	    public static void main(String[] args) {
	        // Default password to validate
	        String defaultPassword = "Alte#1235556";
	        
	        // Regular expression for password validation
	        String passwordPattern = "^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^&+=!])(?=\\S+$).{8,12}$";
	        
	       
	        
	        Pattern p=Pattern.compile(passwordPattern);
			Matcher m= p.matcher(defaultPassword);

	        if (m.find() && m.group().equals(defaultPassword)) {
	            System.out.println("Password is valid.");
	        } else {
	            System.out.println("Password is invalid. It must be at least 8-12 characters long Only, "
	                    + "contain at least one digit, one lowercase letter, one uppercase letter, "
	                    + "and one special character.");
	        }
	    }
	}


