package ss4_OOP.Practive;

public class ObjectCat {
   public String name;
   public int age;
   public String color;

    public ObjectCat(String name, int age, String color) {
        this.name = name;
        this.age = age;
        this.color = color;
    }
    public static void main(String[] args) {
        ObjectCat milk = new ObjectCat("milk", 3, "Black");
        System.out.println(milk.name +" "+ milk.age + " "+ milk.color );
    }

}
