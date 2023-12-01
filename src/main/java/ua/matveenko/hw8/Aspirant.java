package ua.matveenko.hw8;

public class Aspirant extends Student {
    protected String title;

    public Aspirant(String firstName, String lastName, String group, double averageMark, String title) {
        super(firstName, lastName, group, averageMark);
        this.title = title;
    }

    @Override
    public double getScholarship() {
        return averageMark == 5 ? 200 : 180;
    }

}
