import java.util.Scanner;

public class stringMethods {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter word");
        String word = sc.nextLine();
        System.out.println(word);

        // string methods
        // length
        int length = word.length();
        System.out.println(length);

        // lowercase
        String tolower = word.toLowerCase();
        System.out.println(tolower);

        // uppercase
        String toupper = word.toUpperCase();
        System.out.println(toupper);

        // trim -- remove extra space
        String word2 = "  Ram ";
        String TrimWord = word2.trim();
        System.out.println(TrimWord);

        // substring
        String word3 = "java is a fun lang";
        String word4 = "Deepak";
        String substringword = word3.substring(2);
        String substringword2 = word4.substring(2, 4);
        System.out.println(substringword);
        System.out.println(substringword2);

        // startsWith true/false
        String word5 = "Ram";
        System.out.println(word5.startsWith("R"));

        // endswith
        System.out.println(word5.endsWith("R"));

        // charAt
        System.out.println(word5.charAt(2));

        // indexOf
        System.out.println(word5.indexOf("a"));

        // replace
        String word6 = "Development";
        System.out.println(word6.replace("ve", "rg"));

    }

}
