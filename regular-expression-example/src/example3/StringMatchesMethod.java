package example3;

import java.util.Arrays;
import java.util.List;
import java.util.regex.Pattern;

public class StringMatchesMethod {

	public static void main(String[] args) {

		List<String> names = Arrays.asList("kumar", "abhishek", "ajay", "suresh", "akshay");

		Integer count = 0;

		for (String name : names) {
			if (name.matches("a\\w*")) {
				count++;
			}
		}

		System.out.println(count);

	}

}
