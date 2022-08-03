package Wednesday;

import java.util.Scanner;

public class GradeExersise {
    public static void main(String[] args) {

        Scanner grade = new Scanner(System.in);

        System.out.println("please enter your total grade => "  );
        int total = grade.nextInt();

        if (total >= 90) {
            System.out.println("your grade is A");
        }
        else if (total >= 65 && total <= 90) {
            System.out.println("your grade is B");
        }
        else  {
            System.out.println("your grade is F");
        }
    }
}

