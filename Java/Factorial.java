// public class Factorial {

//     public static int facts(int n) {
//         int f = 1;
//         for(int i = 1 ; i <= n; i++){
//             f = f * i;
//         }
//         // System.out.println(f);
//         return f;

//     }
//     public static void main(String args[]){
//         System.out.println(facts(4));
//     }
// }

// public class Factorial {

//     public static Boolean isPrime(int num){
//     //     if(num <= 1) return false;
//     //     for(int i = 2; i <= Math.sqrt(num); i++){
//     //         if(num % i == 0) return false;
//     //         }
//     //         return true;
//     // }

//     for(i)

//     public static void main(String args[]){
//         System.out.println(isPrime(5));
//     }
// }

// public class Factorial{
//     public static void main(String args[]){
//         float originNumber = 10899;
//         for(float i = originNumber; originNumber % 10 == 0; i--){
//             float lastDIgit =(float) (originNumber) % 10;
//             System.out.println(lastDIgit);
//             System.out.print(lastDIgit + "");
//             originNumber = originNumber /10;
//         }
//     }
// }

// public class Factorial {
//     public static void main(String[] args) {
//         int originNumber = 10899; // Use integer for number operations
//         int reversedNumber = 0; // Variable to store the reversed number

//         while (originNumber != 0) { // Loop until the number becomes 0
//             int lastDigit = originNumber % 10; // Extract the last digit
//             reversedNumber = reversedNumber * 10 + lastDigit; // Construct the reversed number
//             originNumber = originNumber / 10; // Remove the last digit
//         }

//         System.out.println("Reversed Number: " + reversedNumber);
//     }
// }

// public class Factorial {
//     public static void main(String[] args) {
//         int originNumber = 10899; // Use integer for number operations
//         int reversedNumber = 0; // Variable to store the reversed number

//         // Use a for loop where initialization, condition, and update are embedded
//         for (; originNumber != 0; originNumber /= 10) {
//             int lastDigit = originNumber % 10; // Extract the last digit
//             reversedNumber = reversedNumber * 10 + lastDigit; // Construct the reversed number
//         }

//         System.out.println("Reversed Number: " + reversedNumber);
//     }
// }
