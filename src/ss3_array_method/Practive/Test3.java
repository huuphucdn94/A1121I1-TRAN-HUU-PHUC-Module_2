package ss3_array_method.Practive;

import java.util.Scanner;

public class Test3 {
    public static void main(String[] args) {
        String [] listName = {"Peter", "Myra", "Mary", "Sara", "Cathleen","John", "William", "Johnson"};
        Scanner input = new Scanner(System.in);
        System.out.println("please enter name");
        String name = input.nextLine();
        boolean isExit = false;
        for (int i = 0; i < listName.length; i++){
            if (listName[i].equals(name)){
                System.out.println("Position of student ine the list : " + name + " is "+ (i+1));
                isExit = true;
                break;
            }
        }
        if (!isExit){
            System.out.println("Not found: " + name + " in the list");
        }
    }
}
