package regularExpressions;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/*
 * ONLY ALLOWED CHARACTERS 0-9, a-z. 
 * Should be  start with alphabet
 * ends with .com,.in, .org, .edu
 * must contain @ character
*/
public class ValidEmail {
	public static void main(String[] args) {
		String str = "arun@gmail.com";

		String regex = "[a-z][a-z0-9._]*@[a-z0-9]+[.][a-z]{2,3}";

		Pattern p = Pattern.compile(regex);
		Matcher m = p.matcher(str);

		if (m.find() && m.group().equals(str)) {
			System.out.println("Valid  ");
		} else {
			System.out.println("NOT  VALID  ");
		}

	}
}
