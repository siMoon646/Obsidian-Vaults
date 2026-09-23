# Drawing Parse Trees

# Java Output:
## 1)
```
void main() {  
    int a = 1, b =2, c = 3;  
    if (a < b) if (b > c) a = b = c; else c = b = a;  
    IO.println(a + " " + b + " " + c);  
}
```

This has two `if`s but only one `else` — Java resolves this the same way as C/C++/most C-family languages: **an `else` always binds to the nearest preceding unmatched `if`**. So this is equivalent to:
```
if (a < b){
	if (b > c) {
		a = b = c;
	} else {
		c = b = a;
	}
}
```

Solving:
```
a = 1
b = 2
c = 3

a < b
1 < 2
true -> run conditional's body

b > c
2 > 3
false -> run else statement's body

c = b = a -> right-associative;
a = 1
b = 1
c = 1

output: 1 1 1
```
## 2)
```
void main() {   
    int a = 1, b = 2, c = 3;   
    if (a > b) if (b > c) a = b = c; else c = b = a; else c = a = b;  
    IO.println(a + " " + b + " " + c);   
}
```

Equivalent to:
```
if (a > b) {
	if (b > c){
		a = b = c;
	} else {
		c = b = a;
	}
} else {
	c = a = b;
}
```

Solving:
```
a = 1
b = 2
c = 3

a > b
1 > 2
false -> run else statement's body

c = a = b;
b = 2
a = 2
c = 2

output: 2 2 2
```