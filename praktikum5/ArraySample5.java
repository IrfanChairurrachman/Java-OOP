public class ArraySample5 {
    public static void main(String[] args) {
        int[][] arr = new int[10][];
        for(int i = arr.length - 1; i > 0; i--){
            arr[i] = new int[i];
            for(int j = 0; j < arr[i].length; j++){
                arr[i][j] = j;
            }
        }
        for(int i = arr.length - 1; i > 0; i--){
            for(int j = 0; j < arr[i].length; j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("Setelah diperbaiki: ");

        for(int i = arr.length - 1; i > 0; i--){
            for(int j = 0; j < arr[i].length; j++){
                System.out.print((arr[i][j] + 1) + " ");
            }
            System.out.println();
        }
    }
}
