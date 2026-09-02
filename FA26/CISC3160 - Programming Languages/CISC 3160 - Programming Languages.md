# 08/31/2026
### Binding Times 
1) Language Definition Time Binding:
	- Arbitrarily decided at language design.
	- Decides meaning (semantics)
2) Language Implementation Time:
	- Decides mechanism -- how to implement meaning in hardware.
	- Deferred sometimes, as platforms vary.
	- Some languages will make guarantees to avoid ambiguity -> sometimes a part of the language definition time binding.
3) Compile Time Binding:
	- Compiler binds an variable to its relevant type/data structure.
	- Checks to see if use of variable is valid, given type/data structure.
4) Link Time:
	- An identifier gets bound to implementation code (think writing header
	files in C++ and then implementation file.
5) Load Time: 
	- Loading the contents of the program into memory.
6) Run Time:
	- Identifiers are bound to specific values.
	- Most flexible binding--things decided when the program runs.

### Programming Paradigms/Styles:
1) Imperative:
	- von Neumann architecture:  
		- uniform representation of instructions and data in main memory.
	- Fetch-Decode-Execute cycle:
		1) Fetch: CPU retrieves the next instruction from memory (using program counter).
		2) Decode: instructions are interpreted (or compiled then interpreted).
		3) Execute: performs instructions from decoding step.
		4) go back to step 1
	- Use of assignment to modify the values of variables (abstractions of memory cells).
2) Functional :
	- Function-based programming.
	- Functions are first-class entities.
	- Programmer describes computation by calling series of function that cascade set of return values to each other.
	- Typically doesn't involve variables and assignment.
	- Side effects are usually absent from functional programming.
	- Recursion is a primary means of repetition.
	- Goal:
		- To bring programming closer to mathematics.
3) Object-Oriented :
	- Develops a solution to a problem as a collection of objects communicating by passing messages to each other.
	- Unifies concepts of data + procedural abstraction through the constructs of classes and objects.
	- Functional Programming's "closures" is a precursor to OOP
4) Logic/Declarative :
	- Programming that describes *what* is to be computed not *how*
	- Referred to as rule-based
	- Usually becomes less efficient as layers of abstraction takes away the ability to fine-tune program's finer details.
5) Bottom-up :
	- Solving a family of problems, by building a language around that family of problems
6) Synthesis :
	- Describes the combination of programming language paradigms/styles. (styles like functional working well with bottom-up)
7) Language Evaluation: 
8) Thought Process For Problem Solving:

### Expressions & Statements:
