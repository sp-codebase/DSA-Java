package OOPs.Inheritance;

public class Motorcycle extends Vehicle {

   public String handleBarStyle;
   public String suspensionTypes;
   Motorcycle(String name, String model, int noOfTypes, String handleBarStyle, String suspensionTypes){
       super(name, model, noOfTypes);
       this.handleBarStyle = handleBarStyle;
       this.suspensionTypes = suspensionTypes;
   }
   public void wheelie(){
       System.out.println("wheelie" + name);
   }

}
