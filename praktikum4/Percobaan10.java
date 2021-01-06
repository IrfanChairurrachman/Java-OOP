public class Percobaan10 {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++){
            System.out.println("i is " + i);
            if (i == 3) break;
        }
        // outer
        for (int j = 0; j < 5; j++){
            for (int k = 0; k<5; k++){
                if (k == 3) break; // not gonna printed
                System.out.println("j,k: " + j + "," + k);
            }
        }
    }
}
