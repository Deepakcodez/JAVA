abstract class Parent {
    public Parent() {
        System.out.println("i am constructor of Parent class");

    }

    public void msg() {
        System.out.println("msg from parent");
    }

    // declareation of abstract method which return nothingF
    abstract public void greet();

}

class parent2 extends Parent {
    @Override
    public void greet() {
        System.out.println("Good morning");
    }
}

abstract class parent3 extends Parent {
    public void msg2() {
        System.out.println("msg from parent 3");
    }
}

public class abstractClass {
    public static void main(String[] args) {

        parent2 obj1 = new parent2();
        // parent3 obj2 = new parent3();  not possible because it is also abstract class
        obj1.greet();

    }
}
