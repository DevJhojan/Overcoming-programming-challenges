public class FizzBuzz {
    /*
     * Write a program that shows through the console (with a print) the
     * numbers from 1 to 100 (both included and with a line break between
     * each print), replacing the following:
     * - Multiples of 3 for the word "fizz".
     * - Multiples of 5 for the word "buzz".
     * - Multiples of 3 and 5 at the same time for the word "fizzbuzz".
     */
    public static void main(String[] args) {
        for (int i = 1; i <= 100; i++) {
           if(i%3==0 && i%5==0){
               System.out.println("fizzbuzz: "+i);
           }
           else if(i%3==0){
               System.out.println("fizz: "+i);
           }
           else if(i%5==0){
               System.out.println("buzz: " + i);
           }
           else{
               System.out.println(i);
           }
        }
    }
}