
1) Which operator is used to get the memory address of a variable?
   >&

2) Which operator can be used to dereference a pointer?
   >\*

3) What does a pointer store?
   >The address of a variable

4) What is the output of the following?
	`int x = 10;
	`int` *p = &x;
	`cout << *p;
	>10

5) What is the type of &x if x is an int?
   >int\*

6) Which of the following initializes a null pointer?
	>int \*p = 0; 
	>int \*p = nullptr; 
	>int \*p = NULL;

7) What happens when you dereference an uninitialized pointer?
   >Undefined behavior
   
8) Which of these statements correctly assigns ptr2 to point to the same address as ptr1?
   >ptr2 = ptr1;

9) True or False: A pointer must always be initialized before use.
   >true
   
10) If int \*p; is declared but never initialized, what does p contain?
    >junk

11) Which operator is used to allocate dynamic memory in C++?
	>new

12) Which operator is used to deallocate dynamic memory allocated with new?
    >delete

13) Consider int \*p = new int;. How do you release this memory?
    >delete p

14) What happens if you forget to delete dynamically allocated memory?
    >Memory leak

15) Which is correct for deleting a dynamically allocated array?
    >delete[] arr;

16) When should you set a pointer to nullptr?
    >After deleting
    
17) True or False: You can use both new and free() in the same program safely.
    >false

18) What is the type of new int\[10\]?
    >int*

19) The keyword new allocates memory on the:
    >Heap

20) True or False: Dynamically allocated memory persists until the program ends or it is explicitly deleted.
    >true

21) What does p++ do for a pointer p?
    >Increments address by size of the pointed type

22) What will \*(arr + i) produce?
    >The value of element i

23) True or False: Pointer arithmetic is allowed only on arrays or dynamically allocated sequences.
    >true

24) If int arr[]{10,20,30}; int \*p = arr;, then *(p + 1) gives:
    >20

25) N/A
26) N/A
27) What is the result of comparing pointers p < q when both point inside the same array?
    >true if p precedes q

28) True or False: You can safely add two pointers together.
    >false

29) What is the value of p - arr when p points to arr[3]?
    >b) 3
    >#this is the logical distance between the two

30) Which of the following prints all elements using a pointer as an iterator?
    >for (int \*p = arr; p < arr + size; ++p) cout << \*p;

31) Which of the following is a proper array parameter declaration?
    >int arr\[]
    >int \*arr

32) True or False: Array parameters are automatically passed by reference.
    >false

33) In a function void f(int \*p), changes to \*p affect:
    >The original variable

34) When should a function return a pointer to dynamic memory?
    >When the object must outlive the function

35) Where should delete be called for memory allocated in a function?
    >When the memory is no longer needed

36) What happens if you use a pointer after deleting it?
    >Undefined behavior

37) True or False: Setting a pointer to nullptr after delete prevents dangling pointers.
    >true

38) Which condition safely checks if a pointer is valid before dereferencing?
    >f (ptr != nullptr)
    >if (ptr)

39) What does this code do?
    `int *p = nullptr;
	`if (p) *p = 5;
	>Skips assignment safely

40) True or False: You can delete a pointer that was never allocated with new.
    >false

41) Which operator accesses a member through a pointer to an object?
    >->

42) What is equivalent to sptr->size()?
    >(\*sptr).size()

43) If string \*sptr = &s;, then \*sptr is:
    >String object s

44) True or False: The -> operator automatically dereferences a pointer before accessing a member.
    >true

45) Which of these correctly declares a pointer to a string object?
    >string\* s
    >string \*s

46) In C++, a string literal like "hello" is of type:
    >const char*

47) What character marks the end of a C-string?
    >'\0'

48) Which function is used to get the length of a C-string?
    >strlen()

49)  True or False: The array name of a char array acts as a pointer to its first element.
    >true