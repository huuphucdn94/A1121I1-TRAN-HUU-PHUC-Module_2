package ss4_OOP.Practive;

public class Cat {
    public String name;
    public int age;
    public float weight;
    public String color;
    public String eyesColor;
//phuong thuc khoi tao mac dinh khong tam so trong java
    public Cat(){
    }

    public Cat(String name){
        this.name = name;
    }
    public Cat(String name, int age){
        this.name = name;
        this.age = age;
    }
    public Cat(String name, String color){
        this.name = name;
        this.color = color;
    }
    public void speak(){
        System.out.println(name + " is speaking");
    }
    public void move(){
        System.out.println(name + " is moving");
    }
    public void sleep(){
        System.out.println(name + " is sleeping");
    }
    public void eat(){
        System.out.println(name + " is eating");
    }
}
