class InitializationBlocks{
    int i = 0;
    // static block
    static{
        System.out.println("Static block 1");
    }

    static{
        System.out.println("Static block 2");
    }
    // object initialization block
    {
        System.out.println("object initializaation block 1");
        
    }
    {
        i = 7;
        System.out.println("object initializaation block 2 with i = " + i );

    }

    public InitializationBlocks(){
        System.out.println("Constructor");
    }

    public static void main(String[] args){
        InitializationBlocks ib = new InitializationBlocks();
        System.out.println(ib.i);
    }
}

// Order of output

// Static block 1
// Static block 2
// object initializaation block 1
// object initializaation block 2 with i = 7
// Constructor
// 7