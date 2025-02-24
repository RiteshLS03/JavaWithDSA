import java.util.*;

public class GreaterNumberBetween2Numbers {
    public static void main(String args[]) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter first number: ");
        float Num1 = scn.nextFloat();
        System.out.println("Enter Second number: ");
        float Num2 = scn.nextFloat();

        if (Num1 == Num2) {
            System.out.println("Both are same");
        } else if (Num1 > Num2) {
            System.out.println("First entered number is greater than second");
        } else {
            System.out.println("Second entered number is greater than first");
        }
    }
}