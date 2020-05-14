package example4;

import java.util.regex.Pattern;

public class NameValidation {
	
	public static void main(String[] args) {
		
		
		Pattern patternInstance = Pattern.compile("(([a-z]{4,})(\\s)?)+");
		
		System.out.println(patternInstance.matcher("raja vijayendra varma").matches()); // true
		System.out.println(patternInstance.matcher("kumar123").matches()); // false
		System.out.println(patternInstance.matcher("raj").matches()); // false
		System.out.println(patternInstance.matcher("raju").matches()); // true
		System.out.println(patternInstance.matcher(" raju").matches()); // false
		
	}

}
