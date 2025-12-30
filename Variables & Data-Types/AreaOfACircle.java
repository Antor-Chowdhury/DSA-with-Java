import java.util.*;

public class AreaOfACircle {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        // taking radius as input
        int rad = sc.nextInt();
        float area = 3.14f * rad * rad;
        System.out.println(area);
    }
}
