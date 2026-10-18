# ExprLang Expressions
Below are some valid expressions in ExprLang, the simple expression language discussed in class. For each expression, write:

1. The list of tokens produced by the Scanner.
2. The AST given by the Parser (you may draw a tree, or write it in the format produced by the stringify(Expr) method from class). 
3. The result printed by the Interpreter.
   
	1. 42
	- Tokens: [NUMBER 42, EOF]
	- AST: 42.0
	- Result: 42.0
	
	2. 1-2+3
	- Tokens: [NUMBER 1, MINUS -, NUMBER 2, PLUS +, NUMBER 3, EOF]
	- AST: (+ (- 1.0 2.0) 3.0)
	- Result: 2.0
	
	3. 1+2-3
	- Tokens: [NUMBER 1, PLUS +, NUMBER 2, MINUS -, NUMBER 3, EOF]
	- AST: (- (+ 1.0 2.0) 3.0)
	- Result: 0.0
	
	4. 1\*2+3
	- Tokens: [NUMBER 1, STAR \*, NUMBER 2, PLUS +, 3, EOF]
	- AST: (+ (\* 1.0 2.0) 3.0)
	- Result: 5.0
	
	5. 1+2\*3
	- Tokens: [NUMBER 1, PLUS +, NUMBER 2, STAR \*, NUMBER 3, EOF]
	- AST: (+ 1.0 (* 2.0 3.0))
	- Result: 7.0
	
	6. 1-(2-3)
	- Tokens: [NUMBER 1, MINUS -, LEFT_PAREN (, NUMBER 2, MINUS -, NUMBER 3, RIGHT_PAREN, EOF]
	- AST: ( - 1.0 (- 2.0 3.0))
	- Result: 2.0
	
	7. (1+2)\*3
	- Tokens: [LEFT_PAREN (, NUMBER 1, PLUS +, NUMBER 2, RIGHT_PAREN ), STAR \*, NUMBER 3, EOF]
	- AST: (\* (+ 1.0 2.0) 3.0)
	- Result: 9.0
	
	8. -1---2
	- Tokens: [MINUS -, NUMBER 1, MINUS -, MINUS -, MINUS -, NUMBER 2]
	- AST: (- (- 1.0) (- (- 2.0)))
	- Result: -3.0
	
	9. 1 + **2 * 3** - **10 / 5** - -6 + **7 * 8 / 4**
	- Tokens: [NUMBER 1, PLUS +, STAR \*, NUMBER 3, MINUS -, NUMBER 10, SLASH /, NUMBER 5, MINUS -, MINUS -, NUMBER 6, PLUS +, NUMBER 7, STAR \*, NUMBER 8, SLASH /, NUMBER 4]
	- AST: (+ (- (- (+ 1.0 (\* 2.0 3.0)) (/ 10.0 5.0)) (- 6.0)) (/ (\* 7.0 8.0) 4.0))
	- Result: 25.0

# Scheme Expressions
For each Scheme expression below, write the value that results when the expression is evaluated. If an error occurs, state the error, which should be one of the following:
- Expected a procedure
- Incorrect number of arguments 
- Undefined identifier.
## Set 1
Assume the following definitions
(define a 3)
(define b (+ a 1))
1. 42
    - `42`
2. b
    - `4`
3. (+ 5 3 4)
    - `12`
4. (+ 3)
    - `3`
5. (+)
    - `0`
6. (\*)
    - `1`
7. (- 9 1)
    - `8`
8. (- 9)
    - `-9`
9. -9
    - `-9`
10. (-9)
    - `Expected a procedure`
11. (/ 6 2)
    - `3`
12. (+ (* 2 4) (- 4 6))
    - `6`
13. (+ a b (* a b))
    - `19`
14. (= a b)
    - `#f`
15. (if (and (> b a) (< b (* a b))) b a)
    - `4`
16. (cond ((= a 4) 6) ((= b 4) (+ 6 7 a)) (else 25))
    - `(cond ((= a 4) 6) ((= b 4) (+ 6 7 a)) (else 25))`
    - `(cond ((#f) 6) ((#t) (+ 6 7 3)) (else 25))`
    - `16`
17. (+ 2 (if (> b a) b a))
	- `(+ 2 (if (> b a) b a))`
	- `(+ 2 (if (#t) 4 3))`
	- `(+ 2 4)`
	- `6`
18. (* (cond ((> a b) a) ((< a b) b) (else -1)) (+ a 1))
	- `(* (cond ((> a b) a) ((< a b) b) (else -1)) (+ a 1))`
	- `(* (cond ((> 3 4) 3) ((< 3 4) 4) (else -1)) (+ 3 1))`
	- `(* (cond ((#f) 3) (#t) 4) (else -1)) 4)`
	- `(* 4 4)`
	- `16`
## Set 2
1. (lambda (x) (/ x 1024))
    - `#<procedure>`
2. ((lambda (x) (/ x 1024)) 4096)
    - `4`
3. (lambda () 1)
    - `#<procedure>`
4. ((lambda () 1))
    - `1`
5. ((lambda () 1) 5)
    - `Errror: Incorrent number of arguments`
6. (lambda (y z) (+ z y))
	- `#<procedure>`
7. ((lambda (y z) (+ z y)) 5 4)
    - `9`
8. ((lambda (y z) (+ z y)) x 7)
	- `Error: Undefined identifier`

## Set 3
Assume the following definitions:
(define x 1)
(define y -1)
(define foo (lambda (a b) (+ a b)))
(define bar (lambda (x) x))
(define baz (lambda () 1))
(define quux (lambda (p) (foo p 5)))
1. x 
    - `1`
2. foo 
    - `#<procedure>`
3. (foo 1 2) 
    - `(+ 1 2)`
    - `3`
4. (foo 1) 
    - `Error: Incorrect number of arguments`
5. (foo) 
    - `Error: Incorrect number of arguments`
6. (baz) 
	- `1`
7. (bar 10) 
    - `10`
8. (quux (foo (baz) (bar y)))
	- `(quux (foo 1 (bar -1)))`
	- `(quux (foo 1 -1))`
	- `(quux 0)`
	- `(foo 0 5)`
	- `(+ 0 5)`
	- `5`

## Writing Scheme
1. Translate the following arithmetic expression to an equivalent one in Scheme:
![[Pasted image 20261017082321.png]]
- `(/ (+ 5 4 (- 2 (- 3 (+ 6 (/ 4 5))))) (* 3 (- 6 2) (- 2 7)))`

2. Scheme offers the following syntactic sugar for defining procedures. 
   Instead of writing `(define f (lambda (args) body))` you may write `(define (f args) body)`.
   For each definition below, write an equivalent definition that doesn’t explicitly use lambda.
	- `(define foo (lambda (a b) (+ a b)))`
		- `(define (foo a b) (+ a b))`
	- `(define bar (lambda () 1))`
		- `(define (bar) 1)`

3. Describe the behavior of the following Scheme procedure, g. Assume that a and b are numbers.
``` scheme
(define (g a b)
	((if (> b 0)
		+
		-)
	a b)
)
```
- procedure `g` always returns `a + |b|`.

4. Define the following simple procedures in Scheme.
	- (my-abs x): returns the absolute value of number x. (Here, don’t use the built-in (abs x) procedure, which my-abs mimics.)
	- (signum x): returns -1 if x is negative, 1 if x is positive, 0 otherwise. Assume x is a number.
	- Define a procedure (square x) that returns x2. Then define a procedure (sum-of-squares x y) that returns x2 + y2 using the (square x) procedure you just defined. Then define a procedure that takes three numbers as arguments and returns the sum of the squares of the two larger numbers using the (sum-of-squares x y) procedure. Tip: experiment to determine the behavior of the <= procedure when it is passed more than two numbers as arguments; for example, what does (<= 4 6 11) evaluate to?
- (my-abs x):
``` scheme
(define (my-abs x) ((if (> x 0) + -) 0 x))
```
- (signum x):
``` scheme
(define (signum x) (cond ((> x 0) 1) ((< x 0) -1) (else 0)))
```
- (square x):
``` scheme
(define (square x) (* x x))
```
- (sum-of-squares x y)
``` scheme
(define (sum-of-squares x y) (+ (square x) (square y)))
```
- (big-func x y z)
``` scheme
(define (big-func x y z)
  (cond
    ((and (<= x y) (<= x z)) (sum-of-squares y z))   ; x is smallest
    ((and (<= y x) (<= y z)) (sum-of-squares x z))   ; y is smallest
    (else                    (sum-of-squares x y)))) ; z is smallest
```

## Scheme Pairs & Lists
## Set 3
Given the following definition:
`(define z (cons (cons 1 2) 4))`
What will the following expressions evaluate to? If there’s an error, say so.
1. z
	- `((1 . 2) . 4)`
2. (car (car z))
    - `1`
3. (cdr (car z))
    - `2`
4. (car (cdr z))
    - Error
5. (cdr (cdr z))
	- Error

Given the following definition:
`(define L '((1 2 3) (4 5) 6 7))`
What will the following expressions evaluate to?
1. (car L)
    - `(1 2 3)`
2. (cdr L)
	- `((4 5) 6 7)`
3. (cdr (cdr L))
    - `(6 7)`
4. (cdr (cdr (cdr L)))
    - `(7)`
5. (car (car L))
    - `1`
6. (car (car (cdr L)))
    - `4`
7. (car (cdr (car L)))
    - `2`
8. (car (cdr (cdr L)))
    - `6`
9. (car (cdr (cdr (cdr L))))
    - `7`
10. (car (cdr (cdr (car L))))
	- `3`

## Set 5
Write expressions using car and cdr that will return 4 when the name L is bound to the following values:
1. (7 6 5 4 3 2 1)
``` scheme
(cdr L) ; (6 5 4 3 2 1)
(cdr (cdr L)) ; (5 4 3 2 1)
(cdr (cdr (cdr L))) ; (4 3 2 1)
(car (cdr (cdr (cdr L)))) ; 4
```
2. ((7) (6 5 4) (3 2) 1)
``` scheme
(cdr L) ; ((6 5 4) (3 2) 1)
(car (cdr L)) ; (6 5 4)
(cdr (car (cdr L))) ; (5 4)
(cdr (cdr (car (cdr L)))) ; (4)
(car (cdr (cdr (car (cdr L))))) ; 4
```
3. (7 (6 (5 (4 (3 (2 (1)))))))
``` scheme
(cdr L) ; ((6 (5 (4 (3 (2 (1)))))))
(car (cdr L)); (6 (5 (4 (3 (2 (1))))))
(cdr (car (cdr L))); ((5 (4 (3 (2 (1))))))
(car (cdr (car (cdr L))); (5 (4 (3 (2 (1)))))
(cdr (car (cdr (car (cdr L)))); ((4 (3 (2 (1)))))
(car (cdr (car (cdr (car (cdr L))))); (4 (3 (2 (1))))
(car (car (cdr (car (cdr (car (cdr L)))))) ; 4
```
4. (7 ((6 5 ((4)) 3) 2) 1)
``` scheme
(cdr L) ; (((6 5 ((4)) 3) 2) 1)
(car (cdr L)) ; ((6 5 ((4)) 3) 2)
(car (car (cdr L))) ; (6 5 ((4)) 3)
(cdr (cdr (car (car (cdr L))))) ; (((4)) 3)
(car (car (car (cdr (cdr (car (car (cdr L)))))))) ; 4
```

## Procedures on lists
Rewrite the list functions of HW 1 as Scheme procedures. Ignore the first function, concat. Assume the lists contain only integers. 
Note: the following are the only built-in procedures you may use here:
- `(null? obj)`
- `(car L)` and `(cdr L)`, where `L` is a list
- `(length L)`, where `L` is a list
- `(= n1 n2) `and `(<= n1 n2)`, where `n1` and `n2` are numbers
You may also use the special forms `and` and `or`, and of course `define`, `if`, and `cond`.
``` scheme
(define (contains? L e)
	(if (null? L)
		#f
		(or (= (car L) e) (contains? (cdr L) e))))

(define (contains-duplicate? L)
	(if (null? L)
		#f
		(or (contains L (car L)) (contains-duplicate?(cdr L)))))

(define (contains-consecutive-duplicate? L)
	(if (<= (length L) 1)
		#f
		(or (= (car L) (car (cdr L))) (contains-consecutive-duplicate? (cdr L)))))

(define (sorted? L)
	(if (<= (length L) 1)
		#t
		(and (<= (car L) (car(cdr L))) (sorted? (cdr L)))))

(define (equals? L1 L2)
  (cond
    ((and (null? L1) (null? L2)) #t)
    ((or  (null? L1) (null? L2)) #f)
    (else (and (= (car L1) (car L2))
        (equals? (cdr L1) (cdr L2))))))
```