public class Person {
    public int getAge() {
        return age;
    }

    private int age;

    public Person(String n, int a){
        this.name = n;
        this.age = a;

    }

    public String getName() {

        return name;
    }

    public void setName(String name) {

        this.name = name;
    }

    private String name;


}
