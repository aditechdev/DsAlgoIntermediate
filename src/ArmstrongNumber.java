import java.util.Scanner;

/**
 * Find ARMSTRONG number between 1 and given number
 * ARMSTRONG number is a number such that when each individual
<p>
 digit of the number is raised to the power of the number of digits in the number
 * <p>and then added up, they are equal to the original number itself.
 * <p>example, 153 = ( 1 * 1 * 1 ) + ( 5 * 5 * 5 ) + ( 3 * 3 * 3 ).
 */

public class ArmstrongNumber {


    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int n = sc.nextInt();

            for(int i = 1; i<= n; i++){
                int lengthOfn = calculateLength(i);

                boolean isArmStrong = checkArmStrong(i, lengthOfn);

                if(isArmStrong){
                    System.out.println(i);
                }

            }
        }
    }
    
    /**
     * This logic is used to get reverse of number
     * Which is used to detect armstrong number
     * If the number is armsstrong it will return false else it will return false
     * @param n
     * @param length
     * @return
     */
    static boolean checkArmStrong(int n,int length){
        int temp = n;
        int armNumber = 0;
        int rem = 0;
        while(temp != 0){
            rem = temp%10;
            int multiply = 1;

            for(int i = 1; i<= length; i++){
                multiply = multiply*rem;
            }
            armNumber = armNumber + multiply;
            temp = temp/10;
        }

        
        return n == armNumber;

    }
    
    /**
     * Calculate the length of number
     * @param n is the integer
     * @return length of the number
     * 
     */
    static int calculateLength(int n){
        int temp = n;
        int lengthOfNumber = 0;
        while(temp != 0){
            temp = temp /10;
            lengthOfNumber = lengthOfNumber +1;
        }
        return lengthOfNumber;
    }
}
