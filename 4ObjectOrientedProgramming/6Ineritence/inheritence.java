// In Java, when you create an instance of a child class, the constructor of the parent class is automatically invoked before
//  the constructor of the child class. This is because Java ensures that the parent class is
//   properly initialized before the child class is constructed.
class Parent{
    String name = "Parent";
    Parent(){
        System.out.println("I am the constructor of the Parent class");

    }
    void Demo(){
        System.out.println("Iam the Demo of the parent class");

    }
}


class Child extends Parent{
    Child(){
        System.out.println("constructor of child class");
        System.out.println("name of the parent is " + super.name);
    }
    public void func1(){
        System.out.println("func1 of Child");
    }
    
    
    public static void main(String[] args){
        Child c = new Child();
        c.Demo();

    }
}

// Parents class reference can be used to opoint childs class object but using that reference you can access only those data/functions
// which are declared in the parent
// childs class reference cannot be used to point parent class object

class Main{
    public static void main(String[] args){
        Parent p = new Child();
        p.Demo();
        // Child c = new Parent();Type mismatch: cannot convert from Parent to Child
        // c.Demo();

    }
}