package regularExpressions;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidPanNumber {
	public static void main(String[] args) {
		String str = "AKCPD3600A";
		
//		String regex1 ="[6-9][0-9][0-9][0-9][0-9][0-9][0-9][0-9][0-9][0-9]";
//		String regex2 ="[6-9][0-9](9)";
		String regex = "[A-Z]{5}[0-9]{4}[A-Z]{1}";
		
		Pattern p=Pattern.compile(regex);
		Matcher m= p.matcher(str);
		
		
		if(m.find() && m.group().equals(str)) {
			System.out.println("Valid PAN Number ");
		}else {
			System.out.println("NOT A  VALID PANNUMBER ");
		}
		
		
	}

}
