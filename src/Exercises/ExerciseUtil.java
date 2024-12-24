package Exercises;

import java.util.Scanner;

public  class ExerciseUtil {
    public static class Task1{
        public static boolean isPrime(int n) {
            if (n <= 1) return false;
            for (int i = 2; i * i <= n; i++) {
                if (n % i == 0) return false;
            }
            return true;
        }


    }
    public static class Task2{
        public static void fillArray(int[] arr) {
               int size=arr.length;
               var sc=new Scanner(System.in);
               for(int i=0;i<size;i++){
                   arr[i]=sc.nextInt();
               }
        }
    }
}
