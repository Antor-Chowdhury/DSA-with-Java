import java.util.*;

public class TypeCasting {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        float a = 25.3553f;
        // int b = a; // not possible
        int b = (int) a;
        System.out.println(b);

        // character can be converted in number also.
        char ch = 'a';
        int number = ch;

        char ch2 = 'A';
        int number2 = ch2;

        System.out.println(number);
        System.out.println(number2);
    }
}
