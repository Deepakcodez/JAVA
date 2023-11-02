import java.util.Scanner;



public class swithc {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter lucky number");
        int num = sc.nextInt();

        switch (num) {
            case 15:
                System.out.println("you win washing machine");
                break;
            case 18:
                System.out.println("you win car");
                break;
        
            default:
            System.out.println("oops try again!!!!!!!");
                break;
        }
    }
    
}
