

public class accessModifier {
    private int Id;
    private String Name;
    private int Sallery;

    public void setId(int id) {
        Id = id;
    }
    public void setname(String name) {
        Name = name;
    }
    public void setSallery(int sal) {
        Sallery = sal;
    }

    public void getData() {
        System.out.println("id : "+Id);
        System.out.println("Name : "+Name);
        System.out.println("sallery : "+Sallery);
        
    }

    public static void main(String[] args) {
        accessModifier emp1 = new accessModifier();
        emp1.setId(3);
        emp1.setname("Deepak");
        emp1.setSallery(80000);
        emp1.getData();

    }
}
