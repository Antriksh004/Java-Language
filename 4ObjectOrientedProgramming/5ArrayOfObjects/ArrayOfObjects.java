import java.util.Scanner;
class Student{
    String name = "Student";
    String roll = "00";
    float cgpa = 0.0F;

    public Student(String name, String roll, float cgpa){
        this.name = name;
        this.roll = roll;
        this.cgpa = cgpa;

    }
    void Display(){
        System.out.println("Name : " + this.name + " Roll : " + this.roll + " cgpa : " + this.cgpa);

    }
}

class StudentArray{
    static void InsertionSort(Student[] arr, int size){
        for(int i = 0; i < size; i ++){
            for(int j = i+1; j < size; j++){
                if(arr[i].cgpa < arr[j].cgpa){
                    Student temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
            
            
        }
    }
    public static void main(String[] args){
        System.out.println("enter the size of array");
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        Student[] arr = new Student[size];
        for(int i = 0; i < size; i ++){
            System.out.println("enter the name, roll and cgpa of the student");
            
            sc.nextLine();
            String name = sc.nextLine();
            String roll = sc.nextLine();
            float cgpa = sc.nextFloat();
            System.out.println(name+roll+cgpa);
            arr[i] = new Student(name,roll, cgpa);


        }
        sc.close();
        for(Student s : arr){
            s.Display();
        }
        StudentArray.InsertionSort(arr, size);
        for(Student s : arr){
            s.Display();
        }
        
        
    }
    
}

