package example2;

import java.util.Arrays;
import java.util.List;
import java.util.regex.Pattern;

public class PatternMatchesMethodExampleInJava8 {

	public static void main(String[] args) {

		List<String> names = Arrays.asList("kumar", "abhishek", "ajay", "suresh", "akshay");
		
		Long count = names.stream()
				.filter(name -> Pattern.matches("a\\w*", name))
				.count();
		
		System.out.println(count);

	}

}
