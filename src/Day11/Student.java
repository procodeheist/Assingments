package Day11;

import java.util.Objects;

public class Student implements Comparable<Student>{
    private int mark;
    private String name;
    private int rollNum;

    public Student() {
    }

    public Student(int mark, String name, int rollNum) {
        this.mark = mark;
        this.name = name;
        this.rollNum = rollNum;
    }

    public int getMark() {
        return mark;
    }

    public void setMark(int mark) {
        this.mark = mark;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRollNum() {
        return rollNum;
    }

    @Override
    public String toString() {
        return "Student{" + "mark=" + mark + ", name='" + name + '\'' + ", rollNum=" + rollNum + '}';
    }

    public void setRollNum(int rollNum) {
        this.rollNum = rollNum;
    }

    @Override
    public int compareTo(Student o) {
        return 0;
    }
    @Override
        public boolean equals(Object o){
        Student s = (Student) o;
        return mark == s.mark && rollNum == s.rollNum && Objects.equals(name, s.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(mark, name, rollNum);
    }
}
