interface vehicle{
    void changegear(int a);
    void speedup(int a);
    void applybreaks(int a);
}

class bicycle implements vehicle{
    int speed;
    int gear;
    @Override
    public void changegear(int newgear){
        gear = newgear;
    }
    @Override
    public void applybreaks(int decrement){
        speed = speed - decrement;
    }
    @Override
    public void speedup(int increment){
        speed = speed + increment;
    }
    public void printstate(){
        System.out.println("Speed"+speed+", Gear"+gear);
    }
}

class car implements vehicle{
    int speed;
    int gear;
    @Override
    public void changegear(int newgear){
        gear = newgear;
    }
    @Override
    public void applybreaks(int decrement){
        speed = speed - decrement;
    }
    @Override
    public void speedup(int increment){
        speed = speed + increment;
    }
    public void printstate(){
        System.out.println("Speed"+speed+", Gear"+gear);
    }
}

class Main2{
    public static void main(String[] args) {
        bicycle b = new bicycle();
        b.changegear(25);
        b.speedup(90);
        b.applybreaks(20);
        System.out.println("Bicycle present state");
        b.printstate();
        car c = new car();
        c.changegear(75);
        c.speedup(50);
        c.applybreaks(10);
        System.out.println("Car Present state");
        c.printstate();
    }
}