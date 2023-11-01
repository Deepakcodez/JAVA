import java.util.Scanner;

public class useInput {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of num1");
        int num1 = sc.nextInt();
        System.out.println("Enter the value of num2");
        int num2 = sc.nextInt();
        int sum = num1 + num2;
        System.out.println("Addion of num1 and num2 is" + sum);

        System.out.println("Enter only number");
        boolean b1 = sc.hasNextInt();
        System.out.println(b1);
        
        System.out.println("Enter  sentence");
        String s1 = sc.next();
        System.out.println(s1);
        System.out.println("Enter  sentence again");
        String s2 = sc.nextLine();
        System.out.println(s2);
        

    }
}
