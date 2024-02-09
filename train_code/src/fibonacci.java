import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class fibonacci {
    public static List<Integer> arrayList;
    public static void fibonacciR(int limit, int numberAfter, int numberBefore, int numberToSum){
        arrayList = new ArrayList<>();
        for(int i = 0; i < limit; i++ ){
            if ( limit > 25){
                System.out.println(numberAfter);
            }
            arrayList.add(numberAfter);
            numberBefore += numberToSum;
            numberToSum = numberAfter;
            numberAfter = numberBefore;
        }
        if(limit <= 25){
            System.out.println(arrayList);
        }
    }
    public static void main(String [] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Into to limit: ");
        int limit = scanner.nextInt();
        scanner.nextLine();
        int numberBefore = 0;
        int numberToSum = 1;
        int numberAfter = 0;
        fibonacciR(limit, numberAfter, numberBefore, numberToSum);
    }
}
