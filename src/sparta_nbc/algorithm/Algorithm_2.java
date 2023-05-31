package sparta_nbc.algorithm;

public class Algorithm_2 {
    public static void main(String[] args) {
        int[] array = {5,6,3,1,5};
        Algorithm_2 algorithm2 = new Algorithm_2();
        algorithm2.findMax(array);
    }

    public void findMax(int[] array) {
        int maxInt = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > maxInt) {
                maxInt = array[i];
            }
        }
        System.out.println(maxInt);
    }
}
