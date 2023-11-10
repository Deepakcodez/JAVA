interface flyable{
    int a=4;
    void fly();
}
interface swimable{
    int a =5;
    void swim();
}
class Bird implements flyable,swimable{
    int a=2;
     public void fly(){
        System.out.println("bird can fly");
        System.out.println(a);
        System.out.println(swimable.a);
        System.out.println(flyable.a);
     }
     public void swim(){
        System.out.println("bird can swim");
     }
}
public class Interfaces {

    public static void main(String[] args) {
        Bird bird1 = new Bird();
        bird1.fly();
        bird1.swim();
    }
    
}
