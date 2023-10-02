package exercise_week6;

import java.util.Arrays;

public class Main1 {
   
    public int[] inverse(int[] arr) {
        int[] invArr = new int[arr.length];
        for (int i = 0; i < arr.length ; i++) {
            invArr[i] = arr[arr.length - 1 - i]; 
            System.out.println(arr[arr.length - 1 - i]);
        }
        return invArr;
    }

    public static void main(String[] args) {
        int[] a = {1,2,3,4,5};
        int[] result = new Main1().inverse(a);
        System.out.println(Arrays.toString(result));

    }

    public String concatString(String stringA, String stringB) {
        String result = stringA + " " + stringB;
        return result;
    }

    public int f(int a){
        if (a%2 == 1) {
            return a+a;
        } else {
            return a*a;
        }
    }
}
