import java.util.ArrayList;
import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Teacher irfan = new Teacher("irfan",1,5000);
        Teacher jay = new Teacher("jay",2,5000);
        List<Teacher> teachers = new ArrayList<>();
        teachers.add(irfan);
        teachers.add(jay);

        Student abir = new Student(1,"abir",11);
        Student sam = new Student(2,"sam",12);
        List<Student> students = new ArrayList<>();
        students.add(abir);
        students.add(sam);

        School ipsc = new School(teachers,students);

        abir.payFees(3000);
        sam.payFees(4000);
        System.out.println(ipsc.getTotalMoneyEarned());

        System.out.println("making ipsc pay salary");
        irfan.receiveSalary(irfan.getSalary());
        System.out.println("ipsc paid salary to " + irfan.getName() + " and now ipsc have " + ipsc.getTotalMoneyEarned());


    }
}