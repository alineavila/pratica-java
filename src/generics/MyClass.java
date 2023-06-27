package generics;

public class MyClass<T, V>{
    T ob1;
    V ob2;

    MyClass(T ob1, V ob2) {
        this.ob1 = ob1;
        this.ob2 = ob2;
    }

    void imprimeTipo(){
        System.out.println(this.ob1.getClass().getName());
        System.out.println(this.ob2.getClass().getName());
    }
}
