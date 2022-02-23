package ss1_java_overview.bai_tap;
import java.util.Scanner;
public class LetterToNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your number which you want to change to letter: ");
        int number = scanner.nextInt();
        if (number >= 0 && number <10) {
            String numToLetter;
            switch (number){
                case 0: numToLetter = "zero";
                    break;
                case 1: numToLetter = "one";
                    break;
                case 2: numToLetter = "two";
                    break;
                case 3: numToLetter = "three";
                    break;
                case 4: numToLetter = "four";
                    break;
                case 5: numToLetter = "five";
                    break;
                case 6: numToLetter = "six";
                    break;
                case 7: numToLetter = "seven";
                    break;
                case 8: numToLetter = "eight";
                    break;
                case 9: numToLetter = "night";
                    break;
            }

        }

    }
}
