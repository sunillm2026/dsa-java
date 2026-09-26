package strivers_60_Days;

class Student {
    int rollNo;
    String name;
    int admissionNum;

    public Student(int rollNo, String name, int admissionNum) {
        this.rollNo = rollNo;
        this.name = name;
        this.admissionNum = admissionNum;
    }
    public Student(String name, int admissionNum) {
        this.name = name;
        this.admissionNum = admissionNum;
    }
    public Student(String name) {
        this.name = name;
    }
    public void displayDetails() {
        System.out.println("rollNo: " + rollNo);
        System.out.println("name: " + name);
        System.out.println("admissionNum: " + admissionNum);
    }
}
class Day30_P1_Constructors_overloading {
    public static void main(String[] args) {
        Student s1 = new Student(1, "Sunil", 2121212);
        Student s2 = new Student("shashi", 23232323);
        Student s3 = new Student("Sharif");
        s1.displayDetails();
        s2.displayDetails();
        s3.displayDetails();
    }
}




