package Tugas2;

//Owner : BOY
class A{
    void callThis(){
        System.out.println("Inside Class A's method");
    }
}

class B extends A{
    @Override
    void callThis(){
        System.out.println("Inside Class B's method");
    }
}

class C extends A{
    @Override
    void callThis(){
        System.out.println("Inside Class C's method");
    }
}

public class DynamicDispatch {
    public static void main(String[] args) {
        A a = new A();
        B b = new B();
        C c = new C();
        
        A ref;
        ref = b;
        ref.callThis();
        
        ref = c;
        ref.callThis();
        
        ref = a;
        ref.callThis();
    }
}

