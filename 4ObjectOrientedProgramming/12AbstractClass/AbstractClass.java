class Animal{
    String name = "";
    void makeNoise(){
        System.out.println("makeNoise() of Animal");
    }
    
}

class Tiger extends Animal{
    void makeNoise(){
        System.out.println("Tiger roars");
    }
    void eat(){
        System.out.println("eat() of the tiger");
    }
}
class Cat extends Animal{
    void makeNoise(){
        System.out.println("Cat meows");
    }
    void eat(){
        System.out.println("eat() of the cat");
    }
}

class Demo{
    public static void main(String[] args){
        Animal a = new Tiger();
        a.makeNoise();
        Animal b = new Cat();
        b.makeNoise();
        // a.eat();
    }
}