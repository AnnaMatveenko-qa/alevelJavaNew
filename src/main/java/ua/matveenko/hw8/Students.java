package ua.matveenko.hw8;

public class Students {
    public static void main(String[] args) {
        Student student = new Student("John", "Smith","QA Automation online 4", 4);
        Student student1 = new Student("Marta","Johnson","QA Automation online 4", 5);
        Aspirant aspirant = new Aspirant("latifa","Brown","Java online 9", 4.5,"Title1");
        Aspirant aspirant1 = new Aspirant("Charlie","Miller","Python",5,"Title2");
        Student[] students = {student, aspirant, student1, aspirant1};
        for (int i = 0; i < students.length; i++) {
            System.out.println(students[i].getScholarship());
        }
    }
}
