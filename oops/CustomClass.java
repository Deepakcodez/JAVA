
public class CustomClass {
    public class Emp {
        String Name;
        int Id;

        public void printinfo() {
            System.out.println("Name of emp is :" + Name);
            System.out.println("Id of emp is :" + Id);
        }
    }

        public static void main(String[] args) {
            CustomClass customClass = new CustomClass();
            Emp emp1 = customClass.new Emp();
            emp1.Name = "Deepak";
            emp1.Id = 1;
            emp1.printinfo();

        }

    

}
