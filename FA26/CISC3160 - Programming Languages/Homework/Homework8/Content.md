# Overriding and Dynamic Binding:
``` Java
class A extends B {
    public void method1() { IO.print("a 1 "); }
}

class B extends C {
    public String toString() { return "b"; }
    public void method2() {
        IO.print("b 2 ");
        method1();
    }
}

class C {
    public String toString() { return "c"; }
    public void method1() { IO.print("c 1 "); }
    public void method2() { IO.print("c 2 "); }
}

class D extends B {
    public void method2() {
        IO.print("d 2 ");
        method1();
    }
}

public class PolymorphismMystery1 {
    void main() {
        C[] elements = {new A(), new B(), new C(), new D()};

        for (C element : elements) {
            IO.print(element + " ");
            element.method1();
            element.method2();
            IO.println();
        }
    }
}
```
## Output: 
```
b a 1 b 2 a 1
b c 1 b 2 c 1
c c 1 c 2 
b c 1 d 2 c 1
```