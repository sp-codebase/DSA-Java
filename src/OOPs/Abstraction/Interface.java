package OOPs.Abstraction;

public class Interface {
// all the methods are implicitly public
    interface Bird {
        void fly();
        void eat();
        default void sleep(){
            System.out.println("Sleeping");
        }

    void walk();
}

    interface Walker {
        int legs = 4;
        void walk();

    }

    static class Sparrow implements Bird {
        @Override
        public void fly() {
            System.out.println("Sparrow flying");
        }

        @Override
        public void eat() {
            System.out.println("Sparrow eating");
        }

        @Override
        public void walk() {

            int a = Walker.legs;
            System.out.println("Sparrow walking");

        }

    }
    class Crow implements Bird, Walker {

        @Override
        public void fly() {
            System.out.println("Crow flying");
        }

        @Override
        public void eat() {
            System.out.println("Crow eating");
        }

        @Override
        public void walk() {

        }
    }

    public static void main(String[] args) {
        Sparrow s = new Sparrow();
        s.eat();
        s.fly();
        s.sleep();
        s.walk();

    }
}
