package leetcode;

public class RotateArray {

    public static void main(String[] args) {
        int [] array = {1,2,3,4,5,6};
        int k = 2;
        //rotateArray(array, k);
        //rotateArray2(array, k);
        rotateArray3(array, k);
    }

    //solution1 - intermediate array
    private static void rotateArray(int[] array, int k) {
        if (k > array.length){
            k = k % array.length;
        }
        int[] result = new int[array.length];
        for (int i = 0; i < k; i++){
            result[i] = array[array.length - k + i];
        }

        int j = 0;
        for (int i = k; i < array.length; i++){
            result[i] = array[j];
            j++;
        }

        System.arraycopy(result, 0, array, 0, array.length);


        for (int i: result){
            System.out.println("First values" + i);
        }
    }

    //solution2 - bubble rotate
    private static void rotateArray2(int[] array, int k) {

        if (array == null || k < 0){
            throw new IllegalArgumentException("Illegal argument!");
        }


        for (int i = 0; i < k; i++){
            for (int j = array.length - 1; j > 0; j--){
                int temp = array[j];
                array[j] = array[j-1];
                array[j-1] = temp;
            }
        }

        for (int i: array){
            System.out.println("new values" + i);
        }

    }

    //solution3 - Reversal
    private static void rotateArray3(int[] array, int k) {
        k = k % array.length;
        if (array == null || k < 0){
            throw new IllegalArgumentException("Illegal argument");
        }

        int a = array.length - k;

        reverse(array, 0 , a - 1);
        reverse(array, a , array.length - 1);
        reverse(array, 0 , array.length - 1);
    }

    private static void reverse(int[] array, int left, int right) {
        if (array == null || array.length == 1){
            return;
        }

        while(left < right){
            int temp = array[left];
            array[left] = array[right];
            array[right] = temp;
            left++;
            right--;
        }
    }

}
