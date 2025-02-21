public class Print4StarsInARow {
    public static void main(String args[]) {
        float stars = 4;
        for (int j = 0; j < 4; j++) {
            for (int i = 0; i < stars; i++) {
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}