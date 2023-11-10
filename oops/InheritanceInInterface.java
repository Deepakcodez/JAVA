interface interface1{
    void method1();
    void method2();
} 
interface interface2 extends interface1{
    void method3();
    void method4();
}

class MySampleClass implements interface2{
    public void method1(){
        System.out.println("i am method 1");
    }
    public void method2(){
        System.out.println("i am method 2");
    }
    public void method3(){
        System.out.println("i am method 3");
    }
    public void method4(){
        System.out.println("i am method 4");
    }
}
public class InheritanceInInterface {
   public static void main(String[] args) {
    MySampleClass obj1 = new MySampleClass();
    obj1.method1();
    obj1.method2();
    obj1.method3();
    obj1.method4();
   }
}
