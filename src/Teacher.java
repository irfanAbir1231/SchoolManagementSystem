public class Teacher {
    private String name;
    private int id;
    private int salary;

    public Teacher(String name, int id, int salary) {
        this.name = name;
        this.id = id;
        this.salary = salary;
    }

    /**
     *
     * @return the name of the current teacher
     */
    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }


}
