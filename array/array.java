public class array {
    public static void main(String[] args) {

        String[] names = { "Deepak", "karan", "muskan", "vijay", "param" };
        System.err.println(names[2]);

        System.out.println(names.length);

        // iterate array bu loop
        for (int i = 0; i < names.length; i++) {
            System.err.println(names[i]);
        }
    }
}
