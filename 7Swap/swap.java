class Demo{
    int x = 3;
    static void swap(Demo d1, Demo d2){
        int temp;
        temp = d1.x;
        d1.x = d2.x;
        d2.x = temp;
    }
    // static void swap(Demo a, Demo b){
    //     int temp;
    //     temp = a.x;
    //     a.x = b.x;
    //     b.x = temp;
    // }

    public static void main(String[] args){
        Demo d1 = new Demo();
        d1.x = 5;
        Demo d2 = new Demo();
        Demo.swap(d1, d2);
        System.out.println(d1.x + "--" +d2.x);
    }
}