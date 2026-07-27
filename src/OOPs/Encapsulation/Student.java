package OOPs.Encapsulation;

public class Student {
    //Attributes
    private int age;
    private String name;
    private int id;
    private int nos;
    //encapsulation
    private String gf;

    public String getname (){
        return this.name;
    }

    public int getid (){
        return this.id;

    }

   public int setage (int a){
        //extra layer of authentication
       if (a < 100) {
           this.age = a;
       } else {
           System.out.println("Invalid age");
       }
       return this.age;
    }
    public int getage(){
        return this.age;
    }

    //default constructor-set the attrtibute sof student//default -> garbage
    public Student() {
        System.out.println("Student constructor");
    }
    //parameterized constructor
    public Student(int age, String name, int id, int nos, String gf) {
        System.out.println(" Parameterised Student constructor");
        this.age = age;//main se jo age aa rha h
        this.name = name;
        this.id = id;
        this.nos = nos;
        this.gf = gf;
    }

    //copy const
    public Student(Student srcobj) {//scroll -> a
        System.out.println(" copy constructor");
        this.age = srcobj.age;//main se jo age aa rha h
        this.name = srcobj.name;
        this.id = srcobj.id;
        this.nos = srcobj.nos;
    }

    //Methods / Behaviours
    public void study(){
        System.out.println(name +"studying");
    }

    public void sleep(){
        System.out.println(name +"sleeping");
    }

    public void bunk(){
        System.out.println(name +"bunking");
    }

    private void gfchat(){
        System.out.println(name +"gfchatting");
    }


}
