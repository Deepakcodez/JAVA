
public class recursion {

    static int counter = 0;

    static void mymethod() {

        counter++;
        if (counter <= 10) {
            System.err.println("hello java");
            mymethod();
        }
    }

    public static void main(String[] args) {

        mymethod();

    }
}
