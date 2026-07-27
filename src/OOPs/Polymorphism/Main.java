package OOPs.Polymorphism;

public class Main {
    public static void main(String[] args) {
//        Calculator c = new Calculator();
//
//        System.out.println(c.add(2,3));
//        System.out.println(c.add(2,3,4));
//        System.out.println(c.add(2,3,4,5.6));

//        Circle c = new Circle(); //child class refer to parent class
//         doDrawingstuff(c); //upcast
//
//        Rectangle r = new Rectangle();
//        r.draw();
//
//        Shape s = new Shape();
//        s.draw();

        Circle circle = new Circle();
        doDrawingstuff(circle);

    }
    //dynamic dispatch
    public static  void doDrawingstuff( Shape s){
      s.draw();//polymorphic ,

        Circle circle = (Circle) s; //downcasting
        circle.draw();
    }
}
