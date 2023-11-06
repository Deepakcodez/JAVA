class ParentClass {

    int x = 2;

    public int getter() {
        return x;
    }

    public void msg() {
        System.err.println("I am method of parent class called msg");
    }
}

class Child extends ParentClass {
    @Override
    public void msg() {
        System.err.println("I am method of child class called msg");

    }
}

public class MethodOverriding {

    public static void main(String[] args) {
        ParentClass obj1 = new ParentClass();
        Child obj2 = new Child();
        obj1.msg();
        obj2.msg();

    }
}
