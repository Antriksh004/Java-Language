

class StaticVariable{
    static int x = 0;
    static void Demo(){
        System.out.println("demo of the StaticVariable class");

    }

    public static void main(String[] args){
        // StaticVariable sv = new StaticVariable();
    //     System.out.println(sv.x);
    //     sv.Demo();
    // } the above both techniques are not recommended beacuse the staic variables or functions should 
    // be accessed statically only

    System.out.println(StaticVariable.x);
    StaticVariable.Demo();

    }
    
}