import java.util.*;

public class Practice3 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        float item1 = sc.nextFloat();
        float item2 = sc.nextFloat();
        float item3 = sc.nextFloat();

        float total = (item1 + item2 + item3);
        System.out.println("Total bill is : " + total);

        // after adding 18% tax
        float newTotal = total + (0.18f * total);

        System.out.println("Total cost after tax is : " + newTotal);

    }
}
