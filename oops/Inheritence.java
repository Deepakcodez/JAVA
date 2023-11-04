public class Inheritence {
    public class Vehicles{
      public String sound; 
      public void getData(){
        System.out.println( sound);
      }
}
  public class Car extends Vehicles{}

      public static void main(String[] args) {
          Inheritence inheri = new Inheritence();
          Car myCar = inheri.new Car() ;
          myCar.sound="hooooooooo";

          myCar.getData();
          
      }
  }