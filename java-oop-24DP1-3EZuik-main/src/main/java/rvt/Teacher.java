package rvt;

public class Teacher extends Person {

    private final int salary;

    public Teacher(String name, String address, int salary) {
        super(name, address);
        this.salary = salary;
    }

    public int salary() {
        return this.salary;
    }

    @Override
    public String toString() {
        return super.toString() + "\nSalary " + this.salary;
    }
}
