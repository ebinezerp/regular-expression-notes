package example5;

import java.util.regex.Pattern;

public class PasswordValidation {
	
	public static void main(String[] args) {
		
		
		Pattern patternInstance = Pattern.compile("((?=[a-z]).{2,40})");
		
		System.out.println(patternInstance.matcher("aP@ssw0rd#123").matches());
		
		
	}

}
