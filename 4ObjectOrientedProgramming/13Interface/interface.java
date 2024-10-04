// interface is like a blueprint of a java class. It contains static constants as well as 4
// abstract methods

// by interface we can support the functionality of multiple inheritence in java
// all the methods in the interface are declared with an empty body and are public

// interface is used to achieve total abstraction


// a class can extend a class, an interface can extend an interface but only class can implement
// an interface


interface Vehicle{
    void changeGear(int a);
    void speedUp(int a);
    void applyBrakes(int a);
    void displayInstrumentCluster();
}


class Bicycle implements Vehicle{
    String id = "";
    String maxSpeed = "40kmph";
    int totalGears = 7 * 3;
    int speed = 0;
    int gear = 0;

    Bicycle(String id, String maxSpeed, int totalGears){
        this.id = id;
        this.maxSpeed = maxSpeed;
        this.totalGears = totalGears;
    }


    @Override
    public void changeGear(int newGear){
        this.gear = newGear;

    }
    @Override
    public void speedUp(int incrementInSpeed){
        this.speed = this.speed + incrementInSpeed;
    }
    @Override
    public void applyBrakes(int decrementInSpeed){
        this.speed = this.speed - decrementInSpeed;
    }
    @Override
    public void displayInstrumentCluster(){
        System.out.println("max speed = "+ this.maxSpeed);
        System.out.println("total gears = "+ this.totalGears);
        System.out.println("current speed = "+ this.speed);
        System.out.println("current gear= "+ this.gear);
    }

}
class Bike implements Vehicle{
    String id = "";
    String maxSpeed = "100kmph";
    int totalGears = 4;
    int speed = 0;
    int gear = 0;

    Bike(String id, String maxSpeed, int totalGears){
        this.id = id;
        this.maxSpeed = maxSpeed;
        this.totalGears = totalGears;
    }


    @Override
    public void changeGear(int newGear){
        if(newGear <= totalGears){

            this.gear = newGear;
        }

    }
    @Override
    public void speedUp(int incrementInSpeed){
        this.speed = this.speed + incrementInSpeed;
    }
    @Override
    public void applyBrakes(int decrementInSpeed){
        this.speed = this.speed - decrementInSpeed;
    }
    @Override
    public void displayInstrumentCluster(){
        System.out.println("max speed = "+ this.maxSpeed);
        System.out.println("total gears = "+ this.totalGears);
        System.out.println("current speed = "+ this.speed);
        System.out.println("current gear= "+ this.gear);
    }

}

class Main{
    public static void main(String[] args){
        Bicycle bc1 = new Bicycle("HERO1987ET0010", "43kmph", 7*3);

        bc1.changeGear(6*2);

        bc1.speedUp(10);
        bc1.speedUp(6);
        bc1.applyBrakes(3);
        bc1.displayInstrumentCluster();
        Bike b1 = new Bike("RE1987ET0010", "170kmph", 4);

        b1.changeGear(3);
        b1.speedUp(100);
        b1.speedUp(61);
        b1.applyBrakes(33);
        b1.displayInstrumentCluster();



    }
}
