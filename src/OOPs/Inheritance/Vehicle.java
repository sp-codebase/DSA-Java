package OOPs.Inheritance;

public class Vehicle {
     public String name;
     public String model;
     public int noOfTyres;

    Vehicle(){
        this.name = "";
        this.model = "";
        this.noOfTyres = -1;
    }


    Vehicle(String name, String model , int noOfTyres){
        this.name = name;
        this.model = model;
        this.noOfTyres = noOfTyres;
    }


    void startEngine(){
      System.out.println("Starting Engine of..."  );
        System.out.println("Name : " + name);
        System.out.println("Model : " + model );
        System.out.println("No of Tyres : " + noOfTyres);


    }

    void stopEngine(){
      System.out.println("Stopping Engine of" +name+ ":" +model );
    }


}
