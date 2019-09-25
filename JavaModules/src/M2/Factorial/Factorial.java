/**
 * 
 */
 package M2.Factorial;
 public class Factorial {

    /**
     * This method finds the factorial of a value n. If n is in the range of 
     * 1 to 20 (inclusive) and retuns the factorial otherwise -1
     * @param n, the integer n.
     * @return factorial of n if n is in 1 to 20 (inclusive) and -1 otherwise.
     */
    public static long factorial(int n) {
        if(n<=20 && n>=0){
        long a=1;
        int i=1;
        for(i=1;i<=n;i++){
            a=a*i;
        } 
        return a;
        }
        else{
            return -1;
        }
    }

 }