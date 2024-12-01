public class Student {
    private int id;
    private String name;
    private int grade;
    private int feesPaid;
    private int feesTotal;

    public Student(int id, String name, int grade) {
        this.feesPaid = 0;
        this.feesTotal = 30000;
        this.id = id;
        this.name = name;
        this.grade = grade;
    }

    //not going to alter student name and id.

    /**
     * used to update student's grade
     * @param grade new grade of the student's
     */
    public void setGrade(int grade) {
        this.grade = grade;
    }

    /**
     * add the fees to the fees paid
     * the school is going to receive the funds.
     * @param feesPaid is the fees that the student pays
     */
    public void updateFeesPaid(int feesPaid) {
        this.feesPaid += feesPaid;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getGrade() {
        return grade;
    }

    public int getFeesPaid() {
        return feesPaid;
    }

    public int getFeesTotal() {
        return feesTotal;
    }




}
