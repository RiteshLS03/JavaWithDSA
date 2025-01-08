public class PalindromeString {

    // public static void checkIfPalindrome(String str){
    //     int start = 0, end = str.length() ;

    //     while(start == end){
    //         // for(star)
    //         System.out.print(true);
    //         start++;
    //         end--;
            
    //     }

    //     System.out.print(false);
    //     // System.out.print(end);
    // }

    public static boolean checkIfPalindrome(String str){

        for(int i = 0; i < str.length() / 2; i++){
            int n = str.length();
            if(str.charAt(i) != str.charAt(n-1-i)){
                // n--;
                return false;
            }
        }
        return true;
    }
    public static void main(String args[]){
        String str = "racecar";
       Boolean isIt = checkIfPalindrome(str);
       System.out.print(isIt);
    }
}
