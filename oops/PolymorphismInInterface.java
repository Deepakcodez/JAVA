class CellPhone {
    void call() {
        System.out.println("calling....");

    };

    void msg() {
        System.out.println("sending message....");
    }

    void pickCall() {
        System.out.println("connecting...");
    }
}

interface wifi {
    void internet();
}

interface camera {
    void takeSnap();
}

class SmartPhone extends CellPhone implements wifi, camera {
 

    public void takeSnap() {
        System.out.println("taking snap.....");
    }

    public void internet() {
        System.out.println("conneting to wifi..");
    }
}

public class PolymorphismInInterface {

    public static void main(String[] args) {

        camera cam = new SmartPhone();
        wifi net = new SmartPhone();
        SmartPhone myPhone = new SmartPhone();
        cam.takeSnap();
        net.internet();
        myPhone.call();
        myPhone.internet();
        myPhone.pickCall();
        myPhone.msg();
        myPhone.takeSnap();
        
    }

}
