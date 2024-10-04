// constructor overloading in java
import java.util.Scanner;


class Student{
    String name = "Student";
    String roll = "00";

    Student(){
        System.out.println("Created Student using the default arguments...");
    }

    Student(String name, String roll){
        System.out.println("Create Student using the arguments...");
        this.name = name;
        this.roll = roll;
    }

    public static void main(String[] args){
        Student s1 = new Student();
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        String roll = sc.nextLine();

        sc.close();
        Student s2 = new Student(name, roll);

        System.out.println(s1.name + " " + s1.roll + "\n" + s2.name + " " + s2.roll);
    }


}