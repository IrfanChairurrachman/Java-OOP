public class Percobaan11 {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++){
            if (i == 3) continue;
            System.out.println("i is " + i);
        }
        // Outer
        for (int j = 0; j < 5; j++){
            for (int k = 0; k<5; k++){
                if (k == 3) continue; //not gonna printed
                System.out.println("j,k: " + j + "," + k);
            }
        }
    }
}
