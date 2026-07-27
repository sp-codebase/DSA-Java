package OOPs.Encapsulation;

public class App {
    public static void main(String[] args) {
            //default constructor

//        Student A = new Student();
//        A.id = 1;
//        A.age = 14;
//        A.name = "Sonal";
//        A.nos = 5;
//        System.out.println(A.id);
//        System.out.println(A.age);
//        System.out.println(A.name);
//        System.out.println(A.nos);
//
//        A.bunk();
//        A.sleep();
//        A.sleep();

        //parameterised ctor

//        Student A  = new Student(12,"Sonal",1, 3);
//        System.out.println(A.id);
//        System.out.println(A.age);
//        System.out.println(A.name);
//       System.out.println(A.nos);
//
//        A.bunk();
//        A.sleep();
//        A.sleep();

        //copy constructor

//        Student A  = new Student(12,"Sonal",1, 3);
//        Student B  = new Student(A);
//        System.out.println(B.id);
//       System.out.println(B.age);
//       System.out.println(B.name);
//      System.out.println(B.nos);

        //object life cycle -> represents the entire duration of an object's existence inside the Java Virtual Machine (JVM), tracking it from initial memory allocation to final destruction

        //encapsulation

        Student c = new Student(12, "Sam", 2, 4 , "Tina"
        );
//        System.out.println("Age " + c.age);
        System.out.println("Name " + c.getname());
//        System.out.println("ID " + c.id);
//        System.out.println("NOS " + c.nos);


//        c.bunk();
//        c.study();
//        c.sleep();
        c.setage(240);
        System.out.println("Age " + c.getage());




    }
}
