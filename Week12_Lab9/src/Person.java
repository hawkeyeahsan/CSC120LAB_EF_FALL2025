public class Person {

    // Data members
    private String name;
    private int age;

    public Person() {

        name = "";
        age = 0;

    } // end of the Person default constructor

    public Person(String name, int age) {

        this.name = name;
        this.age = age;

    }  // end of the Person constructor

    public String toString() {

        return name + " is " + age + " years old.";

    } // end of the toString getter method

    public void incrementAge() {

        age += 1;

    } // end of the incrementAge setter method

    public String getName() {

        return name;

    } // end of the getName getter method

    public int getAge() {

        return age;

    } // end of the getAge getter method

} // end of the Person class
