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

class truck implements vehicle{
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

class airplane implements vehicle{
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

class motorbike implements vehicle{
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

class ship implements vehicle{
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

class jet implements vehicle{
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

class helicopter implements vehicle{
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

class ricksaw implements vehicle{
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

class homework{
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
        truck t = new truck();
        t.changegear(75);
        t.speedup(60);
        t.applybreaks(15);
        System.out.println("Truck Present state");
        t.printstate();
        airplane a = new airplane();
        a.changegear(35);
        a.speedup(55);
        a.applybreaks(5);
        System.out.println("Airplane Present state");
        a.printstate();
        motorbike m = new motorbike();
        m.changegear(75);
        m.speedup(50);
        m.applybreaks(10);
        System.out.println("MotorBike Present state");
        m.printstate();
        ship s = new ship();
        s.changegear(90);
        s.speedup(45);
        s.applybreaks(100);
        System.out.println("Ship Present state");
        s.printstate();
        helicopter h = new helicopter();
        h.changegear(75);
        h.speedup(50);
        h.applybreaks(10);
        System.out.println("Helicopter Present state");
        h.printstate();
        jet j = new jet();
        j.changegear(100);
        j.speedup(50);
        j.applybreaks(25);
        System.out.println("Jet Present state");
        j.printstate();
        ricksaw r = new ricksaw();
        r.changegear(55);
        r.speedup(50);
        r.applybreaks(60);
        System.out.println("Ricksaw Present state");
        r.printstate();
    }
}