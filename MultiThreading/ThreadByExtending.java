
class mythreadClass1 extends Thread {
    @Override
    public void run() {
        int i = 0;
        while (i <= 2000) {
            System.out.println("thread1");
            i++;
        }
    }

}

class mythreadClass2 extends Thread {
       @Override
    public void run() {
        int i = 0;
        while (i <= 4000) {
            System.out.println("thread   2");
            i++;
        }
    }
}

public class ThreadByExtending {
    public static void main(String[] args) {
        
        mythreadClass1 obj1 = new mythreadClass1();
        mythreadClass2 obj2 = new mythreadClass2();
        obj1.start();
        obj2.start();

    }
}
