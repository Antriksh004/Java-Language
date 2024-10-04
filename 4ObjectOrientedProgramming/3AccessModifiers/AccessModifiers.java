// access modifiers in java are - public private protected default

class AccessModifiers{
    private int x = 0;
    int y = 8;
    public int z = 3;
    private void Demo(){
        System.out.println("in private demo of AccessModifiers");
    }

    public static void main(String[] args){
        AccessModifiers am = new AccessModifiers();
        am.Demo();

        System.out.println(am.x);
        System.out.println(am.y);
        System.out.println(am.z);
        
    }
}

class AccessModifiers2{
    public static void main(String[] args){
        AccessModifiers am2 = new AccessModifiers();
        
        // System.out.println(am2.x); this will not give any value as it is declared as private variable in AccessModifiers
        // class
        System.out.println(am2.y);
        System.out.println(am2.z);
        

    }
}