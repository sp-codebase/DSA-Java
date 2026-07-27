package OOPs.Polymorphism;

public class Circle extends Shape  {

          @Override //runtime decide
          public void draw(){
              System.out.println("Circle drawing..");
          }


}
