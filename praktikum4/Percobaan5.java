public class Percobaan5 {
    public static void main(String[] args) {
        int i;
        for(i = 0;i < 10;i++){
            System.out.print(i);
        }

        System.out.println("");

        int x = 4;
        for(int j = 10; j >= 0; j = j-2){
            System.out.println("J is " + j);
            if (j < x)
                break;
        }
        int j;
        for(i = 10, j = 0; j<i; i--, j++){
            System.out.print(i + " ");
            System.out.print(j + "\n");
        }
    }
}
