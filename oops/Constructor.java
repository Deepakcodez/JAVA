class empInfo {
    public int Id;
    public String Name;

    // constructor
    public empInfo() {
        Id = 101;
        Name = "Deepak";
    }

    // constructor overloading
    public empInfo(String name) {
        Id = 102;
        Name = name;
    }

    // getter 
    public void getInfo() {

        System.out.println(Id);
        System.out.println(Name);

    }

}

public class Constructor {

    public static void main(String[] args) {
        empInfo emp1 = new empInfo();
        empInfo emp2 = new empInfo("karan");
        emp1.getInfo();
        emp2.getInfo();

    }

}
