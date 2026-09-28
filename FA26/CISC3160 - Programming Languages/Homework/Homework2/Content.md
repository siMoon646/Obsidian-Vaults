# Q1:
The top of the following table lists some regular expressions. The left of the table lists some words. Write a $\checkmark$ in each box where the word is part of the language denoted by the regular expression.

| Regex      |  $0 + 1^*$   | $0^* + 1^*$  |    $01^*$    |   $(01)^*$   |   $0^*1^*$   | $(0 + 1)^*$  |
| ---------- | :----------: | :----------: | :----------: | :----------: | :----------: | :----------: |
| $\epsilon$ | $\checkmark$ | $\checkmark$ |              | $\checkmark$ | $\checkmark$ | $\checkmark$ |
| 0          | $\checkmark$ | $\checkmark$ | $\checkmark$ |              | $\checkmark$ | $\checkmark$ |
| 1          | $\checkmark$ | $\checkmark$ |              |              | $\checkmark$ | $\checkmark$ |
| 01         |              |              | $\checkmark$ | $\checkmark$ | $\checkmark$ | $\checkmark$ |
| 00         |              | $\checkmark$ |              |              | $\checkmark$ | $\checkmark$ |
| 001        |              |              |              |              | $\checkmark$ | $\checkmark$ |
| 0101       |              |              |              | $\checkmark$ |              | $\checkmark$ |
# Q2:
**Write regular expressions that generate the following languages. The alphabet (= the set of legal characters) is {a, b}.**

1) **Strings that consist of abb followed by an even number of a’s, and nothing else.**
	- abb(aa)*
2) **String that begin with a and end with b.**
	- a(a+b)\*b
3) **Strings that have at least two a's.**
	- (a+b)\*a(a+b)\*a(a+b)\*
4) **Strings that do not have two a's in a row.**
	- (b + ab)\*(a + $\epsilon$)
5) **Strings that do not end with ab.**
	- $\epsilon$ + b + (a+b)\*(a + bb)

# Q3:
**Financial quantities in American notation have a leading dollar sign ($), a string of decimal digits, and an optional fractional part consisting of a decimal point (.) and two decimal digits. The string of digits to the left of the decimal point may consist of a single zero (0). Otherwise it must not start with a zero. If there are more than three digits to the left of the decimal point, groups of three (counting from the right) must be separated by commas (,). Example: $1,234,567.89. Write a regular expression that generates all valid financial quantities in American notation.**

$n \epsilon \Sigma$
$p \not = 0$  

\$(0 + p + ($\epsilon$ + n + n$^2$)(,n$^3$)\*)($\epsilon$ + .n$^2$)

# Exercise 2.3.1:
**Give a regular expression that defines a language whose sentences are the set of all strings of alphabetic (in any case) and numeric characters that are permissible as login IDs for a computer account, where the first character must be a letter and the string must contain at least one character, but no more than eight**

$a$ is an alphabetic character (in any case)
$n$ is a numeric character

regex:
a($\epsilon$ + $a+n)$^7$

# Exercise 2.3.2:
**Give a regular expression that denotes the language of five-digit zip codes (e.g., 45469) with an optional four-digit extension (e.g., 45469-0280)**

$n$ is a numeric character

regex:
n$^5$($\epsilon$ + -n$^4$)

# Exercise 3.2.4:
**Give a regular expression that denotes the language of decimals representing ASCII characters (i.e., integers between 0-127, without leading 0s for any integer except 0 itself). Thus, the strings 0, 2, 25, and 127 are in the language, but 00, 02, 000, 025, and 255 are not**

$d$ is a decimal digit
$n$ is a non-zero digit

regex:
d + nd + 1(0 + 1)d + 12(0 + 1 + 2 + 3 + 4 + 5 + 6 + 7)