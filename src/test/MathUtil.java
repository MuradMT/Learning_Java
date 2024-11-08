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

}
