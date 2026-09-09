# Chapter 1:
1) Identifiers:
	- programmer decided names for things in a program (variables, functions, types, constants, classes, etc.)
2) Static Binding:
	- Binding occurs before run-time and are fixed during run-time
3) Dynamic Binding:
	- Binding occurs during run-time and 
	- are changeable during run-time
4) Expression:
	- Evaluated for value
5) Statement: 
	- Executed for side effect
6) Syntax: 
	- Form of a language
7) Semantics:
	- Meaning of a language
8) First-class entity:
	- Program object that has privileges that other comparable program do not.
9) Side effect:
	- Modification of a parameter to function, operator, or entity in *external environment*.
10) Referential transparency:
	- Expressions and languages if they:
		1) argument/operands to a function/operator yield the same output irrespective of  the context/environment in which the expression applying the function/operator is evaluated.
11) Pure: 
	- A function that does not contain any side effects and returns predictable values.
12) Monads:
	- Functions that have side effects, but cannot be called by functions that don't have side effects themselves.
13) Objects: 
	- Program entities that encapsulate data and functionality.
# Chapter 2:
## Formal Languages:
1) Alphabet: 
	- Finite set of symbols denoted by $\Sigma$ 
2) String:
	- Combination of symbols/characters from an alphabet.
3) Empty String:
	- String of length zero. Denoted: $\epsilon$
4) Formal Language:
	- A set of strings. Subset of the Kleene closure on the alphabet. Each string is a "sentence".
5) Sentence:
	- A string from $\Sigma^*$ in $L$ 
6) Lexically Valid:
	- Property of sentence; all the strings in sentence are valid; the words exist in the relevant alphabet.
7) Syntactically Valid:
	- Property of sentence; lexically valid + ordering of the strings is valid.
8) Semantically Valid:
	- Property of sentence; lexically valid + syntactically valid + has a valid meaning.
9) Regular Expression:
	- Pattern representing strings of a language
10) Candidate Sentences:
	- Sentences apart of the kleene closure of the alphabet
## Regular Expressions & Regular Languages:
1) Regular Expression:
	- Pattern represented as a string that concisely and formally denotes the strings of a language.
2) 10) Meta-Language:
	- Language used to describe a language.
3) Regular Language: 
	- Formal language that can be denoted by a regular expression and recognized by a finite-state automaton.

## Grammars & Backus-Naur Form:
1) Formal Grammar:
	- Used to define formal language.
2) Backus-Naur Form:
	- A metalanguage defining grammars.
3) Chomsky Hierarchy:
	- Possessive classification of formal grammars used to describe the syntax of languages.