package ss3_array_method.Practive;

public class Test2 {
    public static void main(String[] args) {
        System.out.println("The Grade is: "+ printGrade(78.5));
        System.out.println("The Grade is: "+ printGrade(59.5));
    }
    public static char printGrade(double score) {
        if (score >= 90) {
            return 'A';
        } else if (score >= 80.0) {
            return 'B';
        } else if (score >= 70.0) {
            return 'C';
        } else if (score >= 60.0) {
            return 'D';
        } else {
            return 'F';
        }
    }
}
