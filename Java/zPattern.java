// public class zPattern {
//     public static void main(String args[]) {
//         System.out.println("******");
//         System.out.println("   *  ");
//         System.out.println("  *   ");
//         System.out.println(" *    ");
//         System.out.println("******");

//     }
// }

import java.util.*;

public class zPattern {
    public static void main(String args[]) {
        Scanner scn = new Scanner(System.in);
        int marks = scn.nextInt();
        if (marks >= 90) {
            System.out.println("Excellent");
        } else if (marks >= 80 && marks <= 90) {
            System.out.println("Good");
        } else if (marks > 70 && marks <= 80) {
            System.err.println("Fair");
        } else if (marks > 60 && marks < 70) {
            System.out.println("Meets expecations");
        } else if (marks <= 60) {
            System.err.println("Below par");
        }
    }
}