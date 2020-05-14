# Regular Expressions

## Introduction

* A regular expression a string pattern that uses for matching a given text.

    Example: Strong Password

    Let consider you need to match given password is meeting the strong password criteria, atleast contains one small, capital, numeric and special character. In this we can use regular expression,
    which is used to match given text as explained above.

    In fields like Data Sciences, Analytics, AI and many more where data plays are crucial role and have more searching and matching operations exists there these regular experssions use extensively.

    But in other applications also regular expressions use at different level, per say, in validation of user data.

* Regular expressions consists of two type of characters:

  * Regular literal characters
  * Meta characters

  To the regular literal characters meta characters add more information in searching and matching text.
  
  Let's take an example, to search for ".txt" format files in a directory, wildcard can be used "*.txt". To the above wildcard some meta characters also can be added, like  "^.\*\\.txt$", where ".\*\\" are meta characters to add some more information.

  Let's discuss how those meta characters behave and more value in text searching and matching.

  ## Anchors and Boundaries

  | Meta Character | Description|
  |  :--------:    |------------|
  |^               | Start of any string or line.|
  |$               | End of any string or line.|
  |\b              | Starting or Ending of any string.|
  |\B              | Anywhere other than start and end of the string.|
  
  ## Character Classes

  * Character classes uses to match a character with a specific character set.

  | Meta Character| Description|
  |   :----:      | :--------  |
  |.              | Any character other than new line character.|
  |\s             | Matches white space character (space or tab space).|
  |\S             | Any character other than white space.|
  |\w             | Any word character (a letter, a number or an underscore). That also used with character set [a-zA-Z0-9_].|
  |\W             | Not a word character. That also used with negated character set [^a-zA-Z0-9_].|

  ## Quantifiers

  | Meta Character | Description|
  |  :----:  | :----- |
  |+|  To match with atleat one or more preceeding character |
  |*| To match with zero or more preceeding character|
  |?| To make a character optional or to make preceeding characters lazy |

  ## And for more Meta characters visit [Regex](https://regexr.com/)

## java.util.regex package

* To search and match a string in java application "java.util.regex" is given in api.

* Let's explore classes in that package.

  * Pattern
  * Matcher

### Pattern Class

* A compiled representation of a regular expression.

* With a regular experssion that use to match a string an instance of Pattern class is required. Pattern instance can be created using "compile()". At the time of creating the instance of the Pattern that regular experssion is going to compiled for proper formation. If regular experssion is wrong it gives runtime error.

* All the regular experssions and its usage is given in [java api at Pattern class description](https://docs.oracle.com/javase/8/docs/api/)

Example:

    Pattern patternInstance= Pattern.compile("^a\w+k$");

Above pattern instance is created to match the string that starts with 'a' and ends with 'k' with any word characters (a-zA-Z0-9_) between them.

### Matcher Class

* To match given string with compiled regular experssion Matcher class can be used.

* To create instance of Matcher, in Pattern class, matcher() is given.

        Matcher matcherInstance = patternInstance.matcher("abhishek");

* With the matcherInstance we can test weather given string is matched with provided regular experssion.

        boolean matched = matcherInstance.matches();

## Problem Statement - 1

* Write a program to find number of strings in a given list that contains 'a' character at first.

        public class Demo{
            public static void main(String[] args){
                List<String> names = Arrays.asList("kumar", "abhishek", "ajay", "suresh", "akshay");

                Pattern patternInstance = Pattern.compile("^a\\w*");

                Integer count = 0;

                for(String name: names){
                   Matcher matcherInstance = patternInstance.matcher(name);
                   if(matcherInstance.matches()){
                        count++;
                   }
                }

                System.out.println(count);
            }
        }

* In Java 8th Version

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

## Alternative Solutions

* The same problem can be solved in different ways.

### Solution - 1

* Using Pattern.matches() method. see [example](https://github.com/ebinezerp/regular-expression-notes/tree/master/regular-expression-example/src/example2)

  * Using of Pattern.matches() method some times may lead to performances issues.
  
  * In case of matching multiple strings  with same regular experssion using of this method causes performance issue because number of times same regular experssion has to compile again and again.

  * So need to be careful in using above method.

### Solution - 2

* Using of String.matches(). See [example](https://github.com/ebinezerp/regular-expression-notes/tree/master/regular-expression-example/src/example3)

  * While using String.matches() method also same issues that are occuring with Pattern.matches() will occur.

## Problem Statement - 2

### Name Validation

* To consider a string as valid name, it should consists of only alphabet and white spaces with atleast 4 alphabet.

* character ([a-z]) can be used for the alphabet and range {4,} can be used for atleast 4 character condition.

      [a-z]{4,}

* And for white space (\s) can be used. To make \s as optional qunatifier(?) can be used.

      (\s)?

* Together can be used to match a String with atleast 4 alphabet characters and with white space.

      [a-z]{4,}(\s)?

* A name may consists of multiple strings like "raja vijayendra varma", to match with multiple strings of same format, below regular experssion can be used with a additional qunatifier(+) to the above regular expression.

      ([a-z]{4,}(\s)?)+

See example program of name validation [here](https://github.com/ebinezerp/regular-expression-notes/tree/master/regular-expression-example/src/example3).


## References

* https://docs.oracle.com/javase/8/docs/api/

* https://regexr.com/

* https://examples.javacodegeeks.com/category/core-java/util/regex/
