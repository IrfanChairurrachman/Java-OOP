public class BitDemo {
    public static void main(String[] args) {
        int bitmask = 0x000F;
        int val = 0x2222;
        System.out.println("Nilai: " + bitmask);
        System.out.println("Biner: " + Integer.toBinaryString(bitmask));
        System.out.println("Nilai: " + val);
        System.out.println("Biner: " + Integer.toBinaryString(val));
        System.out.println("val & bitmask: " + (val & bitmask));
        System.out.println("Biner: " + Integer.toBinaryString(val & bitmask));
        System.out.println("val | bitmask: " + (val | bitmask));
        System.out.println("Biner: " + Integer.toBinaryString(val | bitmask));
        System.out.println("val ^ bitmask: " + (val ^ bitmask));
        System.out.println("Biner: " + Integer.toBinaryString(val ^ bitmask));
    }
}
