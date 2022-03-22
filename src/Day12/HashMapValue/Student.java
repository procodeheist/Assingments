package Day12.HashMapValue;

import java.util.Objects;

public class Student implements Comparable<Student> {
    private int roll;
    private String name;
    private int mark;
    public Student() {
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

    @Override
    public String toString() {
        return "Student{" +
                "roll=" + roll +
                ", name='" + name + '\'' +
                ", mark=" + mark +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return roll == student.roll && mark == student.mark && name.equals(student.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(roll, name, mark);
    }

    @Override
    public int compareTo(Student o) {
        return 0;
    }

//    @Override
//    public int compareTo(Student o) {
//        if(mark>o.mark)
//            return 1;
//        else if(mark<o.mark)
//            return -1;
//        else
//            return 0;
//    }
}
