package ss15_Exception_Debug.Practive;

public class Test {
    private int numerator, denominator;

    public Test(int n, int d) throws Exception {
        if (d == 0){
            throw new Exception();
        }
        this.numerator = n;
        this.denominator = d;
    }

    public static void main(String[] args) {
        try {
            Test fraction = new Test(2,0);
        }
        catch (Exception e){
            e.printStackTrace();
        }
    }
}
