public class TestPassByReference {
    public static void main(String[] args) {
        int []ages = {10, 11, 12};

        for(int i = 0; i < ages.length; i++){
            System.out.print(ages[i] + " ");
        }
        System.out.println();
        test(ages);

        for(int i = 0; i < ages.length; i++){
            System.out.print(ages[i] + " ");
        }
        System.out.println();
    }

    public static void test(int[] arr){
        // merubah nilai array
        for(int i = 0; i < arr.length; i++){
            arr[i] = i + 50;
        }
    }
}
