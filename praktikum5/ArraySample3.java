public class ArraySample3 {
    public static void main(String[] args) {
        String[] hari = {"senin", "selasa", "rabu", "kamis", "jumat", "sabtu", "minggu"};
        for(byte i = 0; i < hari.length; i++){
            System.out.print(hari[i] + " ");
        }

        System.out.println("\n");

        for(String i : hari){
            System.out.print(i + " ");
        }

        System.out.println("");
    }
}
