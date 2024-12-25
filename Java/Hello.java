
// public class Hello {
//     // public static void main(String args[]) {
//         public static void main(String args[]){

//         System.out.print("DKFLKSJ");
//     }
// }
// // Boiler Plate code

// public class Hello {
//     public static void main(String[] args) {
//         System.out.print("1 21 21 32 4 5 6");
//     }
// }

// public class Hello {
//     public static void main(String args[]){
//         System.out.println("****");
//         System.out.println("***");
//         System.out.println("**");
//         System.out.println("*");
//     }
// }

// public class Hello {
//     public static void main(String[] args) {

//         int a = 10;
//         int b = 20;
//         int c = 30;
//         System.out.print(a);
//     }
// }


// Sum of two numbers
// public class Hello {
//     public static void main(String args[]) {
//         int a = 10 ;
//         int b = 20 ; 
//         int sum = a + b; 
//         System.out.print(sum);
//     }
// }

// Comments in Java


// sum of two numbers

// import java.util.*;

// public class Hello{
//     public static void main(String args[]){
//         Scanner sc = new Scanner(System.in);
//         String input = sc.next();
//         System.out.print(input);
        


//     } 
// }

// import java.util.*;
// public class Hello {
//     public static void main(String args[]){

//         Scanner sc = new Scanner(System.in);
//         float radius = sc.nextFloat();
//         float area = 3.14f * radius * radius ;
//         System.out.print(area);
//         // System.out.print(a);
        
//         // System.out.print(b);
//         // float sum = a+b;
//         // System.out.println(sum);

//     }
// }

// Loops , while 

// public class Hello {
//     public static void main(String args[]){

//         int counter = 1;
//         while (counter <= 200) {
//             System.out.println(counter);
//             counter++;
//         }
//     }
// }

// public class Hello {
//     public static void main(String args[]){
//         int a = *;
//         for(int i = 0; i <= 5 ; i++){
//             System.out.println(a);
//             //  star += star;
//             a += a;
            
//         }
//     }
// }

// public class Hello {
//     public static void main(String args[]){
//         // String numOfStars = "5";
//         for(int line = 1; line <= 4 ; line++){
//             for(int star = 1 ; star <= line; star++){
//                 System.out.print("*");
//             }
//             System.out.println();
//         }

//     }
// }

// public class Hello {
//     public static void main(String args[]){
//         for(int line = 1 ; line <=5 ; line++){
//             for(int star = 5 ; star >= line ; star--){
//                 System.out.print("*");
//             }
//             System.out.println();
//         }
//     }
// }

// public class Hello{
//     public static void main(String args[]){
//         int numStar = 10;
//         for(int line = 1; line <= numStar; line++){
//             for(int star = 1 ; star <= (numStar-line+1); star++){
//                 System.out.print("*");
//             }
//             System.out.println();
//         }
//     }
// }

// public class Hello{
//     public static void main(String args[]){
//         for(int i = 1; i <= 4; i++){
//             for(int j = 1 ; j <= i ; j++){
//                 System.out.print(j);
//                 j+=1;
//             }
//             System.out.println();
//         }
//     }
// }

// public class Hello {
//     public static void main(String args[]){
//         for(int line = 1; line <= 5 ; line++){
//             for(int num = 1; num <= line ; num++){
//                 System.out.print(num);
//                 // num+=1;
//             }
//             System.out.println();
//         }
//     }
// }


// public class Hello {
//     public static void main(String args[]){
//      int n = 5000;
//      char ch = 'A';
//      for(int line = 1 ; line <= n ; line++){
//         for(int chars = 1; chars <= line; chars++){
//             System.out.print(ch);
//             ch++;
//         }
//         System.out.println();
//      }

//     }
// }

// public class Hello{

//     public static void printHello() {
//         System.out.println("Ole Ole");
//     }
//     public static void main(String args[]){
//         printHello();
//         printHello();
//         printHello();
//     }
// }


import java.util.*;
public class Hello{

    public static float sumOfTwo(float a , float b) {
        Scanner sc = new Scanner(System.in);

        // float a = sc.nextFloat();
        // float b = sc.nextFloat();

        float sum = a + b ;
        System.out.println("sum of " + a + " and " + b + " is " + sum);
        return sum;
    }

    public static float multiply(float numb1 , float num2) {
        float product = numb1 * num2 ;
return product;
    }

    

    public static void main(String[] args){

    //   sumOfTwo();
    // sumOfTwo(a:10, 0)
    
    // sumOfTwo(10, 1556120);
    sumOfTwo(10,20);

// sumOfTwo(0, 0)


    }
}


