package regularExpressions;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidMobileNumber2 {
	public static void main(String[] args) {
		String str = "99887766555";
		
//		String regex1 ="[6-9][0-9][0-9][0-9][0-9][0-9][0-9][0-9][0-9][0-9]";
//		String regex2 ="[6-9][0-9](9)";
		String regex3 = "[6-9]\\d(9)";
		
		Pattern p=Pattern.compile(regex3);
		Matcher m= p.matcher(str);
		
		
		if(m.find() && m.group().equals(str)) {
			System.out.println("Valid Mobile Number ");
		}else {
			System.out.println("NOT A  VALID MOBILE NUMBER ");
		}
		
		
	}

}
