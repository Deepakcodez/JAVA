import java.util.Scanner;

public class ifelse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter your age");
        int age = sc.nextInt();
        if(age>18){
            System.out.println("you can drive");
        }
        else if(age<18 && age>10){
            System.out.println("you can not drive till 18");
        }
        else{
            System.out.println("you are child");
        }
    }
    
}
