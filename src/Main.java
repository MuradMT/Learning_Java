import Exercises.*;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        //Note.C# static class forces all member to be static,
        //in java the situation is different
        var num= new Scanner(System.in).nextInt();
        for(int i=0;i<num;i++){
            if(ExerciseUtil.Task1.isPrime(i))
                System.out.println(i);
        }
        int[] arr =new int[num];
        ExerciseUtil.Task2.fillArray(arr);
        for(int i=0;i<arr.length;i++){
            if(ExerciseUtil.Task1.isPrime(arr[i])){
                System.out.println(arr[i]);
            }
        }


    }
}
