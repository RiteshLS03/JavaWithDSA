// public class IsNumberPrime {

// public static Boolean isItPrime() {

// }

// public static void main(String args[]) {
// float Num = 10;

// }
// }

// import java.util.*;

// public class IsNumberPrime {
// public static void main(String args[]) {
// Scanner scan = new Scanner(System.in);
// int t = scan.nextInt();

// for (int i = 0; i < t; i++) {
// int n = scan.nextInt();

// int count = 0;
// for (int div = 2; div * div <= n; div++) {
// if (n % div == 0) {
// count++;
// break;
// }
// }
// if (count == 0) {
// System.out.println("PRIME");
// } else {
// System.out.println("NOT PRIME");
// }
// }

// }
// }

// import java.util.*;

// public class IsNumberPrime {
// public static void main(String args[]) {
// Scanner scan = new Scanner(System.in);
// int t = scan.nextInt();

// for (int i = 0; i < t; i++) {
// int n = scan.nextInt();

// int count = 0;
// for (int div = 2; div * div <= n; div++) {
// if (n % div == 0) {
// count++;
// break;
// }
// }
// if (count == 0) {
// System.out.println("PRIME");
// } else {
// System.out.println("NOT PRIME");
// }
// }
// }
// }

import java.util.*;

public class IsNumberPrime {

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the first number: ");
        int Num1 = sc.nextInt();
        System.out.println("Enter the second number: ");
        int Num2 = sc.nextInt();

        for (int i = Num1; i <= Num2; i++) {
            System.out.println(Num1);
            Num1++;
        }
    }
}