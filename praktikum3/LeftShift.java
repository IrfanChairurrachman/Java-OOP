public class LeftShift {
    public static void main(String[] args) {
        int i = 3;
        System.out.println("Nilai: " + i);
        System.out.println("Biner: " + Integer.toBinaryString(i));
        i = i << 2;
        System.out.println("Right Shift: " + i);
        System.out.println("Biner: " + Integer.toBinaryString(i));
    }
}
