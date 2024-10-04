package p2;
import p1.Parent;

public class Child extends Parent{
    public static void main(String[] args){
        Child c = new Child();
        c.demo1();
        c.demo2();
        // c.demo3(); this is not visible
    }   


}