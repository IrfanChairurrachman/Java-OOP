public class UnsignedRightShift {
    public static void main(String[] args) {
        int i = -1;
        System.out.println("Nilai: " + i);
        System.out.println("Biner: " + Integer.toBinaryString(i));
        i = i >>> 30;
        System.out.println("Right Shift: " + i);
        System.out.println("Biner: " + Integer.toBinaryString(i));
    }
}
