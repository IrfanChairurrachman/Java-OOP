public class ArraySample2 {
    public static void main(String[] args) {
        int[] ages = new int[100];
        for(int i = 0; i < ages.length; i++){
            ages[i] = i * 2;
        }
        for(int i = 0; i < ages.length; i++){
            System.out.println(ages[i]);
        }
    }
}
