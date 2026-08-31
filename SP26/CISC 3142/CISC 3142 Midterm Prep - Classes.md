1) Which of the following correctly defines a class? 
    >class Example { };

2) What is the default access level for members of a class?
	>private

3) True/False: A class declaration ends with a semicolon.
	>true

4) True/False: The compiler automatically provides a destructor if none is defined.
	>true
	>#this is how things are deleted/dealloc from memory by default

5) Which constructor gets called from the following statement:
   Rectangle rect2(2,3);
   Assuming that the Rectangle constructor below is included:

   Rectangle(int width, int height) : width(width), height(height) {}
	>?

6) If no constructor is defined, the compiler:
	>Creates a default constructor automatically

7) The default constructor is called when:
	>An object is created with no arguments

8) What is constructor overloading?
	>Having two constructors with the same name but different parameters

9) In which case is a copy constructor not called?
	>Passing object by reference

10) How are member objects of a composed class initialized?
	>In the member initializer list

11) Which of the following is a parameterized constructor?
    >Rectangle(int w, int h) {}

12) True/False: You can overload constructors with different parameter lists.
    >true

13) What happens if a constructor does not explicitly initialize a member object in the initializer list?
    >Respective default constructor is called

14) Consider:
	` Length l1(12);
	` Length l2 = l1;
	  Which constructor is called for l2?
	>Copy constructor

15) True/False: A class can have multiple constructors with different parameter signatures.
    >true

16) Which of the following statements about constructors is true?
    >They have the same name as the class

17)  Consider the following code:
	`class Point { ... };
	`class Rectangle {
	`Point topLeft;
	`Point bottomRight;
	`};
	>?

18) The classes Rectangle and Point demonstrate:
    > Composition ||When an class contains objects from another class||

19) Which is the correct syntax to initialize composed objects in a member initializer list?
    >`Rectangle() : topLeft(Point()), bottomRight(Point()) {}

20) True/False: Member objects of composed classes can only be initialized in the constructor body.
    >false

21) True/False: Composition is a “has-a” relationship in OOP.
	>true

22) If a Rectangle class contains two Length objects and it does not contain a copy constructor, what happens if you initialize one Rectangle to another?
    >Length copy constructor gets called
    >#When you don't define a copy constructor, the compiler generates one automatically. The compiler-generated copy constructor performs a member-wise copy -- meaning it calls the copy constructor of each member object 

23) Which is the recommended way to initialize member objects in C++?
    >Use member initializer list

24) The member initializer list executes:
    >Before the constructor body

25) Given:
	`Rectangle r1(Length(4), Length(5));
	`Rectangle r2 = r1;
	 Which constructor is invoked for **r2**?
	>Copy constructor

26) True/False: The compiler automatically generates a copy constructor if none is defined.
    >true

27) Which of the following statements invokes the copy constructor?
    >Initializing one object from another

28) True/False: Copy constructors are only called for stack-allocated objects.
    >false

29) Which situation does NOT call a copy constructor?
    >Passing by reference

30) When is the copy constructor invoked?
    >All of the above

31) What happens if you do not define a copy constructor?
    >Compiler provides a default one

32) Which of the following statements correctly invokes a copy constructor?
	`Rectangle r2 = r1;

33) True/False: A copy constructor can take a const reference parameter.
    > true

34) True/False: The default copy constructor performs a member-wise copy.
    >true

35) True/False: If a class contains only primitive types, the default copy constructor is usually sufficient.
    >true

36) What is the correct syntax to create a Rectangle object on the heap?
    >Rectangle* rect = new Rectangle();
    >#'new' returns the memory address of the object

37) Which syntax creates a temporary Point object on the stack to pass to a Rectangle constructor?
    >Rectangle r(Point(2,3));

38) Which operator is used to access a member through a pointer?
    >->

39) True/False: Objects created with new must be deleted using delete to avoid memory leaks.
    >true

40) What happens if you forget to delete a heap-allocated object?
    >Memory leak

41) True/False: Dereferencing a nullptr causes a runtime error.
    >true

42) How do you access a member function of a heap object pointed to by ptr?
    >ptr->member()

43) Which statement correctly deletes a dynamically allocated object pointed to by obj?
    >delete obj;

44) The following function appears in Rectangle.cpp. What is the error with this code?
    `double area(){
	``	return width.getInches() * height.getInches();
	`}
	>it is missing the scope resolution in the name Rectangle::

45) True/False: A class can contain another class as a member.
    >true

46) True/False: Copy constructors can accept objects by value.
    >false
    >#otherwise, it passing the param would require a copy which would then need a copy and so on -> infinite loop.

47) True/False: You can have multiple default constructors.
    >false

48) True/False: A member function declared const cannot modify member variables.
    >true
	>#const member functions are meant to treat all member variables within it as const

49) True/False: Arrays can be member variables of a class.
    >true

50) True/False: Using new allocates memory on the stack.
    >false

51) True/False: Member initializer lists improve efficiency for objects.
    >true

52) True/False: An object created on the heap persists after function returns only if pointer is returned.
    >false

53) True/False: Deleting a nullptr is safe and does nothing.
    >true (at least nothing dangerous)

54) True/False: Using -> on a stack object is valid.
    >false

55) True/False: Returning a local object by value calls the copy constructor.
    >false

56) True/False: Member functions can be implemented inline in the header file.
    >true

57) True/False: The compiler will automatically create a default constructor if none exists.
    >true

58) True/False: The scope resolution operator :: can be used to define a member function outside the class.
    >true

59) True/False: Static member variables are shared by all instances of a class.
    >true

60) True/False: Inline functions can improve performance for small functions.
    >true

61) True/False: Member objects can be initialized in the constructor body instead of initializer list
    >true

