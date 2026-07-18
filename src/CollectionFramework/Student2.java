package CollectionFramework;

public class Student2 implements Comparable<Student2> {
    public String name;
    public int weight;
    public int age;

    public Student2(int age, String name, int weight) {
        this.name = name;
        this.age = age;
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Student2{" +
                "name='" + name + '\'' +
                ", weight=" + weight +
                ", age=" + age +
                '}';
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getWeight() {
        return weight;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    @Override
    public int compareTo(Student2 that) {

        //this mehod is called for current object
        //we will define our sorting logic here
        //sort basis on age
        if(this.weight == that.weight){
            return this.name.compareTo(that.name);
        }
        return this.age - that.age;
    }
}
