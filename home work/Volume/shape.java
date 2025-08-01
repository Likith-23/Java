class shape {
     private double side;
    public shape(double side) {
        this.side = side;
}

class Cube extends shapehape {
    public Cube(double side) {
        super();
    }
    public double calculateVolume() {
        double side = getSide(); 
        return side * side * side;
    }
}