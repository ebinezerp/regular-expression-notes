package example1;

import java.util.Arrays;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Demo {
	public static void main(String[] args) {
		List<String> names = Arrays.asList("kumar", "abhishek", "ajay", "suresh", "akshay");

		Pattern patternInstance = Pattern.compile("^a\\w*");

		Integer count = 0;

		for (String name : names) {
			Matcher matcherInstance = patternInstance.matcher(name);
			if (matcherInstance.matches()) {
				count++;
			}
		}

		System.out.println(count);
	}
}