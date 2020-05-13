package example1;

import java.util.Arrays;
import java.util.List;
import java.util.regex.Pattern;

public class DemoInJava8 {

	public static void main(String[] args) {

		List<String> names = Arrays.asList("kumar", "abhishek", "ajay", "suresh", "akshay");

		Pattern patternInstance = Pattern.compile("a\\w*");

		Long count = names.stream()
				.filter(name -> patternInstance.matcher(name).matches())
				.count();

		System.out.println(count);

	}

}
