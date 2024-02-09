public class NumberPime {
    public static boolean isPrime(int number){
        if(number <= 0) return false;
        for (int i = 2; i <=Math.sqrt(number); i++){
           if(number % i == 0) return false;
        }
        return true;
    }
    public static void main(String [] args){
        for(int i=1; i < 101; i++){
            boolean isPrimeMain = isPrime(i);
            if(isPrimeMain) System.out.println("Is prime:"+i);
            else System.out.println(i);
        }
    }
}
