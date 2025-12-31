public class TypePromotion {
    public static void main(String args[]) {
        char a = 'a';
        char b = 'b';
        System.out.println(b - a);

        byte c = 5;
        // byte d = c * 2; // wrong
        byte d = (byte) (c * 2);
        System.out.println(d);
    }
}
