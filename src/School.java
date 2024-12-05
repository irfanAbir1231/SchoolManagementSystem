import java.util.List;

public class School {
    /**
     * many teacher, many students
     * its not good ...doing...teacher1, teacher2, teacher2....
     * we can also create an array of teacher or students but ...we dont know the count
     * so we can implement student and teacher using arraylist
     */
    private List<Teacher> teachers;
    private List<Student> students;
    private static int totalMoneyEarned;
    private static int totalMoneySpent;

    public School(List<Teacher> teacher, List<Student> students) {
        this.teachers = teacher;
        this.students = students;
        this.totalMoneyEarned = 0;
        this.totalMoneySpent = 0;
    }

    public List<Teacher> getTeacher() {
        return teachers;
    }

    /**
     * adds a teacher to the school
     * @param teacher the teacher to be added
     */
    public void addTeacher(Teacher teacher) {
        teachers.add(teacher);
    }

    /**
     * return list of students in the school
     * @return
     */
    public List<Student> getStudents() {
        return students;
    }

    /**
     * adds a student to the school
     * @param student
     */
    public void addStudents(Student student) {
        students.add(student);
    }

    /**
     * get total money earned by the school
     * @return
     */
    public int getTotalMoneyEarned() {
        return totalMoneyEarned;
    }

    /**
     * adds the total money by the school
     * @param MoneyEarned
     */
    public static void updateTotalMoneyEarned(int MoneyEarned) {
        totalMoneyEarned += MoneyEarned;
    }

    /**
     * the total money spent by the school
     * @return
     */
    public int getTotalMoneySpent() {
        return totalMoneySpent;
    }

    /**
     * update the money that is spent by the school
     * is the salary given by the school to its teacher
     * @param MoneySpent
     */
    public static void updateTotalMoneySpent(int MoneySpent) {
        totalMoneyEarned -= MoneySpent;
    }
}
