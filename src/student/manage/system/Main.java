package student.manage.system;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Teacher halisa = new Teacher(1,"Halisa",500);
        Teacher hena = new Teacher(2,"Hena",700);
        Teacher heidi = new Teacher(3,"Heidi",600);

        List<Teacher> teacherList = new ArrayList<>();
        teacherList.add(halisa);
        teacherList.add(hena);
        teacherList.add(heidi);

        Student sid = new Student(1,"Sid",4);
        Student tammy = new Student(2,"Tammy",12);
        Student stella = new Student(3,"Stella",5);

        List<Student> studentList = new ArrayList<>();
        studentList.add(sid);
        studentList.add(tammy);
        studentList.add(stella);

        School ghs = new School(teacherList,studentList);
        Teacher weishan = new Teacher(6,"Megan", 900);

        ghs.addTeacher(weishan);


        sid.payFees(5000);
        tammy.payFees(6000);
        System.out.println("GHS has earned $"+ ghs.getTotalMoneyEarned());

        System.out.println("------Making SCHOOL PAY SALARY----");
        halisa.receiveSalary(halisa.getSalary());
        System.out.println("GHS has spent for salary to " + halisa.getName()
                +" and now has $" + ghs.getTotalMoneyEarned());

        heidi.receiveSalary(heidi.getSalary());
        System.out.println("GHS has spent for salary to " + heidi.getName()
                +" and now has $" + ghs.getTotalMoneyEarned());


        System.out.println(tammy);

        hena.receiveSalary(hena.getSalary());

        System.out.println(hena);

    }









}