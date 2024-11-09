package regularExpressions;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidMobileNumber {
	public static void main(String[] args) {
		String str = " This is my number 9988776655";
//		
		String regex1 ="[6-9][0-9][0-9][0-9][0-9][0-9][0-9][0-9][0-9][0-9]";
		String regex2 = "[6-9][0-9](9)";
		String regex3 = "[6-9]\\d(9)";
//		
		Pattern p = Pattern.compile(regex2);
		Matcher m = p.matcher(str);
//		
//		
		while (m.find()) {
			System.out.println("found");
			System.out.println(m.group());

//		
//		
//	}

		}
	}
}