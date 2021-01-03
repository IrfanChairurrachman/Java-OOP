public class TesXOR {
    public static void main(String[] args) {
        boolean val1 = true;
        boolean val2 = true;
        System.out.println("True True: " + (val1 ^ val2));
        val1 = false;
        val2 = true;
        System.out.println("False True: " + (val1 ^ val2));
        val1 = false;
        val2 = false;
        System.out.println("False False: " + (val1 ^ val2));
        val1 = true;
        val2 = false;
        System.out.println("True False: " + (val1 ^ val2));
    }
}
