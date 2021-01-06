public class tugas2 {
    public static void main(String[] args) {
        int[][] arr = new int[10][];
        int x = 1;
        for(int i = 0; i < arr.length; i++){
            if (i > 4){
                arr[i] = new int[i-x];
                x += 2;
            }
            else{
                arr[i] = new int[i+1];
            }
            for(int j = 0; j < arr[i].length; j++){
                arr[i][j] = j + 1;
            }
        }
        
        for(int i = arr.length - 1; i >= 0; i--){
            for(int j = 0; j < arr[i].length; j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
