/** 
  Calculate Fibonacci number n
  3 implementations
  @precondition: n >= 1
  
  Use type "long" instead of "int", because rabbits.
 */

public class Fib {
    /** 
      @return the nth Fibonacci number
              by implementing the recurrence relation
     */
    public static long fib_recurrence( int n) {
		 if (n==0) // decision to go to base case or recursive case
			 return 0; // base case
		 if (n == 1 ||  n == 2) // second decision to go to second base case or recursive case
			 return 1; // base case
		 return fib_recurrence(n-1) // recursive abstraction
				+  // concatenator
				fib_recurrence(n-2); //recursive abstraction
    }
     /* 
	 These are class methods because these methods are accessed
	 without instatiating a Fib variable.
    */


    /** 
      @return the nth Fibonacci number
              calculated via the 8th-grade algorithm
     */
    public static long fib_grade8( int n) {
		 return fib_grade8(1,1,n);
    }
	
	public static long fib_grade8(int first, int second, int n){
		 if (n == 0)
			 return first;
		 if (n == 1)
			 return second;
		 return fib_grade8(second, first+second, n-1);
	}
		 
    /* Time complexity:
       Consider the size of the problem to be n
       
       As the proxy for the time required, count the number of
	   times fib_grade8 is called.
       
       Then cost of the the recurrence algorithm
       grows linearly 
       as the size of the problem increases,
       because the number of times fib_grade8 is called increases 
	   by 1 everytime n increases by 1.
     */


    /** 
      @return the nth Fibonacci number
              calculated via Binet's formula.
              Type is double so that this exercise can
              ignore rounding issues.
     */
    public static double fib_Binet( int n) {
         double phi = Math.pow((1 + Math.sqrt(5))/2 , n);
		 double psi = Math.pow((1 - Math.sqrt(5))/2 , n);
		 return (phi-psi)/Math.sqrt(5);
    }
    /* Time complexity:
       Consider the size of the problem to be n
       
       As the proxy for the time required, count 
	   the number of operations done.
       
       Then cost of the the recurrence algorithm
       is constant
       as the size of the problem increases,
       because the number of computations stay
	   the same no matter what n is.
     */
}
