import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int number;

        System.out.println("Enter a Digit to Check Whether a Number is Prime or Not");
        number = scanner.nextInt();

        if(isTheNumberIsPrime(number)) {
            System.out.println(number + " is a prime number");
        }
        else {
            System.out.println(number + " is a non-prime number");
        }
        }


        public static boolean isTheNumberIsPrime(int num){
        if(num <= 1){
            return false;
        }

            for (int i = 2; i <= num/2; i++) {
                if((num%i)==0)
                    return false;
            }
            return true;
    }
}