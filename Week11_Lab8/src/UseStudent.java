public class UseStudent {

    public static void main(String[] args) {

        System.out.println("Let's test the Student class now");
        Student myFirstStudent = new Student();
        System.out.println(myFirstStudent);

        myFirstStudent.setStudentName("Muhammad Ahsan Saleem");
        myFirstStudent.setGpa(4.0);
        myFirstStudent.setAge(18);
        System.out.println(myFirstStudent);

        Student mySecondStudent = new Student("Juliana Kim", 4.0, 18);
        System.out.println(mySecondStudent);

    }

} // end of the UseStudent class
