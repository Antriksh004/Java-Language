interface API{
    default void Show(){//default is used because the interface can only have non_body abstract methods

        System.out.println("Show of the interface");
    }
} 

interface interface1 extends API{
    default void demo1(){
        System.out.println("demo1 of the interface1");
    }
    void demo3();
}
interface interface2 extends API{
    default void demo2(){
        System.out.println("demo2 of the interface2");
    }
    void demo4();
}

public class MultipleInheritenceUsingInterface implements interface1, interface2{
    public void demo3(){
        System.out.println("demo3 of the interface1");
    }

    public void demo4(){
        System.out.println("demo4 of the interface2");
    }
    public static void main(String[] args){

        MultipleInheritenceUsingInterface miui = new MultipleInheritenceUsingInterface();
        miui.demo1();
        miui.demo2();
        miui.demo3();
        miui.demo4();
    }

    
}
