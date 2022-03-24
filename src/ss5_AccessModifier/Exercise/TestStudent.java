package ss5_AccessModifier.Exercise;

public class TestStudent {
    public static void main(String[] args) {
        Student student = new Student();
        student.setName("Nhu");
        student.setClasses("DHY12");
        System.out.println("Your name is: " + student.getName() + "\n" + "your class is: " + student.getClasses());
    }
}
