package Day13.StreamAndFilter;

public class Student {
    private int roll;
    private String name;
    private int mark;

    public Student() {
    }

    @Override
    public String toString() {
        return "Student{" +
                "roll=" + roll +
                ", name='" + name + '\'' +
                ", mark=" + mark +
                '}';
    }

    public Student(int roll, String name, int mark) {
        this.roll = roll;
        this.name = name;
        this.mark = mark;
    }

    public int getRoll() {
        return roll;
    }

    public void setRoll(int roll) {
        this.roll = roll;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMark() {
        return mark;
    }

    public void setMark(int mark) {
        this.mark = mark;
    }
}
