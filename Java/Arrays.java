// import java.util.Scanner;

// public class Arrays {
//     public static void main(String args[]){
//         int arr[] = new int[100]; 
//         Scanner sc = new Scanner(System.in);
//         arr[0] = sc.nextInt();
//         arr[1] = sc.nextInt();
//         System.out.println(arr[0] + arr[1]);
//         System.out.println(arr.length);
//     }
// }


// Linear Search 

// public class Arrays {

    // public static int findTheKeyIndex (int numbers[], int key) {
    //     int indexValue = 0;
    //     for(int i = 0; i < numbers.length ; i++){
    //         // (numbers[i] == key) ? return i : 
    //         if (numbers[i] == key) {
    //             return i; // Return the index if the key is found
    //         }
    //     }
    // }

//     import java.util.*;

//     public class Arrays {
//     public static int findTheKeyIndex(int numbers[], int key){
//         // int index = 0;
//         for(int i = 0; i < numbers.length; i++){
//             if(numbers[i] == key){
//                 return i;
//             }
//             // return i;
//         }
//         return -1;
//     }
//     public static void main(String args[]){
//         int numbers[] = {2,4,6,8,10,12,14};
//         int key = 10;
//         int index = findTheKeyIndex(numbers, key);
//         System.out.println("The index of the key is: " + index);
//         // System.out.println(findTheKeyIndex(numbers, key));

//     }
// }

// import java.util.*;

// public class Arrays {

//     // public static int getLargestNumber(int numbers){
//     //     int largest = Integer.MIN_VALUE;
//     //     for(int i = 0; i < numbers.length ; i++){
//     //         if (numbers[i] > largest) {  // Compare and update
//     //             largest = numbers[i];
//     //         }        }

//     //     return largest;

//     // }

//     public static int getLargestNumber(int[] numbers) {
//         int largest = Integer.MIN_VALUE; // Initialize to the smallest possible value
//         for (int i = 0; i < numbers.length; i++) {
//             if (numbers[i] > largest) {  // Compare and update
//                 largest = numbers[i];
//             }
//         }
//         return largest;
//     }
    

//     public static  void main(String args[]){
//         int numbers[] = {2,4,6,8,99,12,14};

//         int large = getLargestNumber(numbers);
//         System.out.println("The largest number is: " + large);
//     }
// }