package Problem3B;

/**
 * ************************************************************
 * Purpose/Description: <The program will calculate the number with 
 * the given power>
 * 
 * Certification: I hereby certify that this work
 * is my own and none of it is the work of any other person.
 * ************************************************************
 */
public class Power {
/**
 * The method will get the base number and the power and do the math
 * and return the final number.
 * @param x base number
 * @param n power
 * @return the final calculation
 */
    public static long exponentiation(long x, int n) {

        if (n == 0) { // base case if n is 0
            return 1;
        } else if (n == 1) { // base case if n is 1
            return x;
        }
        else{
            if(n%2 ==0){ //if the power is an even number
            return exponentiation(x*x, n/2);}
            else{ // if the power is an old number
            return x * exponentiation(x,n-1);}
        
        }
    }
/**
 * The main method will call the method with the base number and power and
 * print out the final answer
 * @param args 
 */
    public static void main(String[] args) {
        
        System.out.println("2^1 is: "+ exponentiation(2, 1)); // print
        System.out.println("2^2 is: "+ exponentiation(2, 2)); // print
        System.out.println("3^2 is: "+ exponentiation(3, 2)); // print
        System.out.println("10^2 is: "+ exponentiation(10, 2)); // print
    }

}
