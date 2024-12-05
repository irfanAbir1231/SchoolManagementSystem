public class Teacher {
    private String name;
    private int id;
    private int salary;
    private int salaryEarned;

    public Teacher(String name, int id, int salary) {
        this.name = name;
        this.id = id;
        this.salary = salary;
        this.salaryEarned = 0;
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

    /**
     * adds salary
     * removes from total money earned
     * @param newSalary
     */
    public void receiveSalary(int newSalary) {
        this.salaryEarned += newSalary;
        School.updateTotalMoneySpent(newSalary);
    }

    @Override
    public String toString() {
        return "Name of the teacher is "+ name + " and id is "+ id + " and salary is "+ salary + " and salaryEarned is "+ salaryEarned;
    }

}
