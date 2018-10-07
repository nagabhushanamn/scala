package example;

public class JPerson {
    // state
    private String name;
    private int age;

    // constructor
    public JPerson(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // accessor methods ( set/writer & get/reader )
    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setAge(int age) {
        if (age < 0) throw new IllegalArgumentException("invalid age");
        this.age = age;
    }

    public int getAge() {
        return age;
    }

}
