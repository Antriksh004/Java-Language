// composing a single objects with the help of multiple objects
import java.util.Scanner;
class Student{
    String name = "Student";
    String roll = "00";
    Student(String name, String roll){
        this.name = name;
        this.roll = roll;
        System.out.println("Student is created : "+name+ " " + roll);
    }
        
}

class Chair{
    String type = "Wooden";
    Chair(){
        System.out.println("Chair was created");
    }
}

class ClassRoom{
    Student s;
    Chair c;
    ClassRoom(String name,String roll){
        s = new Student(name, roll);
        c = new Chair();
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the name and roll of the student");

        String name = sc.nextLine();
        String roll = sc.nextLine();
        sc.close();

        ClassRoom cr = new ClassRoom(name, roll);
        System.out.println("ClassRoom was created : " + cr.s.name + " " + cr.s.roll + " " + cr.c.type);
        
    }
}
