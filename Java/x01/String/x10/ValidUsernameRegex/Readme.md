# Valid Username Regular Expression

You are updating the username policy on your company's internal networking platform. According to the policy, a username is considered valid if all the following constraints are satisfied:

- The username consists of **8** to **30** characters inclusive. If the username consists of less than **8** or greater than **30** characters, then it is an invalid username.
- The username can only contain alphanumeric characters and underscores (_). Alphanumeric characters describe the character set consisting of lowercase characters **[a - z]**, uppercase characters **[A - Z]**, and digits **[0 - 9]**.
- The first character of the username must be an alphabetic character, i.e., either lowercase character **[a - z]** or uppercase character **[A - Z]**.

For example:

|Username|Validity|
|---|---|
|Julia|INVALID; Username length < 8 characters|
|Samantha|VALID|
|Samantha_21|VALID|
|1Samantha|INVALID; Username begins with non-alphabetic character|
|Samantha?10_2A|INVALID; '?' character not allowed|

Update the value of regularExpression field in the UsernameValidator class so that the regular expression only matches with valid usernames.

___


#### HackerRank Challenge

&nbsp;&nbsp;&nbsp;&nbsp;Valid Username Regular Expression | [https://www.hackerrank.com/challenges/valid-username-checker/problem](https://www.hackerrank.com/challenges/valid-username-checker/problem)
