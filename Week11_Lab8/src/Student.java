public class Student {

    // DATA MEMBERS
    private String studentName;
    private double gpa;
    private int age;

    // Constructor
    public Student () {

        studentName = "NO NAME HAS BEEN ASSIGNED YET";
        gpa = 0.0;
        age = 0;

    }

    public Student(String studentName, double gpa, int age) {
        this.studentName = studentName;
        this.gpa = gpa;
        this.age = age;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public double getGpa() {
        return gpa;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "studentName='" + studentName + '\'' +
                ", gpa=" + gpa +
                ", age=" + age +
                '}';
    }

} // end of the Student class
