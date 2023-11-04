public class method {

    // method
    static void firstMethod(){
        System.err.println("i am first method");
    }
    // parameterized method with return 
    static int add(int a, int b){
        return a +b;
    }
    //parametrized method without return
    static  void  mul(int a, int b){
        System.err.println(a*b);
    }

    public static void main(String[] args) {

        firstMethod();
        System.err.println(add(5,8));
        mul(5, 5);
        
    }
}
