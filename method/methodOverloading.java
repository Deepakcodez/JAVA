
public class methodOverloading {

    static int sum(int a, int b) {
        return a + b;
    }

    static float sum(float a, float b) {
        return a + b;
    }
      static double sum(double a, double b) {
        return a + b;
    }
      static long sum(long a, long b) {
        return a + b;
    }

    public static void main(String[] args) {
        System.err.println(sum(1,2));
        System.err.println(sum(3.4f,4.3f));
        System.err.println(sum(3.4d,4.3d));
        System.err.println(sum(3658l,46568l));
    }
}