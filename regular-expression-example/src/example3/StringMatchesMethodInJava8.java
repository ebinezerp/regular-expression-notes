package example3;

import java.util.Arrays;
import java.util.List;
import java.util.regex.Pattern;

public class StringMatchesMethodInJava8 {

	public static void main(String[] args) {

		List<String> names = Arrays.asList("kumar", "abhishek", "ajay", "suresh", "akshay");

		Long count = names.stream().filter(name -> name.matches("a\\w*")).count();

		System.out.println(count);

	}

}
