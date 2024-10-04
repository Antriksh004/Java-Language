import java.util.Random;
import java.util.Scanner;
import java.math.BigInteger;
import java.math.BigDecimal;


class Main{
    public static void main(String[] args){
        double x = Math.pow(3, 2);
        System.out.println(x);
        System.out.println(Math.sin(0.523599));//the argument shoud be in radians
        for(int i = 0; i < 10; i ++){
            
            System.out.println(Math.random());//(0.0 to 1.0)
        }
        Random r = new Random();
        for(int i = 0; i < 10; i ++){
            
            int y = r.nextInt();//(0 to 2 ^32 includes negative also)
            System.out.println(y);
        }
        for(int i = 0; i < 10; i ++){
            
            int z = r.nextInt(1,10);
            System.out.println(z);
        }
    }
}

class BigIntegerDemo{
    public static void main(String[] args){
        // input a long integer in string format
        Scanner sc = new Scanner(System.in);
        String str1 = sc.nextLine();
        String str2 = sc.nextLine();
        String str3 = sc.nextLine();
        String str4 = sc.nextLine();
        sc.close();


        BigInteger b1 = new BigInteger(str1);
        BigInteger b2 = new BigInteger(str2);
        BigInteger b3 = b1.add(b2);
        System.out.println(b1 + " + " + b2 +" = " + b3);
        BigDecimal b4 = new BigDecimal(str3);
        BigDecimal b5 = new BigDecimal(str4);
        BigDecimal b6 = b4.add(b5);
        System.out.println(b1 + " + " + b2 +" = " + b6);


    }

}