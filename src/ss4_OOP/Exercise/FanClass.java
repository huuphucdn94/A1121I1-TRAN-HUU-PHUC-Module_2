package ss4_OOP.Exercise;

public class FanClass {
    public static void main(String[] args) {
        FanClass fanClass1 = new FanClass();
        fanClass1.setSpeed(1);
        fanClass1.setRadius(10);
        fanClass1.setOn(true);
        fanClass1.setColor("Yellow");
        System.out.println("The fan 1 is: " + fanClass1.toString());
        FanClass fanClass2 = new FanClass();
        fanClass2.setSpeed(2);
        fanClass2.setRadius(5);
        fanClass2.setOn(false);
        fanClass2.setColor("Blue");
        System.out.println("The fan 2 is: " + fanClass2.toString());
    }
    final int SLOW = 1, MEDIUM = 2, FAST= 3;
    private int speed = SLOW;
    private boolean on = false;
    private double radius = 5;
    private String color = "Blue";

    public FanClass(){

    }
    public String toString(){
        if (on){
            return "On= " + on + ", Speed= " + speed + ", Color= " + color + ", radius= " + radius + " : fun is on.";
        } else {
            return "Color = " + color + ", radius =" + radius + " :fun is off.";
        }
    }

    public int getSLOW() {
        return SLOW;
    }

    public int getMEDIUM() {
        return MEDIUM;
    }

    public int getFAST() {
        return FAST;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public boolean isOn() {
        return on;
    }

    public void setOn(boolean on) {
        this.on = on;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
