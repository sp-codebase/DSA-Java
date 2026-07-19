package OOPs.Inheritance;

public class Car extends Vehicle {
    public int noOfDoors;
    public String transmissionTypes;

    Car(String name , String model ,int noOfTyres, int noOfDoors , String transmissionTypes){
        super(name, model, noOfTyres);
        this.noOfDoors = noOfDoors;
        this.transmissionTypes = transmissionTypes;
//        super.startEngine();
//        super.stopEngine();
    }
    public void startAC(){
        System.out.println("Start AC" + name);
    }

//    public static void main(String[] args){
//        Car c = new Car("Maruti", "880", 4 , 4, "Auto");
//        c.startEngine();
//        c.stopEngine();
//        c.startAC();
//    }

}
