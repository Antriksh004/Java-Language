import java.util.Scanner;
//an exception is an abnormal condition that arises in the code at runtime

class NameException extends Exception{
    public String toString(){
        return "An exception for user name occured";
    }
}
class CGPAException extends Exception{
    public String toString(){
        return "CGPA less than 0.0 or greater than 10.0";
    }
}

class ExceptionHandelling{
    public static void main(String[] args){
        int x = 0;
        int[] arr = {1,2,3,4};
        
        try{
            int y = 7/x;
        }catch(ArithmeticException e){
            System.out.println(e);
        }
        try{
            arr[6] = 11;

        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println(e);
        }

        
    }
}
class Test{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the name");
        String name = sc.nextLine();
        System.out.println("Enter the cgpa");
        float cgpa = sc.nextFloat();
        sc.close();
        if(name.length() > 30 || name.length() == 0){
            try{
                throw new NameException();
            }catch(NameException e){
                System.out.println(e);
            }
        }

        if(cgpa < 0.0F || cgpa > 10.0F){
            try{
                throw new CGPAException();
            }catch(CGPAException e){
                System.out.println(e);
            }
        }
    }
}