import java.util.*;

public class AreaOfCircle {
    public static void main(String args[]) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter the radius of the circle:");
        int r = scn.nextInt();
        float areaOfCircle = (float) (3.14 * (r * r));
        System.out.println("Area of circle with radius " + areaOfCircle);
    }
}
