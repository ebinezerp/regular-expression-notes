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
  |\W             | Not a word character. That also used with character set [^a-zA-Z0-9_].|

  