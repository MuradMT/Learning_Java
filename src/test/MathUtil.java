package test;

public class MathUtil {

    public class Task1{
        public static void find(int num,int divident) {
            for(int i=0;i<=num;i++){
                if(i%divident==0){
                    System.out.println(i);
                }
            }
        }
        public static void findby2(int num){
            find(num,2);
        }
    }
    public class Task2{
        public static void prime(int number){
            boolean x=true;
            for(int i=2;i<=number/i;i++){
                if(number%i==0){
                    x=false;
                }
            }
            System.out.println(x?"Prime":"Not Prime");
        }
    }
    public class Task3{
        //Leetcode Problem
        public static int max_consecutive_ones(int[] arr){
                int count=0;
                int max=0;
                for(int i=0;i<arr.length;i++){
                    if(arr[i]==1){
                        count++;
                        max=Math.max(max,count);
                    }
                    else{
                        count=0;
                    }
                }
                return max;
        }

    }


}
