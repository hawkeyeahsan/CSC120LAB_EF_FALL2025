public class Family {

    // Data members
    private static final int MAX_PEOPLE = 10;
    private Person[] familyMembers;
    private int familySize;

    public Family() {

        familyMembers = new Person[MAX_PEOPLE];
        familySize = 0;

    } // end of the Family default constructor

    public void display() {

        int index;
        for (index = 0; index < familySize; index++) {
            System.out.println(familyMembers[index]);
        }

    } // end of the display method

    public boolean addPerson(String name, int age) {

        if (familySize >= MAX_PEOPLE) {
            return false;
        }
        else {
            familyMembers[familySize] = new Person(name, age);
            familySize += 1;
            return true;
        }

    } // end of the addPerson method

    public void birthday(String name) {

        int index;
        for (index = 0; index < familySize; index++) {

            if (familyMembers[index].getName().equals(name)) {
                familyMembers[index].incrementAge();
            }

        } // end of the for loop

    } // end of the birthday method

    public int getNumberOfPeople() {

        return familySize;

    } // end of the getNumberOfPeople method

    public int getTotalAge() {

        int totalAge = 0;
        int index;
        for (index = 0; index < familySize; index++) {
            totalAge += familyMembers[index].getAge();
        }

        return totalAge;

    } // end of the getTotalAge method

} // end of the Family class
