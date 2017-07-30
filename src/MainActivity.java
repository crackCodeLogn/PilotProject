import java.util.Scanner;

/**
 * @author Vivek
 * @version 1.0
 * @since 30-07-2017
 */
public class MainActivity {

    private static boolean isPrime(int n){
        boolean isPrime = true;
        for(int i=2;i<=(int)Math.sqrt(n);i++)
            if(n%i==0){
                isPrime = false;
                break;
            }
        return isPrime;
    }
    public static void main(String[] args) {
        System.out.println("Marking the start of something new and interesting... Let's see how this goes and how far it trickles");
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the integer : ");
        int n = in.nextInt();
        //System.out.println("The number entered : "+n);
        if(isPrime(n)) System.out.println("Prime number");
        System.out.println("Not a prime number");
    }
}
