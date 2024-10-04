
import java.util.Scanner;
public class input{
    public static void main(String[] args){
        System.out.println("Hello input");

	Scanner sc = new Scanner(System.in);
	System.out.println("enter a no.");
	int x = sc.nextInt();
	System.out.println("your no. is "+x);
	//when nextInt() is called it will generate a \n character at the end of the line which will
	//be consumed by the nextLine() so inorder to make the nextLine work we should deliberately 
	//consume that \n character
	sc.nextLine();
	System.out.println("enter a string");
	
	String str = sc.nextLine();

	System.out.println(str);
	

    }

}
